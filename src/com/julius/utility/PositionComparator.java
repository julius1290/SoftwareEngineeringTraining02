package com.julius.utility;

import com.julius.field.IPosition;

import java.util.Comparator;

public class PositionComparator<Position> implements Comparator<IPosition> {

    public int compare(IPosition pos1, IPosition pos2) {
            if (pos1.getXPos() == pos2.getXPos()) {
                return pos1.getYPos() - pos2.getYPos();
            } else {
                return pos1.getXPos() - pos2.getXPos();
            }
        }

}
