import java.io.*;
import junit.framework.*;
import java.util.ArrayList;


public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    ArrayList<Location> valid_moves = new ArrayList<Location>();
    valid_moves.add(new Location(1,2));
    valid_moves.add(new Location(2,1));

    PacMan pacman = frame.addPacMan(new Location(1,1));
    assertTrue(pacman.get_valid_moves().equals(valid_moves));
  }
}

