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
      valid_moves.add(new Location(x+1, y))
    }
    if (is_valid(new Location(x, y+1))) {
      valid_moves.add(new Location(x, y+1))
    }
    if (is_valid(new Location(x-1, y))) {
      valid_moves.add(new Location(x-1, y))
    }
    if (is_valid(new Location(x, y-1))) {
      valid_moves.add(new Location(x, y-1))
    }
    
    return valid_moves;
  }

  // return false if a location cotains wall, otheriwise return true
  private boolean is_valid(Location loc) {
    if (myMap.getLoc(loc).contains(Map.Type.WALL)){
      return false;
    }

    return true;
  }

  public boolean move() {
    return false;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
