import java.io.*;
import junit.framework.*;
import java.util.ArrayList;
import java.awt.Color;

public class TestGhostValidMoves extends TestCase {

  public void testGhostValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Map map = frame.getMap();
    ArrayList<Location> valid_moves = new ArrayList<Location>();
    valid_moves.add(new Location(1,2));
    valid_moves.add(new Location(2,1))

    Ghost ghost = frame.addGhost(new Location(1,1), "Pinky", Color.pink);
    assertTrue(ghost.get_valid_moves(new Location(1,1).equals(valid_moves));
  }
}
