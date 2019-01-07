package com.julius.harvester;

public class CuttingSystem implements ICuttingSystem{
    private int length;
    private int width;

    CuttingSystem(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void cutCorn(int amountOfWheat) {
        System.out.println("A total of " + amountOfWheat + " wheats have been harvested.");
    }
}
