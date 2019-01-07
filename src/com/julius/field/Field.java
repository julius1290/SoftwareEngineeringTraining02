package com.julius.field;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Field implements IField{

    private int[][] cornField;
    private Map<Integer,IWheat> wheatMap = new HashMap<>();

    Field(){
        cornField = new int[1000][1000];
        initalizeField();
    }

    private void initalizeField() {
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
    public Map<Integer,IWheat> getwheatMap() {
        return wheatMap;
    }
}