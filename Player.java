package mod;

//This class controls the selection circle and its variables
public class Player {
  private Location _position;
  private boolean _isDead;
  private boolean _hasSword;
  
  public Location getLoc() { return _position; }
  public boolean isDead() { return _isDead; }
  
  //This method moves the circle up
  public void moveUp() { _position.moveUp(); }
  //This method moves the circle down
  public void moveDown() { _position.moveDown(); }
  //This method moves the circle left
  public void moveLeft() { _position.moveLeft(); }
  //This method moves the circle right
  public void moveRight() { _position.moveRight(); }
  
  //This method sets the position to the starting location in thanksgiving mode
  public void setPositionTurkey() { _position.setPositionTurkey(); }
  
  //This is the constructor for this class, taking in the original position as a parameter
  public Player(Location pos) {
    _position = pos;
    _isDead = false;
    _hasSword = false;
  }
}
