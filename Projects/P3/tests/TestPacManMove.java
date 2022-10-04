import java.io.*;
import junit.framework.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    PacMan test_pacman = frame.addPacMan(new Location(9, 10));

    assertTrue(test_pacman.myLoc.equals(new Location(10, 10)));

    assertTrue(test_pacman.move());
  }
}
