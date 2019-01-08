package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BoardComputer implements IBoardComputer{

    private HashMap<Integer, IPosition> grainPositionHashMap;
    private TreeMap<Integer, IPosition> grainPositionTreeMap;

    public BoardComputer(){
        grainPositionHashMap = new HashMap<>();
        grainPositionTreeMap = new TreeMap<>();
    }

    @Override
    //right amount till here
    public HashMap<Integer, IPosition> generateGrainPositionHashMap(Map<Integer, IWheat> numberedWheatHashMap){
        for (Map.Entry<Integer, IWheat> element: numberedWheatHashMap.entrySet()) {
            grainPositionHashMap.put(element.getValue().getNumberOfGrains(), element.getValue().getPosition());
        }
        return grainPositionHashMap;
    }

    @Override
    //Is already sorted by key, use comparator to s
    public TreeMap<Integer, IPosition> generateTreeMapFromHashMap(HashMap<Integer, IPosition> grainPositionHashMap){
        grainPositionTreeMap.putAll(grainPositionHashMap);
        return grainPositionTreeMap;
    }

    @Override
    public void printTreeMap(TreeMap<Integer, IPosition> wheatPositionTreeMap){
        //wheatPositionTreeMap.forEach((key, value) -> System.out.println("Number of grains in this wheat: " + key + " with position: " + value.getXPos() + " " + value.getYPos()));
        int count = 0;
        for (Map.Entry<Integer, IPosition> element: wheatPositionTreeMap.entrySet()) {
            System.out.println("Number of grains in this wheat: " + element.getKey() + " with position: " + element.getValue().getXPos() + " " + element.getValue().getYPos());
            count ++;
            System.out.println(count);
        }
    }
}
