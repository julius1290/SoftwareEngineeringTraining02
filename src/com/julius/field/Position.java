package com.julius.field;

 public class Position implements IPosition{

    private int xPos;
    private int yPos;

    public Position(int xPos, int yPos)
    {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public int getXPos() {
        return xPos;
    }

    @Override
    public int getYPos() {
        return yPos;
    }

}
