package com.julius.harvester;

public class Driver implements IDriver{

    int driverID;
    boolean isBusy;

    @Override
    public void getInCabin(Cabin cabin) {
        isBusy = true;
        cabin.isOccupied = true;
    }

    @Override
    public void leaveCabin(Cabin cabin) {
        isBusy = false;
        cabin.isOccupied = false;
    }
}
