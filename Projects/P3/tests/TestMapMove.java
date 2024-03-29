import java.io.*;
import junit.framework.*;
import java.util.HashMap;
import java.util.HashSet;
import java.awt.Color;

public class TestMapMove extends TestCase {

  public void testMapMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    PacMan pacman = frame.addPacMan(new Location(1,1));
    // Ghost ghost = frame.addGhost(new Location(23,1), "Pinky", Color.pink);
    Location loc = new Location(1,2);
    HashSet<Map.Type> type = new HashSet<Map.Type>();
    type.add(Map.Type.PACMAN);

    assertTrue(map.move("pacman", new Location (1,2), Map.Type.PACMAN));
    assertTrue(map.getLoc(loc).equals(type));
  }
}
