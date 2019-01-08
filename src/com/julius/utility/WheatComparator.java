package com.julius.utility;

import com.julius.field.IWheat;

import java.util.Comparator;

public class WheatComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer firstWheat, Integer secondWheat) {
        if(firstWheat.equals(secondWheat)){
            return firstWheat;
        }
        return 0;
    }
}
