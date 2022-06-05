package viewcon;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mod.Location;
import mod.Map;
import mod.Puzzle;
import mod.Player;

//This class controls the character arrays which the crossword uses, along with displaying the puzzle itself
public class Layout
{
  private JPanel _pan;
  private JLabel[][] _labs;
  private Puzzle _maze;
  private Player _ply;
  private boolean isTurkey = false;
  
  //This acts as a constructor for the class, taking in the puzzle and player to set up the JPanel
  public Layout(Puzzle map, Player ply) { _maze = map;
    _ply = ply;
    setupPan(charr1);
  }
  

  private char[][] charr1 = {
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '1', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '2', '@', '@', '@', '@', '@', '@', ' ', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@', '@', '3', '@', '@', '@', ' ', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@', '@', ' ', '@', '@', '@', ' ', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@', '@', ' ', '@', '@', '@', ' ', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '4', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@', '@', ' ', '@', '@', '@', ' ', '5', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@', '@', ' ', '@', '@', '@', '@', ' ', '@' }, 
    { '@', '@', '@', '@', '8', '@', '@', '@', ' ', '6', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '@' }, 
    { '@', '7', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '@', '@', ' ', '@', '@', '@', '@', ' ', '@' }, 
    { '@', '@', '@', '@', ' ', '@', '@', '@', ' ', '@', '@', '@', '@', '@', '@', '@', ' ', '@' }, 
    { '@', '@', '@', '@', ' ', '@', '@', '@', ' ', '@', '@', '@', '9', ' ', ' ', ' ', ' ', '@' }, 
    { ':', ' ', ' ', ' ', ' ', ' ', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', ' ', '@' }, 
    { '@', '@', '@', '@', ' ', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' } };
  
  private char[][] solvedCharr1 = {
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '1', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', 'E', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', 'N', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '2', '@', '@', '@', '@', '@', '@', 'G', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', 'S', '@', '@', '3', '@', '@', '@', 'I', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', 'P', '@', '@', 'P', '@', '@', '@', 'N', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', 'A', '@', '@', 'L', '@', '@', '@', 'E', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '4', 'T', 'R', 'I', 'A', 'N', 'G', 'L', 'E', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', 'C', '@', '@', 'S', '@', '@', '@', 'R', '5', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', 'H', '@', '@', 'T', '@', '@', '@', '@', 'I', '@' }, 
    { '@', '@', '@', '@', '8', '@', '@', '@', 'C', '6', 'A', 'I', 'R', 'P', 'O', 'D', 'S', '@' }, 
    { '@', '7', 'B', 'A', 'R', 'R', 'E', 'T', 'O', '@', '@', 'C', '@', '@', '@', '@', 'O', '@' }, 
    { '@', '@', '@', '@', 'I', '@', '@', '@', 'C', '@', '@', '@', '@', '@', '@', '@', 'P', '@' }, 
    { '@', '@', '@', '@', 'L', '@', '@', '@', 'K', '@', '@', '@', '9', 'R', 'I', 'C', 'O', '@' }, 
    { '@', 'A', 'G', 'L', 'E', 'T', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', 'D', '@' }, 
    { '@', '@', '@', '@', 'Y', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' } };
  
  private char[][] solvedCharr2 = {
    { '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', 'E', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', 'N', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', 'G', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', 'S', '+', '+', '+', '+', '+', '+', 'I', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', 'P', '+', '+', 'P', '+', '+', '+', 'N', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', 'A', '+', '+', 'L', '+', '+', '+', 'E', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', 'T', 'R', 'I', 'A', 'N', 'G', 'L', 'E', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', 'C', '+', '+', 'S', '+', '+', '+', 'R', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', 'H', '+', '+', 'T', '+', '+', '+', '+', 'I', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', 'C', '+', 'A', 'I', 'R', 'P', 'O', 'D', 'S', '+' }, 
    { '+', '+', 'B', 'A', 'R', 'R', 'E', 'T', 'O', '+', '+', 'C', '+', '+', '+', '+', 'O', '+' }, 
    { '+', '+', '+', '+', 'I', '+', '+', '+', 'C', '+', '+', '+', '+', '+', '+', '+', 'P', '+' }, 
    { '+', '+', '+', '+', 'L', '+', '+', '+', 'K', '+', '+', '+', '+', '+', '+', '+', 'O', '+' }, 
    { '+', 'A', 'G', 'L', 'E', 'T', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', 'D', '+' }, 
    { '+', '+', '+', '+', 'Y', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+' }, 
    { '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+', '+' } };
  
  private char[][] lostCharr1 = {
    { '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!', '!', '!', '!', '!', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!', ' ', '!', '!', '!', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!', ' ', '!', '!', '!', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!', ' ', '!', '!', '!', ' ', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', '!', ' ', '!', '!', '!', '!', ' ', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '!' }, 
    { '!', '!', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '!', '!', ' ', '!', '!', '!', '!', ' ', '!' }, 
    { '!', '!', '!', '!', ' ', '!', '!', '!', ' ', '!', '!', '!', '!', '!', '!', '!', ' ', '!' }, 
    { '!', '!', '!', '!', ' ', '!', '!', '!', ' ', '!', '!', '!', '!', '!', '!', '!', ' ', '!' }, 
    { '!', ' ', ' ', ' ', ' ', ' ', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', ' ', '!' }, 
    { '!', '!', '!', '!', ' ', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!' }, 
    { '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!', '!' } };
  

  private char[][] thanksgivingCharr = {
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '1', ' ', ' ', ' ', ' ', ' ', ' ', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '2', '@', ' ', '@', '@', '@', '3', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', ' ', '@', ' ', '@', '@', '@', ' ', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '4', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', ' ', '@', ' ', '@', '@', '@', ' ', '5', ' ', ' ', ' ', ' ', ' ', ' ', '@', '@' }, 
    { '@', '@', ' ', '@', ' ', '@', '6', '@', ' ', '@', ' ', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', ' ', '@', ' ', '@', ' ', '@', ' ', '@', ' ', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', ' ', '@', ' ', '@', ' ', '@', '@', '7', ' ', ' ', ' ', ' ', ' ', '@', '@', '@' }, 
    { '@', '@', '@', '@', ' ', '@', ' ', '@', '@', '@', ' ', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '8', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '@', '@', '@' }, 
    { '@', '@', '@', '@', ' ', '@', ' ', '@', '@', '@', ' ', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', ' ', '@', ' ', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' } };
  
  private char[][] thanksgivingCharrDone = {
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '1', 'T', 'U', 'R', 'K', 'E', 'Y', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '2', '@', 'H', '@', '@', '@', '3', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', 'O', '@', 'A', '@', '@', '@', 'G', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '4', 'C', 'R', 'A', 'N', 'B', 'E', 'R', 'R', 'Y', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', 'A', '@', 'K', '@', '@', '@', 'A', '5', 'P', 'A', 'R', 'A', 'D', 'E', '@', '@' }, 
    { '@', '@', 'N', '@', 'S', '@', '6', '@', 'V', '@', 'U', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', 'G', '@', 'G', '@', 'T', '@', 'Y', '@', 'M', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', 'E', '@', 'I', '@', 'H', '@', '@', '7', 'P', 'E', 'C', 'A', 'N', '@', '@', '@' }, 
    { '@', '@', '@', '@', 'V', '@', 'A', '@', '@', '@', 'K', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '8', 'F', 'R', 'I', 'E', 'N', 'D', 'S', 'G', 'I', 'V', 'I', 'N', 'G', '@', '@', '@' }, 
    { '@', '@', '@', '@', 'N', '@', 'K', '@', '@', '@', 'N', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', 'G', '@', 'S', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' }, 
    { '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@', '@' } };
  

  private char[][] thanksgivingCharrDoneVic = {
    { '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', '_', '1', 'T', 'U', 'R', 'K', 'E', 'Y', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', '2', '_', 'H', '_', '_', '_', '3', '_', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', 'O', '_', 'A', '_', '_', '_', 'G', '_', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '4', 'C', 'R', 'A', 'N', 'B', 'E', 'R', 'R', 'Y', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', 'A', '_', 'K', '_', '_', '_', 'A', '5', 'P', 'A', 'R', 'A', 'D', 'E', '_', '_' }, 
    { '_', '_', 'N', '_', 'S', '_', '6', '_', 'V', '_', 'U', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', 'G', '_', 'G', '_', 'T', '_', 'Y', '_', 'M', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', 'E', '_', 'I', '_', 'H', '_', '_', '7', 'P', 'E', 'C', 'A', 'N', '_', '_', '_' }, 
    { '_', '_', '_', '_', 'V', '_', 'A', '_', '_', '_', 'K', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '8', 'F', 'R', 'I', 'E', 'N', 'D', 'S', 'G', 'I', 'V', 'I', 'N', 'G', '_', '_', '_' }, 
    { '_', '_', '_', '_', 'N', '_', 'K', '_', '_', '_', 'N', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', '_', '_', 'G', '_', 'S', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' }, 
    { '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_' } };
  

  public char[][] getCharr1() { return charr1; }
  public char[][] getsolvedCharr1() { return solvedCharr1; }
  public char[][] getThanksgivingDone() { return thanksgivingCharrDone; }
  
  //This  method sets rico mode to true, acting as a debug mode
  public void setRico() {
    if (!isTurkey) {
      charr1 = solvedCharr1;
    }
    else {
      charr1 = thanksgivingCharrDone;
    }
    JOptionPane.showMessageDialog(null, "You are now in RICO mode!\nIn RICO mode, you get an infinite amount of guesses, along with a finished crossword and\na new fun PAAAARTY mode!\nTo finish the game, type \"Finish\" in the Input box to reach the victory screen.\nTo lose the game, type \"Lose\" in the Input box to reach the victory screen.");
  }
  

  //This method turns the crossword puzzle to thanksgiving mode!
  public void setThanksgiving()
  {
    charr1 = thanksgivingCharr;
    isTurkey = true;
    _ply.setPositionTurkey();
  }
  

  public void setThanksgivingDone() { charr1 = thanksgivingCharrDone; }
  
  //This method updates the first char array to whichever character is passed through it.
  //It updates the char at the location the selection circle is located at
  public void updateCharArray1(char s) {
    int row = _ply.getLoc().getRow();
    int col = _ply.getLoc().getCol();
    charr1[row][col] = s;
  }
  
  //Sets the rico (debug) victory
  public void setRicoVic() { if (!isTurkey) {
      charr1 = solvedCharr2;
    }
    else
      charr1 = thanksgivingCharrDoneVic;
  }
  
  //Sets the rico (debug) loss 
  public void setRicoLoss() { charr1 = lostCharr1; }
  
  //Draws the puzzle and returns the JPanel
  public JPanel getPan()
  {
    drawMap(charr1);
    return _pan;
  }
  
  //This method sets up the JPanel using the puzzle size to determine the Jpanel size
  private void setupPan(char[][] charr1) {
    _pan = new JPanel();
    _pan.setLayout(new GridLayout(charr1.length, charr1[0].length));
    drawMap(charr1);
  }
  
  //This method removes everything from the JPanel, then redraws the images located in the JPanel array
  private void drawMap(char[][] charr1) {
    _pan.removeAll();
    setupLabs(charr1);
    for (JLabel[] arr : _labs) {
      for (JLabel lab : arr) {
        lab.repaint();
        _pan.add(lab);
      }
    }
    _pan.repaint(); }
  
  public boolean getIsTurkey() { return isTurkey; }
  
  //This sets up the JPanel array, using the current puzzle as a parameter
  private void setupLabs(char[][] charr1) { _labs = new JLabel[charr1.length][charr1[0].length];
    for (int r = 0; r < _labs.length; r++) {
      for (int c = 0; c < _labs[0].length; c++)
        _labs[r][c] = new JLabel(findIcon(charr1, r, c));
    }
  }
  
  
  //This method returns the image to be used in the displayed JLabel array, using the current character array to choose which image to return
  private ImageIcon findIcon(char[][] charr1, int r, int c)
  {
    int pRow = _ply.getLoc().getRow();
    int pCol = _ply.getLoc().getRow();
    
    if ((r == _maze.getEnd().getRow()) && (c == _maze.getEnd().getCol()))
      return Graphics.End.getImage();
    if ((r == _ply.getLoc().getRow()) && (c == _ply.getLoc().getCol()) && (charr1[r][c] == ' ')) {
      return Graphics.PLAYER.getImage();
    }
    
    if (charr1[r][c] == '@') {
      if (!isTurkey) {
        return Graphics.WALL.getImage();
      }
      
      return Graphics.THANKSGIVING.getImage();
    }
    
    if (charr1[r][c] == '_') {
      return Graphics.TURKEY.getImage();
    }
    if (charr1[r][c] == '1') {
      return Graphics.ONE.getImage();
    }
    if (charr1[r][c] == '2') {
      return Graphics.TWO.getImage();
    }
    if (charr1[r][c] == '3') {
      return Graphics.THREE.getImage();
    }
    if (charr1[r][c] == '4') {
      return Graphics.FOUR.getImage();
    }
    if (charr1[r][c] == '5') {
      return Graphics.FIVE.getImage();
    }
    if (charr1[r][c] == '6') {
      return Graphics.SIX.getImage();
    }
    if (charr1[r][c] == '7') {
      return Graphics.SEVEN.getImage();
    }
    if (charr1[r][c] == '8') {
      return Graphics.EIGHT.getImage();
    }
    if (charr1[r][c] == '9') {
      return Graphics.NINE.getImage();
    }
    if (charr1[r][c] == ':') {
      return Graphics.TEN.getImage();
    }
    if (charr1[r][c] == '!') {
      return Graphics.SADRICO.getImage();
    }
    if (charr1[r][c] == '?') {
      return Graphics.BROWN.getImage();
    }
    if (charr1[r][c] == '*') {
      return Graphics.ORANGE.getImage();
    }
    if (charr1[r][c] == '+') {
      return Graphics.RICO.getImage();
    }
    if (charr1[r][c] == 'A') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHA.getImage();
      }
      return Graphics.PLAYA.getImage();
    }
    if (charr1[r][c] == 'B') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHB.getImage();
      }
      
      return Graphics.PLAYB.getImage();
    }
    
    if (charr1[r][c] == 'C') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHC.getImage();
      }
      return Graphics.PLAYC.getImage();
    }
    if (charr1[r][c] == 'D') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHD.getImage();
      }
      return Graphics.PLAYD.getImage();
    }
    if (charr1[r][c] == 'E') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHE.getImage();
      }
      return Graphics.PLAYE.getImage();
    }
    if (charr1[r][c] == 'F') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHF.getImage();
      }
      return Graphics.PLAYF.getImage();
    }
    if (charr1[r][c] == 'G') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHG.getImage();
      }
      return Graphics.PLAYG.getImage();
    }
    if (charr1[r][c] == 'H') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHH.getImage();
      }
      return Graphics.PLAYH.getImage();
    }
    if (charr1[r][c] == 'I') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHI.getImage();
      }
      return Graphics.PLAYI.getImage();
    }
    if (charr1[r][c] == 'J') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHJ.getImage();
      }
      return Graphics.PLAYJ.getImage();
    }
    if (charr1[r][c] == 'K') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHK.getImage();
      }
      return Graphics.PLAYK.getImage();
    }
    if (charr1[r][c] == 'L') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHL.getImage();
      }
      return Graphics.PLAYL.getImage();
    }
    if (charr1[r][c] == 'M') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHM.getImage();
      }
      return Graphics.PLAYM.getImage();
    }
    if (charr1[r][c] == 'N') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHN.getImage();
      }
      return Graphics.PLAYN.getImage();
    }
    if (charr1[r][c] == 'O') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHO.getImage();
      }
      return Graphics.PLAYO.getImage();
    }
    if (charr1[r][c] == 'P') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHP.getImage();
      }
      return Graphics.PLAYP.getImage();
    }
    if (charr1[r][c] == 'Q') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHQ.getImage();
      }
      return Graphics.PLAYQ.getImage();
    }
    if (charr1[r][c] == 'R') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHR.getImage();
      }
      return Graphics.PLAYR.getImage();
    }
    if (charr1[r][c] == 'S') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHS.getImage();
      }
      return Graphics.PLAYS.getImage();
    }
    if (charr1[r][c] == 'T') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHT.getImage();
      }
      return Graphics.PLAYT.getImage();
    }
    if (charr1[r][c] == 'U') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHU.getImage();
      }
      return Graphics.PLAYU.getImage();
    }
    if (charr1[r][c] == 'V') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHV.getImage();
      }
      return Graphics.PLAYV.getImage();
    }
    if (charr1[r][c] == 'W') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHW.getImage();
      }
      return Graphics.PLAYW.getImage();
    }
    if (charr1[r][c] == 'X') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHX.getImage();
      }
      return Graphics.PLAYX.getImage();
    }
    if (charr1[r][c] == 'Y') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHY.getImage();
      }
      return Graphics.PLAYY.getImage();
    }
    if (charr1[r][c] == 'Z') {
      if ((r != pRow) && (c != pCol)) {
        return Graphics.PATHZ.getImage();
      }
      return Graphics.PLAYZ.getImage();
    }
    

    return Graphics.PATH.getImage();
  }
  


}
