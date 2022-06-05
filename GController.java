package viewcon;

import javax.swing.JOptionPane;
import mod.Direction;
import mod.Puzzle;
import mod.Player;

//This class controls the hints of the puzzles themselves, along with other misc methods
public class GController
{
  private Player _ply;
  private Puzzle _map;
  private String _name;
  private String _msg;
  private Layout _lay;
  private boolean isRico = false;
  
  //This is the constructor for this class, taking in the puzzle, player, name and message as parameters while making a new layout object.
  public GController(Player ply, Puzzle map, String name, String m) {
    _ply = ply;
    _map = map;
    _name = name;
    _msg = m;
    _lay = new Layout(_map, _ply);
  }
  
  //This class controls the movement through the string input in the dialog box
  public Direction move() {
    String s = JOptionPane.showInputDialog(null, _lay.getPan(), "Crosswords!", -1);
    Direction d = convertInput(s);
    while (!isValid(d)) {
      JOptionPane.showMessageDialog(null, "Not a valid move!");
      s = JOptionPane.showInputDialog(null, _lay.getPan(), "Crosswords!", -1);
      d = convertInput(s);
    }
    return d;
  }
  
  //This updates the character array which the crossword uses.
  public void updateCharArray1(char a) {
    a = Character.toUpperCase(a);
    _lay.updateCharArray1(a); }
  
  public boolean getIsRico() { return isRico; }
  
  //Sets rico mode on
  public void setRico() {
    _lay.setRico();
    isRico = true;
  }
  
  //This method checks if the crossword puzzle has been finished
  public boolean checkFinish() {
    if (!_lay.getIsTurkey()) {
      return _lay.getCharr1() == _lay.getsolvedCharr1();
    }
    return _lay.getCharr1() == _lay.getThanksgivingDone();
  }
  
  //This method checks if the selection circle can move into the space intended
  private boolean isValid(Direction d) {
    char[][] map = _lay.getCharr1();
    int row = _ply.getLoc().getRow();
    int col = _ply.getLoc().getCol();
    
    if (d == Direction.UP) {
      if (row == 0)
        return false;
      row--;
      return (map[row][col] != '@') && (map[row][col] != '1') && (map[row][col] != '2') && (map[row][col] != '3') && (map[row][col] != '4') && (map[row][col] != '5') && (map[row][col] != '6') && (map[row][col] != '7') && (map[row][col] != '8') && (map[row][col] != '9') && (map[row][col] != ':');
    }
    if (d == Direction.DOWN) {
      if (row == map.length - 1)
        return false;
      row++;
      return (map[row][col] != '@') && (map[row][col] != '1') && (map[row][col] != '2') && (map[row][col] != '3') && (map[row][col] != '4') && (map[row][col] != '5') && (map[row][col] != '6') && (map[row][col] != '7') && (map[row][col] != '8') && (map[row][col] != '9') && (map[row][col] != ':');
    }
    
    if (d == Direction.LEFT) {
      if (col == 0)
        return false;
      col--;
      return (map[row][col] != '@') && (map[row][col] != '1') && (map[row][col] != '2') && (map[row][col] != '3') && (map[row][col] != '4') && (map[row][col] != '5') && (map[row][col] != '6') && (map[row][col] != '7') && (map[row][col] != '8') && (map[row][col] != '9') && (map[row][col] != ':');
    }
    
    if (d == Direction.INPUT) {
      return true;
    }
    
    if (col == map[row].length - 1)
      return false;
    col++;
    return (map[row][col] != '@') && (map[row][col] != '1') && (map[row][col] != '2') && (map[row][col] != '3') && (map[row][col] != '4') && (map[row][col] != '5') && (map[row][col] != '6') && (map[row][col] != '7') && (map[row][col] != '8') && (map[row][col] != '9') && (map[row][col] != ':');
  }
  

  //This method converts the string input into a direction enum variable
  public Direction convertInput(String s)
  {
    if (s.equalsIgnoreCase("w")) {
      return Direction.UP;
    }
    if (s.equalsIgnoreCase("a")) {
      return Direction.LEFT;
    }
    if (s.equalsIgnoreCase("s")) {
      return Direction.DOWN;
    }
    if (s.equalsIgnoreCase("d")) {
      return Direction.RIGHT;
    }
    
    if (s.equalsIgnoreCase("Input")) {
      return Direction.INPUT;
    }
    

    return Direction.UP;
  }
  
  //This method randomly displays a hint to the player
  public void randomizedHint() {
    int x = (int)(Math.random() * 10.0D);
    if (!_lay.getIsTurkey()) {
      if (x == 1) {
        JOptionPane.showMessageDialog(null, "1 Down - A person who designs, builds, or maintaines machines or public works.");
      }
      else if (x == 2) {
        JOptionPane.showMessageDialog(null, "2 Down - A chicken or game bird split open ready for grilling or cooking.");
      }
      else if (x == 3) {
        JOptionPane.showMessageDialog(null, "3 Down - A synthetic material made from a wide range of organic polymers.");
      }
      else if (x == 4) {
        JOptionPane.showMessageDialog(null, "4 Across - The strongest shape in nature.");
      }
      else if (x == 5) {
        JOptionPane.showMessageDialog(null, "5 Down - The best deep sea animal.");
      }
      else if (x == 6) {
        JOptionPane.showMessageDialog(null, "6 Across - Apple's flagship bluetooth headphones.");
      }
      else if (x == 7) {
        JOptionPane.showMessageDialog(null, "7 Across - The best language arts teacher at Terra; Best friends with Mr. Rico.");
      }
      else if (x == 8) {
        JOptionPane.showMessageDialog(null, "8 Down - The best security guard at Terra.");
      }
      else if (x == 9) {
        JOptionPane.showMessageDialog(null, "9 Across - The best teacher in Terra.");
      }
      else if (x == 0) {
        JOptionPane.showMessageDialog(null, "10 Across - The plastic part at the tip of a shoelace.");
      }
      
    }
    else if (x == 1) {
      JOptionPane.showMessageDialog(null, "1 Across - A game bird which is often eaten on Thanksgiving");
    }
    else if (x == 2) {
      JOptionPane.showMessageDialog(null, "1 Across - The uniquely American holiday which falls on the third Thursday of the month.");
    }
    else if (x == 3) {
      JOptionPane.showMessageDialog(null, "2 Down - One of the major colors of Fall- Also a fruit.");
    }
    else if (x == 4) {
      JOptionPane.showMessageDialog(null, "3 Down - A thich rich sauce made from turkey drippings.");
    }
    else if (x == 5) {
      JOptionPane.showMessageDialog(null, "4 Across - An acidic red berry used in cooking many Fall dishes");
    }
    else if (x == 6) {
      JOptionPane.showMessageDialog(null, "5 Down - A large orange fruit often used in creating pies and decorations during Fall");
    }
    else if (x == 7) {
      JOptionPane.showMessageDialog(null, "6 Down - \"Thanksgiving is about giving _____\"");
    }
    else if (x == 8) {
      JOptionPane.showMessageDialog(null, "5 Down - \"The Macy's Thanksgiving Day ______");
    }
    else if (x == 9) {
      JOptionPane.showMessageDialog(null, "7 Across - A brown fleshy nut (similar to a walnut) which is used in creating pies.");
    }
    else if (x == 0) {
      JOptionPane.showMessageDialog(null, "8 Across - A Thanksgiving celebration with one's friends, as opposed to one's family");
    }
  }
  
  //This method controls what happens when victory is achieved
  public void victory()
  {
    _lay.setRicoVic();
    JOptionPane.showMessageDialog(null, _lay.getPan(), "VICTORY!!!", 1);
    JOptionPane.showMessageDialog(null, "Congratulations! You finished the Crossword puzzle!\nGo to the Rico's 6th Period Comp Sci class to\nredeem your one free RiCoin!" + 
      isThanksgivingString());
    System.exit(0);
  }
  
  //This method controls when the player loses
  public void defeat() {
    _lay.setRicoLoss();
    JOptionPane.showMessageDialog(null, _lay.getPan(), "HA YOU LOST!", 0);
    JOptionPane.showMessageDialog(null, "Aw hell, you weren't able to finish the puzzle. Better luck next time!");
    System.exit(0);
  }
  
  //This method returns a thanksgiving string if thanksgiving mode is on
  public String isThanksgivingString() { if (_lay.getIsTurkey()) {
      return "\nHave a wonderful Thanksgiving!";
    }
    return " ";
  }
  
  //Turns on thanksgiving mode
  public void setThanksgiving() { _lay.setThanksgiving(); }
}
