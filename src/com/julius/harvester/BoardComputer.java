package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;
import com.julius.utility.PositionComparator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BoardComputer implements IBoardComputer{

    private HashMap<IPosition, Integer> grainPositionHashMap;
    private TreeMap<IPosition, Integer> positionSortedTreeMap;

    public BoardComputer(){
        grainPositionHashMap = new HashMap<>();
        positionSortedTreeMap = new TreeMap<>(new PositionComparator());
    }

    @Override
    public HashMap<IPosition, Integer> generateGrainPositionHashMap(Map<Integer, IWheat> numberedWheatHashMap){
        for (Map.Entry<Integer, IWheat> element: numberedWheatHashMap.entrySet()) {
            grainPositionHashMap.put(element.getValue().getPosition(), element.getValue().getNumberOfGrains());
        }
        return grainPositionHashMap;
    }

    @Override
    public TreeMap<IPosition, Integer> generateTreeMapFromHashMap(HashMap<IPosition, Integer> grainPositionHashMap){
        positionSortedTreeMap.putAll(grainPositionHashMap);
        return positionSortedTreeMap;
    }


    @Override
    public void printTreeMap(TreeMap<IPosition, Integer> wheatPositionTreeMap){
        wheatPositionTreeMap.forEach((key, value) -> System.out.println("Wheat on position: " + key.getXPos() + " " + key.getYPos() + " has " + value + " grains."));
    }
}
