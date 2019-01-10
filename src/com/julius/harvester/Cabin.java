package com.julius.harvester;

import com.julius.drone.IDrone;

public class Cabin implements ICabin {
    boolean isOccupied;
    private IBoardComputer boardComputer;
    private IDriver driver;

    public Cabin(IBoardComputer boardComputer, IDriver driver){
        isOccupied = false;
        this.boardComputer = boardComputer;
        this.driver = driver;
    }

    public IBoardComputer getBoardComputer(){
        return boardComputer;
    }
}
