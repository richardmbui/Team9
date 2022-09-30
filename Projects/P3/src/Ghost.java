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
    ArrayList<Location> moves = get_valid_moves();
    int idx = 0;
    if (moves == null) {
      return false;
    }
    if (!this.myMap.move(this.myName, moves.get(idx), Map.Type.GHOST))
      return false;
    idx = (int) (Math.random() * moves.size());
    this.shift = this.myLoc.unshift(moves.get(idx));
    this.myLoc = moves.get(idx);
    return true;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
