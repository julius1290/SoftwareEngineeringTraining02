package com.julius;

import com.julius.drone.Drone;
import com.julius.field.Field;
import com.julius.field.IField;
import com.julius.field.IPosition;
import com.julius.harvester.*;
import com.julius.utility.GrainComparator;
import com.julius.utility.PositionComparator;
import com.julius.utility.ValueSorter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Application {


    public static void main(String[] args) {

        //Setup
        IHarvester määääähdrescher = setupHarvester();
        IBoardComputer boardComputer = määääähdrescher.getChassis().getCabin().getBoardComputer();
        IField field = new Field();
        Drone drone = new Drone(field);
        ValueSorter valueSorter = new ValueSorter();
        //Map sorted by positions, using a PositionComparator
        TreeMap<IPosition, Integer> positionSortedTreeMap = new TreeMap<>(new PositionComparator());

        //Create the unsorted map containing IPosition and the number of grains as Integer
        drone.generateWheatPositions();
        HashMap<IPosition, Integer> computerGeneratedHashMap = boardComputer.generateGrainPositionHashMap(drone.getWheatMap());

        //Create and print the Map sorted by position (x-axis, then y-axis) - key sorted
        System.out.println("Map sorted by position:");
        boardComputer.generateTreeMapFromHashMap(positionSortedTreeMap, computerGeneratedHashMap);
        boardComputer.printMap(positionSortedTreeMap);

        //Create and print the Map sorted by number of grains - value sorted, allowing duplicates
        System.out.println("Map sorted by grains:");
        HashMap<IPosition, Integer> grainSortedMap = valueSorter.sortMapByGrains(computerGeneratedHashMap);
        boardComputer.printMap(grainSortedMap);

        //This is the originally intended method to sort by values, using a comparator.
        //The comparator is correctly implemented, it just does not work on a value sorted TreeMap.
        //TreeMap<IPosition, Integer> grainSortedTreeMap = new TreeMap<>(new GrainComparator<>());
        //boardComputer.generateTreeMapFromHashMap(grainSortedTreeMap, computerGeneratedHashMap);
        //boardComputer.printMap(grainSortedMap);
    }

    private static IHarvester setupHarvester() {
        IBoardComputer boardComputer = new BoardComputer();
        IDriver driver = new Driver(1);
        ICabin cabin = new Cabin(boardComputer, driver);
        ArrayList<ILamps> lamps = new ArrayList<>();
        ArrayList<IWheel> wheels = new ArrayList<>();
        IScrewConveyor screwConveyor = new ScrewConveyor(25,10);
        IFilter filter = new Filter(20);
        ICornTank cornTank = new CornTank(100,0);
        IEngine engine = new Engine();
        IChassis chassis = new Chassis(engine, cornTank, screwConveyor, filter, wheels, lamps, cabin);
        ICuttingSystem cuttingSystem = new CuttingSystem(10,20);
        return new Harvester(cuttingSystem, chassis);
    }

}
