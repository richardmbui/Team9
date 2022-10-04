import java.io.*;
import junit.framework.*;

public class TestAttack extends TestCase {

  public void testAttack() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens w/o a Display

    //Creating Players
    Ghost ghost = frame.addGhost(new Location(9, 11), "ghosty", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(9, 10)); //Creates PacMan at location x, y

    assertTrue(ghost.attack());
  }
}
