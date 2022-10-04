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
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    int x_pm = myLoc.x;
    int y_pm = myLoc.y;

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
    return false;
  }
}
