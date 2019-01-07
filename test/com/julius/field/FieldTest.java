package com.julius.field;

import com.julius.drone.Drone;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void test() {
        IField f = new Field();
        Drone d = new Drone(f);
        d.generateWheatPositions();
        System.out.println("Das wars");
    }

}