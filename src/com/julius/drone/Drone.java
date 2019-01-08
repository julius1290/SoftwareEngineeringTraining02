package com.julius.drone;

import com.julius.field.IField;
import com.julius.field.IPosition;
import com.julius.field.IWheat;
import com.julius.field.Position;

import java.util.Map;

public class Drone implements IDrone{
    private IField field;
    private Map<Integer, IWheat> wheatMap;

    public Drone(IField field) {
        this.field = field;
    }

    @Override
    public void generateWheatPositions() {
        int count =0;
        int[][] fieldArray = field.getCornField();
        this.wheatMap = field.getWheatMap();
        for (int i = 0; i <= fieldArray.length; i++) {
            for (int j = 0; j<= fieldArray.length; j++) {
                IWheat wheat = wheatMap.get(count);
                IPosition position = new Position(i,j);
                wheat.setPosition(position);
                System.out.println(wheat.getPosition().getXPos() + " " + wheat.getPosition().getYPos() + " Number of Grains: " + wheat.getNumberOfGrains());
                count++;
            }
        }
    }

    public Map<Integer, IWheat> getWheatMap(){
        return wheatMap;
    }
}
