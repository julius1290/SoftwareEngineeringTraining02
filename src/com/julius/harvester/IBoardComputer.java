package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public interface IBoardComputer {
    HashMap<Integer, IPosition> generateGrainPositionHashMap(Map<Integer, IWheat> numberedWheatHashMap);
    TreeMap generateTreeMapFromHashMap(HashMap<Integer, IPosition> wheatPositionHashMap);
    void printTreeMap(TreeMap<Integer, IPosition> wheatPositionTreeMap);
}
