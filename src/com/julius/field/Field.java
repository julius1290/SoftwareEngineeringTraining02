package com.julius.field;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Field {

    private int[][] cornField;
    private Map<Integer,IWheat> wheatMap = new HashMap<>();

    Field(){
        cornField = new int[10000][10000];
        initalizeField();
    }

    private void initalizeField() {
        for (int count = 0; count <= cornField.length * cornField.length; count++) {
            IWheat wheat =  new Wheat();
            wheatMap.put(count, wheat);
            System.out.println(count);
        }
    }
}