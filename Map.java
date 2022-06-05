package mod;

//This enum controls the array which controls where the selection circle can go
public enum Map
{
	
	//This is for the first puzzle
  first(new boolean[][] {
    new boolean[18], 
    { false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true }, 
    { false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, true, false, true, true, true, true, true, true, true }, 
    { false, false, true, true, true, true, true, true, true, false, false, true, false, false, false, false, true }, 
    { false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, true }, 
    { false, false, false, false, true, false, false, false, true, false, false, false, false, false, false, false, true }, 
    { false, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true }, 
    { false, false, false, false, true }, 
    new boolean[18] }), 
  
	//This is for testing
  blank(new boolean[][] {
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18], 
    new boolean[18] }), 
  
	//This is for the thanksgiving puzzle
  thanksgiving(
    new boolean[][] {
    { false, false, false, false, false, false, false, false, false, true }, 
    { false, false, false, false, false, false, false, false, false, true }, 
    { false, true, true, true, false, false, false, false, false, true }, 
    { false, false, false, true, false, false, false, false, false, true }, 
    { false, false, false, true, false, false, false, false, false, true }, 
    { false, false, false, true, false, false, false, false, false, true }, 
    { false, true, true, true, true, true, true, true, true, true }, 
    { false, true }, 
    { false, true }, 
    { false, true } });
  
  private boolean[][] _map;
  
  public boolean[][] getArr()
  {
    return _map;
  }
  
 
  private Map(boolean[][] map) {
    _map = map;
  }
}
