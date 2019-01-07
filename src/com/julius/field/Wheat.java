package com.julius.field;

import java.util.concurrent.ThreadLocalRandom;

class Wheat implements IWheat {
    private int numberOfGrains;
    Position position;

    Wheat() {
      this.numberOfGrains = ThreadLocalRandom.current().nextInt(100,500);
    }
}
