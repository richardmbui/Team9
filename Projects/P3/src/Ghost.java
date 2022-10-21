import java.util.ArrayList;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
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

  // return false if a location contains wall, otheriwise return true
  private boolean is_valid(Location loc) {
    if (myMap.getLoc(loc).contains(Map.Type.WALL)){
      return false;
    }

    return true;
  }

  public boolean move() {
    ArrayList<Location> moves = get_valid_moves();

    if (moves == null) {
      return false;
    }

    if (moves.size() == 0) {
      return false;
    } else {
      this.myLoc = moves.get(0);
      return true;
    }
  }

  public boolean is_pacman_in_range() {
    int x_pm = myLoc.y;
    int y_pm = myLoc.x;

    if (myMap.getLoc(new Location(x_pm + 1, y_pm)).contains(Map.Type.PACMAN)) {
      return true;
    }

    if (myMap.getLoc(new Location(x_pm - 1, y_pm)).contains(Map.Type.PACMAN)) {
      return true;
    }

    if (myMap.getLoc(new Location(x_pm, y_pm + 1)).contains(Map.Type.PACMAN)) {
      return true;
    }
    if (myMap.getLoc(new Location(x_pm, y_pm - 1)).contains(Map.Type.PACMAN)) {
      return true;
    }

    if (myMap.getLoc(new Location(x_pm + 1, y_pm - 1)).contains(Map.Type.PACMAN)) {
      return true;
    }

    if (myMap.getLoc(new Location(x_pm - 1, y_pm + 1)).contains(Map.Type.PACMAN)) {
      return true;
    }
    return false;
  }

  public boolean attack() {
    if (is_pacman_in_range() == true) {
      myMap.attack(myName);
      return true;
    } else {
      return false;
    }
  }
}
