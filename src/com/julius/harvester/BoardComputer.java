package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BoardComputer implements IBoardComputer{

    private HashMap<IPosition, Integer> grainPositionHashMap;

    @SuppressWarnings("unchecked")
    public BoardComputer(){
        grainPositionHashMap = new HashMap<>();
    }

    @Override
    public HashMap<IPosition, Integer> generateGrainPositionHashMap(Map<Integer, IWheat> numberedWheatHashMap){
        for (Map.Entry<Integer, IWheat> element: numberedWheatHashMap.entrySet()) {
            grainPositionHashMap.put(element.getValue().getPosition(), element.getValue().getNumberOfGrains());
        }
        return grainPositionHashMap;
    }

    @Override
    public TreeMap<IPosition, Integer> generateTreeMapFromHashMap(TreeMap<IPosition, Integer> sortedTreeMap, HashMap<IPosition, Integer> grainPositionHashMap){
        sortedTreeMap.putAll(grainPositionHashMap);
        return sortedTreeMap;
    }


    @Override
    public void printTreeMap(TreeMap<IPosition, Integer> sortedTreeMap){
        sortedTreeMap.forEach((key, value) -> System.out.println("Wheat on position: " + key.getXPos() + " " + key.getYPos() + " has " + value + " grains."));
    }
}
