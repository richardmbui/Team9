import java.io.*;
import junit.framework.*;

public class TestConsume extends TestCase {

  public void testConsume() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(2, 1));

    // Makes all players and begins game
    frame.initPlayers();
    frame.startGame();

    // Tests if the Cookie exists in (2,1)
    assertTrue(frame.getMap().getLoc(new Location(2, 1)).contains(Map.Type.COOKIE));
    pacman.consume();

    // Tests if the Cookie is successfully consumed
    assertFalse(frame.getMap().getLoc(new Location(2, 1)).contains(Map.Type.COOKIE));
  }
}
