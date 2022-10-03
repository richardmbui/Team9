import java.io.*;
import junit.framework.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

  public void testPacManMove() throws FileNotFoundException {
    Mainframe frame = new MainFrame();

    PacMan test_pacman = frame.addPacMan(new Location(9, 10));

    /* currently, get_valid_moves() is null */
    assertFalse(test_pacman.move());
  }
}
