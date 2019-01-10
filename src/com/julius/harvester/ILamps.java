package com.julius.harvester;

public interface ILamps {

    void turnOn();
    void turnOff();
    boolean getIsLampOn();
    LampType getLampType();
    int getBrightness();
}
