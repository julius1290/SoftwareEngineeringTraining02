package com.julius.harvester;

public class Harvester implements IHarvester{

    private ICuttingSystem cuttingSystem;
    private IChassis chassis;


    public Harvester(ICuttingSystem cuttingSystem, IChassis chassis){
        this.cuttingSystem = cuttingSystem;
        this.chassis = chassis;
    }

    public IChassis getChassis() {
        return chassis;
    }
}
