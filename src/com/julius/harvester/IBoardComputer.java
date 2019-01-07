package com.julius.harvester;

import com.julius.field.IPosition;
import com.julius.field.IWheat;

import java.util.HashMap;
import java.util.TreeMap;

public interface IBoardComputer {
    TreeMap getTreeMapFromHashMap(HashMap<IWheat, IPosition> wheatPositionHashMap);
    void printTreeMap(TreeMap<IWheat, IPosition> wheatPositionTreeMap);
}
