import java.awt.*;
import java.io.*;
import junit.framework.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestMapGetLoc extends TestCase {

  public void testMapGetLoc() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map myMap = frame.getMap();

    // Sets ghost and pacman locations respectively
    frame.addGhost(new Location(1,1), "Bhoot", Color.red);
    frame.addPacMan(new Location(2,2));

    // Checks if (1,1) location has GHOST but not PACMAN
    assertTrue(myMap.getLoc(new Location (1,1)).contains(Map.Type.GHOST));
    assertFalse(myMap.getLoc(new Location (1,1)).contains(Map.Type.PACMAN));

    // Checks if (2,2) location has PACMAN but not GHOST
    assertTrue(myMap.getLoc(new Location (2,2)).contains(Map.Type.PACMAN));
    assertFalse(myMap.getLoc(new Location (2,2)).contains(Map.Type.GHOST));

  }
}
