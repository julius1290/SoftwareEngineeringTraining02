package com.julius.drone;

import com.julius.field.IWheat;

import java.util.HashMap;

public interface IDrone {
    void generateWheatPositions(HashMap<Integer, IWheat> wheatMap);
}
