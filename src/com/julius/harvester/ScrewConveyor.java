package com.julius.harvester;
import java.math.*;

class ScrewConveyor implements IScrewConveyor {

    private int length;
    private int radius;
    private double volume;
    private boolean isWorking;

    ScrewConveyor (int length, int radius) {
        this.length = length;
        this.radius = radius;
        isWorking = false;
        this.volume = Math.PI * Math.pow(radius, 2) * length;
    }


    @Override
    public void turnOn(){

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void transportCorn() {

    }
}
