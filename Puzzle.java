package mod;

//This class controls the puzzles themselves
public class Puzzle {
  private Map _map;
  private Location _start;
  private Location _end;
  private Location _spawn;
  
  public Map getMap() { return _map; }
  
  public Location getStart()
  {
    return _start;
  }
  
  public Location getEnd() {
    return _end;
  }
  
  public Location getSpawn() {
    return _spawn;
  }
  
  //This acts as the first constructor, having no parameter 
  public Puzzle() {
    _map = Map.first;
    _start = new Location(1, 15);
    _end = new Location(0, 21);
    _spawn = new Location(0, 0);
  }
  
  //This is a constructor which takes in an int parameter to determine which puzzle to load
  public Puzzle(int x) {
    if (x == 0) {
      _map = Map.first;
      _start = new Location(9, 1);
      _end = new Location(0, 21);
      _spawn = new Location(0, 0);
    } else {
      _map = Map.thanksgiving;
      _start = new Location(9, 1);
      _end = new Location(0, 9);
      _spawn = new Location(0, 0);
    }
  }
}
