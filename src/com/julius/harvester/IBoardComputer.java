package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public interface IBoardComputer {
    HashMap<IPosition, Integer> generateGrainPositionHashMap(Map<Integer, IWheat> numberedWheatHashMap);
    TreeMap generateTreeMapFromHashMap(TreeMap<IPosition, Integer> sortedTreeMap, HashMap<IPosition, Integer> wheatPositionHashMap);
    void printMap(Map<IPosition, Integer> wheatPositionTreeMap);
}
