package com.julius.harvester;

public class Driver implements IDriver{

    private int driverID;
    private boolean isBusy;

    Driver(int driverID){
        this.driverID = driverID;
        isBusy = false;
    }

    @Override
    public void getInCabin(Cabin cabin) {
        isBusy = true;
        cabin.isOccupied = true;
        System.out.println("The driver with the ID " + driverID + " entered the cabin.");
    }

    @Override
    public void leaveCabin(Cabin cabin) {
        isBusy = false;
        cabin.isOccupied = false;
        System.out.println("The driver with the ID " + driverID + " left the cabin.");
    }
}
