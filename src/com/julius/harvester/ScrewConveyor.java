package com.julius.harvester;
import java.math.*;

public class ScrewConveyor implements IScrewConveyor {

    private int length;
    private int radius;
    private double volume;
    private boolean isWorking;

    public ScrewConveyor (int length, int radius) {
        this.length = length;
        this.radius = radius;
        isWorking = false;
        this.volume = Math.PI * Math.pow(radius, 2) * length;
    }

    @Override
    public void turnOn(){
        isWorking = true;
        System.out.println("The screw conveyor is now turned on.");
    }

    @Override
    public void turnOff() {
        isWorking = false;
        System.out.println("The screw conveyor is now turned off.");
    }

    @Override
    public void transportCorn() {

    }

    @Override
    public boolean isWorking() {
        return isWorking;
    }
}
