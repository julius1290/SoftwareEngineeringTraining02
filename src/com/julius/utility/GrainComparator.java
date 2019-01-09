package com.julius.utility;

import java.util.Comparator;

public class GrainComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer grain1, Integer grain2) {
        if(grain1.equals(grain2)){
            return grain2 - grain1;
        }
        else{
            return grain1 - grain2;
        }
    }
}
