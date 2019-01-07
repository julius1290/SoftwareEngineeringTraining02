package com.julius.harvester;


public class Lamp implements ILamps{

    private boolean isOn;
    private LampType lampType;
    private int brightness;

    Lamp(LampType lampType, int brightness){
        this.lampType = lampType;
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("The lamp is now turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("The lamp has been turned off.");
    }

    @Override
    public boolean getIsLampOn() {
        return isOn;
    }

    @Override
    public LampType getLampType() {
        return lampType;
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

}
