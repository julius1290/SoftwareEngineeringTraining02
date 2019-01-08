package harvest;

import com.julius.drone.Drone;
import com.julius.field.Field;
import com.julius.field.IField;
import com.julius.field.IPosition;
import com.julius.harvester.BoardComputer;
import com.julius.harvester.IBoardComputer;
import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;

public class BoardComputerTest {

    @Test
    public void test(){
        IField f = new Field();
        Drone d = new Drone(f);
        IBoardComputer boardComputer = new BoardComputer();
        d.generateWheatPositions();
        HashMap<Integer, IPosition> computerGeneratedHashMap = boardComputer.generateGrainPositionHashMap(d.getWheatMap());
        TreeMap<Integer, IPosition> computerGeneratedTreeMap = boardComputer.generateTreeMapFromHashMap(computerGeneratedHashMap);
        boardComputer.printTreeMap(computerGeneratedTreeMap);
    }

}
