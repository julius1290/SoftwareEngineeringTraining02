package com.julius.harvester;

interface ILamps {

    void turnOn();
    void turnOff();
    boolean getIsLampOn();
    LampType getLampType();
    int getBrightness();
}
