package com.julius.harvester;

public class Engine implements IEngine{

    boolean isOn;

    @Override
    public void start() {
        isOn = true;
        System.out.println("The engine is ready.");
    }

    @Override
    public void stop() {
        isOn = false;
        System.out.println("The engine has stopped.");
    }
}
