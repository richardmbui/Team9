import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens w/o a Display
    Map map = frame.getMap();
    //Creating Players
    Ghost ghost = frame.addGhost(new Location(9, 11), "ghost_name", Color.red); //Creates a red ghost named "name" at location x,y
    PacMan pacman = frame.addPacMan(new Location(9, 10)); //Creates PacMan at location x, y

    boolean attack_result = ghost.attack();

    assertTrue(attack_result);
    assertTrue(map.isGameOver());
  }
}
