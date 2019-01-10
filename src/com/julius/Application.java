package com.julius;

import com.julius.field.IField;
import com.julius.harvester.*;

import java.util.ArrayList;

public class Application {


    public static void main(String[] args) {
        setup();

    }

    private static void setup() {
        IBoardComputer boardComputer = new BoardComputer();
        IDriver driver = new Driver(01);
        ICabin cabin = new Cabin(boardComputer, driver);
        ArrayList<ILamps> lamps = new ArrayList<>();
        ArrayList<IWheel> wheels = new ArrayList<>();
        IScrewConveyor screwConveyor = new ScrewConveyor(25,10);
        IFilter filter = new Filter(20);
        ICornTank cornTank = new CornTank(100,0);
        IEngine engine = new Engine();
        IChassis chassis = new Chassis(engine, cornTank, screwConveyor, filter, wheels, lamps, cabin);
        ICuttingSystem cuttingSystem = new CuttingSystem(10,20);
        IHarvester määääähdrescher = new Harvester(cuttingSystem, chassis);


    }

}
