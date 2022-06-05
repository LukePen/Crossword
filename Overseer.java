package mod;

import javax.swing.JOptionPane;
import viewcon.GController;


//This class acts as the main overseer, connecting the front and back end coding classes
public class Overseer
{
  private Puzzle _maze;
  private Player _ply;
  private GController _gcnt;
  private String s = " ";
  private boolean de = false;
  private int cnt = 70;
  
  //This is the constructor for the class, displaying the instructions and instantiating the object variables
  public Overseer() { JOptionPane.showMessageDialog(null, "Welcome to Crosswords! \nTo play this game, use WASD to move and type \"Input\" to input letters!\nIf youre stumped with a word, you can ask for a randomized hint by typing \"Hint\" in the Input box\n(I wonder what happens if you input Rico or Thanksgiving in there...)");
    _maze = new Puzzle();
    _ply = new Player(_maze.getStart());
    _gcnt = new GController(_ply, _maze, "NAME VARIABLE HERE", "Type wasd to move");
    update();
  }
  
  //This method updates the state of the game by running different boolean methods to check if the game is done or the player is out of moves
  private void update()
  {
    do {
      movePlayer(_gcnt.move());
      if ((_gcnt.checkFinish()) || (_gcnt.getIsRico())) break; } while (cnt != 0);
    

    while ((_gcnt.getIsRico()) && (!de)) {
      movePlayer(_gcnt.move());
    }
    
    if ((de) && (_gcnt.getIsRico())) {
      _gcnt.victory();
    }
    if (_gcnt.checkFinish()) {
      _gcnt.victory();
    }
    else
    {
      _gcnt.defeat();
    }
  }
  
  //This method controls moving the selection circle
  private void movePlayer(Direction d)
  {
    int pRow = _ply.getLoc().getRow();
    int pCol = _ply.getLoc().getCol();
    if (d == Direction.UP) {
      _ply.moveUp();
    }
    else if (d == Direction.DOWN) {
      _ply.moveDown();
    }
    else if (d == Direction.LEFT) {
      _ply.moveLeft();
    }
    else if (d == Direction.INPUT) {
      s = JOptionPane.showInputDialog(null, "Input the letter you wish to enter\n" + isRicoCnt());
      s.toUpperCase();
      if (!s.equalsIgnoreCase("Rico")) {
        if (!s.equalsIgnoreCase("Hint")) {
          if ((s.equalsIgnoreCase("Finish")) && (_gcnt.getIsRico())) {
            _gcnt.victory();
          }
          if ((s.equalsIgnoreCase("Lose")) && (_gcnt.getIsRico())) {
            _gcnt.defeat();
          }
          

          if (s.equalsIgnoreCase("Thanksgiving")) {
            _gcnt.setThanksgiving();
            JOptionPane.showMessageDialog(null, "You've unlocked Thanksgiving mode!\nHappy Thanksgiving!");
          }
          else {
            s.toUpperCase();
            _gcnt.updateCharArray1(s.charAt(0));
            s = " ";
            cnt -= 1;
          }
        }
        else {
          _gcnt.randomizedHint();
        }
      }
      
      if (s.equalsIgnoreCase("Rico")) {
        _gcnt.setRico();
        s = " ";
      }
      
      if (s.equalsIgnoreCase("Finish")) {
        _gcnt.victory();
      }
    }
    else
    {
      _ply.moveRight();
    }
  }
  
  //This method returns how many moves the player has left
  private String isRicoCnt() { if (!_gcnt.getIsRico()) {
      return "You have " + cnt + " guesses left!";
    }
    return "You have an infinite amount of guesses left!";
  }
}
