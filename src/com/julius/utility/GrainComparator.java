package com.julius.utility;

import java.util.Comparator;

public class GrainComparator<Integer> implements Comparator<Integer> {

    @Override
    public int compare(Integer grain1, Integer grain2) {
        //return grain1.compareTo(grain2);
        int a = java.lang.Integer.parseInt(grain1.toString());
        int b = java.lang.Integer.parseInt(grain2.toString());

        return b - a;
    }

}
