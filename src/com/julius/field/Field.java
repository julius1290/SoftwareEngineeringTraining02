package com.julius.field;

import java.util.HashMap;
import java.util.Map;

public class Field implements IField{

    private int[][] cornField;
    private Map<Integer,IWheat> wheatMap = new HashMap<>();

    public Field(){
        //TODO set back to 1000x1000
        cornField = new int[100][100];
        initializeField();
    }

    private void initializeField() {
        int count = 0;
        for (int i = 0; i <= cornField.length; i++){
            for (int j = 0; j <= cornField.length; j++){
                IWheat wheat =  new Wheat();
                wheatMap.put(count, wheat);
                System.out.println(count);
                count++;
            }
        }
    }

    @Override
    public int[][] getCornField() {
        return cornField;
    }

    @Override
    public Map<Integer,IWheat> getWheatMap() {
        return wheatMap;
    }
}