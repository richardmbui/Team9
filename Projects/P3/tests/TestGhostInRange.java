import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame(); 
    Ghost ghost = frame.addGhost(new Location(5, 5), "name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(6, 5));

    assertTrue(pacman.is_ghost_in_range() == true);
  }
}
