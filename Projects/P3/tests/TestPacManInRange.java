import java.io.*;
import junit.framework.*;
import java.awt.Color;


public class TestPacManInRange extends TestCase {

  public void testPacManInRange() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(5, 6), "name", Color.red); //Creates a red ghost named "name" at location x,y

    PacMan pacman = frame.addPacMan(new Location(6, 6)); 

    assertTrue(ghost.is_pacman_in_range()== true);
  }
  


}
