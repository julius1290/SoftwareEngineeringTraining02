package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;

import java.util.HashMap;
import java.util.TreeMap;

public interface IBoardComputer {
    HashMap<Integer, IPosition> generateGrainPositionHashMap(HashMap<java.lang.Integer, IWheat> numberedWheatHashMap);
    TreeMap generateTreeMapFromHashMap(HashMap<Integer, IPosition> wheatPositionHashMap);
    void printTreeMap(TreeMap<Integer, IPosition> wheatPositionTreeMap);
}
