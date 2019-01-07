package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;

import java.util.HashMap;
import java.util.TreeMap;

public class BoardComputer implements IBoardComputer{

    private HashMap<Integer, IPosition> grainPositionHashMap;
    private TreeMap<Integer, IPosition> grainPositionTreeMap;

    @Override
    public HashMap<Integer, IPosition> generateGrainPositionHashMap(HashMap<Integer, IWheat> numberedWheatHashMap){
        numberedWheatHashMap.forEach((key, value) -> grainPositionHashMap.put(value.getNumberOfGrains(), value.getPosition()));
        return grainPositionHashMap;
    }

    @Override
    public TreeMap<Integer, IPosition> generateTreeMapFromHashMap(HashMap<Integer, IPosition> grainPositionHashMap){
        grainPositionTreeMap.putAll(grainPositionHashMap);
        return grainPositionTreeMap;
    }

    @Override
    public void printTreeMap(TreeMap<Integer, IPosition> wheatPositionTreeMap){
        wheatPositionTreeMap.forEach((key, value) -> System.out.println("Number of grains in this wheat: " + key + " with position: " + value));
    }
}
