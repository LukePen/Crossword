package mod;

//This class controls the location of the selection circle
public class Location {
  private int _row;
  private int _col;
  
  public int getRow() { return _row; }
  public int getCol() { return _col; }
  
  //This class moves the selection circle down by increasing its row variable by one
  public void moveDown() { _row += 1; }
  
  //This class moves the selection circle up by decreasing its row variable by one
  public void moveUp() { _row -= 1; }
  
  //This class moves the selection circle left by decreasing its column variable by one
  public void moveLeft() { _col -= 1; }
  
  //This class moves the selection circle right by increasing its column variable by one
  public void moveRight() { _col += 1; }
  
  //This sets the position of the selection circle when turkey mode is on
  public void setPositionTurkey() { _row = 3;_col = 4; }
  
  //This acts as the constructor for the class, taking in row and column as parameter
  public Location(int row, int col) { _row = row;
    _col = col;
  }
}
