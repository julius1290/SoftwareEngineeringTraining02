package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;

import java.util.HashMap;
import java.util.TreeMap;

public class BoardComputer implements IBoardComputer{

    private TreeMap<IWheat, IPosition> wheatPositionTreeMap;

    @Override
    public TreeMap getTreeMapFromHashMap(HashMap<IWheat, IPosition> wheatPositionHashMap) {
        wheatPositionTreeMap.putAll(wheatPositionHashMap);
        return wheatPositionTreeMap;
    }

    @Override
    public void printTreeMap(TreeMap<IWheat, IPosition> wheatPositionTreeMap){
        wheatPositionTreeMap.forEach((key, value) -> System.out.println("Number of grains in this wheat: " + key + " with position: " + value));
    }
}
