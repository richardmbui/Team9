import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;


public class Map {

  public enum Type {
    EMPTY,
    PACMAN,
    GHOST,
    WALL,
    COOKIE
  }

  private HashMap<Location, HashSet<Type>> field;
  private boolean gameOver;
  private int dim;

  private HashMap<String, Location> locations;
  private HashMap<String, JComponent> components;
  private HashSet<Type> emptySet;
  private HashSet<Type> wallSet;

  private int cookies = 0;

  public Map(int dim) {
    gameOver = false;
    locations = new HashMap<String, Location>();
    components = new HashMap<String, JComponent>();
    field = new HashMap<Location, HashSet<Type>>();

    emptySet = new HashSet<Type>();
    wallSet = new HashSet<Type>();
    emptySet.add(Type.EMPTY);
    wallSet.add(Type.WALL);
    this.dim = dim;
  }

  public void add(String name, Location loc, JComponent comp, Type type) {
    locations.put(name, loc);
    components.put(name, comp);
    if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
    field.get(loc).add(type);
  }

  public int getCookies() {
    return cookies;
  }

  public boolean isGameOver() {
    return gameOver;
  }

  public boolean move(String name, Location loc, Type type) {
    // update locations, components, and field
    // use the setLocation method for the component to move it to the new location
    return false;
  }

  public HashSet<Type> getLoc(Location loc) {
    // wallSet and emptySet will help you write this method

    boolean xConditions = loc.x < 0 || loc.x >= dim;
    boolean yConditions = loc.y < 0 || loc.y >= dim;

    if (xConditions || yConditions) {
      return wallSet;
    }

    // Edge checks
    if (!(field.get(loc).size() != 0 && field.containsKey(loc))) {
      return emptySet;
    }

    return field.get(loc);
  }

  public boolean attack(String Name) {
    // update gameOver
    return false;
  }

  public JComponent eatCookie(String name) {
    boolean nameBool = components.get(name) instanceof CookieComponent;
    int one = 1;
    if(nameBool == false){
      return null;
    }else{
      cookies = cookies + one;
			JComponent removedCookie = components.get(name);
			components.remove(name);
			return removedCookie;
    }
  }
}
