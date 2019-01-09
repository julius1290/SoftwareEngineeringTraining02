package harvest;

import com.julius.drone.Drone;
import com.julius.field.Field;
import com.julius.field.IField;
import com.julius.field.IPosition;
import com.julius.harvester.BoardComputer;
import com.julius.harvester.IBoardComputer;
import com.julius.utility.GrainComparator;
import com.julius.utility.PositionComparator;
import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;

public class BoardComputerTest {

    @Test
    public void test(){
        IField f = new Field();
        Drone d = new Drone(f);
        IBoardComputer boardComputer = new BoardComputer();

        TreeMap<IPosition, Integer> positionSortedTreeMap = new TreeMap<>(new PositionComparator());
        TreeMap<IPosition, Integer> grainSortedTreeMap = new TreeMap<>(new GrainComparator());

        d.generateWheatPositions();
        HashMap<IPosition, Integer> computerGeneratedHashMap = boardComputer.generateGrainPositionHashMap(d.getWheatMap());
        boardComputer.generateTreeMapFromHashMap(positionSortedTreeMap, computerGeneratedHashMap);
        boardComputer.printTreeMap(positionSortedTreeMap);
        boardComputer.generateTreeMapFromHashMap(grainSortedTreeMap, computerGeneratedHashMap);
        boardComputer.printTreeMap(grainSortedTreeMap);
    }

}
