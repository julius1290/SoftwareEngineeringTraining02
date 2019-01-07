package com.julius.harvester;

public class Harvester {

    ICuttingSystem cuttingSystem;
    IChassis chassis;

    Harvester(ICuttingSystem cuttingSystem, IChassis chassis){
        this.cuttingSystem = cuttingSystem;
        this.chassis = chassis;
    }
}
