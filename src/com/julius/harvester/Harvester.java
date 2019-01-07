package com.julius.harvester;

public class Harvester {

    private ICuttingSystem cuttingSystem;
    private IChassis chassis;

    Harvester(ICuttingSystem cuttingSystem, IChassis chassis){
        this.cuttingSystem = cuttingSystem;
        this.chassis = chassis;
    }
}
