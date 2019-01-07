package com.julius.harvester;

public class CornTank implements ICornTank{

    int maximumVolume;
    int fillLevel;

    CornTank(int maximumVolume, int fillLevel){
        this.maximumVolume = maximumVolume;
        this.fillLevel = fillLevel;
    }

    @Override
    public void fillCorn(int amountOfCorn) {
        if(checkIfFull()){
            System.out.println("The CornTank is full. Please empty it before adding more corn.");
        }
        else{
            fillLevel = fillLevel + amountOfCorn;
        }
    }

    @Override
    public void emptyCorn() {
        fillLevel = 0;
    }

    @Override
    public boolean checkIfFull() {
        return fillLevel == maximumVolume;
    }
}
