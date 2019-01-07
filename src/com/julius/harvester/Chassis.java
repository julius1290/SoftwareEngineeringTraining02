package com.julius.harvester;

import java.util.ArrayList;

public class Chassis implements IChassis{
    IEngine engine;
    ICornTank cornTank;
    IScrewConveyor screwConveyor;
    IFilter filter;
    ArrayList<IWheel> wheels;
    ArrayList<ILamps> lamps;
    ICabin cabin;

    Chassis(IEngine engine, ICornTank cornTank, IScrewConveyor screwConveyor, IFilter filter, ArrayList<IWheel> wheels, ArrayList<ILamps> lamps, ICabin cabin){
        this.engine = engine;
        this.cornTank = cornTank;
        this.screwConveyor = screwConveyor;
        this.filter = filter;
        this.wheels = wheels;
        this.lamps = lamps;
        this.cabin = cabin;
    }
}
