package com.julius.field;

import java.util.concurrent.ThreadLocalRandom;

class Wheat implements IWheat {
    private int numberOfGrains;
    IPosition position;

    Wheat() {
      this.numberOfGrains = ThreadLocalRandom.current().nextInt(100,500);
    }

    public IPosition getPosition() {
        return position;
    }

    public void setPosition (IPosition position) {
        this.position = position;
    }

    public int getNumberOfGrains() {
        return numberOfGrains;
    }
}
