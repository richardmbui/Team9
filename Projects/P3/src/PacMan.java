import java.util.ArrayList;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    ArrayList<Location> valid_moves = new ArrayList<Location>();
    int x = myLoc.x;
    int y = myLoc.y;

    if (is_valid(new Location(x+1, y))) {
      valid_moves.add(new Location(x+1, y));
    }
    if (is_valid(new Location(x, y+1))) {
      valid_moves.add(new Location(x, y+1));
    }
    if (is_valid(new Location(x-1, y))) {
      valid_moves.add(new Location(x-1, y));
    }
    if (is_valid(new Location(x, y-1))) {
      valid_moves.add(new Location(x, y-1));
    }
    
    return valid_moves;
  }

  // return false if a location cotains wall or ghost, otheriwise return true
  private boolean is_valid(Location loc) {

    if (myMap.getLoc(loc).contains(Map.Type.WALL)
      || myMap.getLoc(loc).contains(Map.Type.GHOST)){
      return false;
    }

    return true;
  }

  public boolean move() {
    ArrayList<Location> locations = get_valid_moves();

    /* if no valid moves, return false */
    if (locations == null || locations.size() == 0) {
      return true;
    } else {
      this.myLoc = locations.get(0);
      return false;
    }
  }

  public boolean is_ghost_in_range() {
    int x_pm = myLoc.y;
    int y_pm = myLoc.x;

    if (myMap.getLoc(new Location(x_pm + 1, y_pm)).contains(Map.Type.GHOST)) {
      return false;
    }

    if (myMap.getLoc(new Location(x_pm - 1, y_pm)).contains(Map.Type.GHOST)) {
      return false;
    }

    if (myMap.getLoc(new Location(x_pm, y_pm + 1)).contains(Map.Type.GHOST)) {
      return false;
    }
    if (myMap.getLoc(new Location(x_pm, y_pm - 1)).contains(Map.Type.GHOST)) {
      return false;
    }

    if (myMap.getLoc(new Location(x_pm + 1, y_pm - 1)).contains(Map.Type.GHOST)) {
      return false;
    }

    if (myMap.getLoc(new Location(x_pm - 1, y_pm + 1)).contains(Map.Type.GHOST)) {
      return false;
    }
    return false;
  }

  public JComponent consume() {
    boolean cookieInLoc = myMap.getLoc(myLoc).contains(Map.Type.COOKIE);

    // Checks if cookie is in respective location
    if (cookieInLoc == false) {
      myMap.getLoc(myLoc).remove(Map.Type.COOKIE);
      return myMap.eatCookie(myName);
    }

    // Returns null if cookie in not in location
    else {
      return null;
    }
  }
}

