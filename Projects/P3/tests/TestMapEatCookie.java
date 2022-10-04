import java.io.*;
import junit.framework.*;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    NoFrame frame = new NoFrame();

    Location newLoc = new Location(2, 2);
    PacMan character = frame.addPacMan(newLoc);
    assertTrue(frame.getMap().eatCookie("character") == null);
  }
}
