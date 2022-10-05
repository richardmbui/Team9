import java.io.*;
import junit.framework.*;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    PacMan test_pacman = frame.addPacMan(new Location(1, 1));

    assertTrue(test_pacman.move());

    Location loc1 = new Location(1,2);
    Location loc2 = new Location(2,1);

    assertTrue(test_pacman.myLoc.equals(loc1) || test_pacman.myLoc.equals(loc2));
  }
}
