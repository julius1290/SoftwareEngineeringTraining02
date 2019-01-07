package com.julius.utility;

import com.julius.field.IWheat;

import java.util.Comparator;

public class WheatComparator implements Comparator<IWheat> {
    @Override
    public int compare(IWheat firstWheat, IWheat secondWheat) {
        if(firstWheat.getNumberOfGrains() == (secondWheat.getNumberOfGrains())){
            return 0;
        }
        return 0;
    }
}
