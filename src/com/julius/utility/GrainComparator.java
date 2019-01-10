package com.julius.utility;

import java.util.Comparator;

public class GrainComparator<Integer> implements Comparator<Integer> {

    @Override
    public int compare(Integer grain1, Integer grain2) {
        return (int) grain2 - (int) grain1;
    }

}
