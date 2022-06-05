package viewcon;

import javax.swing.ImageIcon;

//This enum contains the resource names for the images used to display the crossword puzzle
public enum Graphics
{
  PATH("path.png"),  WALL("wall.png"), 
  PUP("PUp.png"),  PDOWN("PDown.png"), 
  PRIGHT("PRight.png"),  PLEFT("PLeft.png"), 
  MUP("MUp.png"),  MDOWN("MDown.png"), 
  MRIGHT("MRight.png"),  MLEFT("MLeft.png"), 
  End("End.png"),  PATHA("PATHA.png"),  PATHB("pathb.png"),  PATHC("pathC.png"), 
  PATHD("pathd.png"),  PATHE("pathe.png"),  PATHF("pathf.png"),  PATHG("pathg.png"), 
  PATHH("pathh.png"),  PATHI("pathi.png"),  PATHJ("pathj.png"),  PATHK("pathk.png"),  PATHL("pathl.png"),  PATHM("pathm.png"), 
  PATHN("pathn.png"),  PATHO("patho.png"),  PATHP("pathp.png"),  PATHQ("pathq.png"),  PATHR("pathr.png"), 
  PATHS("paths.png"),  PATHT("patht.png"),  PATHU("pathu.png"),  PATHV("pathv.png"),  PATHW("pathw.png"),  PATHX("pathx.png"), 
  PATHY("pathy.png"),  PATHZ("pathz.png"),  PLAYER("player.png"),  PLAYA("PLAYA.png"),  PLAYB("PLAYB.png"),  PLAYC("PLAYC.png"), 
  PLAYD("PLAYD.png"),  PLAYE("PLAYE.png"),  PLAYF("PLAYF.png"),  PLAYG("PLAYG.png"),  PLAYH("PLAYH.png"),  PLAYI("PLAYI.png"),  PLAYJ("PLAYJ.png"), 
  PLAYK("PLAYK.png"),  PLAYL("PLAYL.png"),  PLAYM("PLAYM.png"),  PLAYN("PLAYN.png"),  PLAYO("PLAYO.png"),  PLAYP("PLAYP.png"),  PLAYQ("PLAYQ.png"), 
  PLAYR("PLAYR.png"),  PLAYS("PLAYS.png"),  PLAYT("PLAYT.png"),  PLAYU("PLAYU.png"),  PLAYV("PLAYV.png"),  PLAYW("PLAYW.png"),  PLAYX("PLAYX.png"), 
  PLAYY("PLAYY.png"),  PLAYZ("PLAYZ.png"),  RICO("rico.png"),  BROWN("brown.png"),  ORANGE("orange.png"),  SADRICO("sadrico.png"),  ONE("one.png"), 
  TWO("two.png"),  THREE("three.png"),  FOUR("four.png"),  FIVE("five.png"),  SIX("six.png"),  SEVEN("seven.png"),  EIGHT("eight.png"),  NINE("nine.png"), 
  TEN("ten.png"),  THANKSGIVING("thanksgiving background.png"),  TURKEY("turkey!.png");
  
  private ImageIcon _img;
  
  public ImageIcon getImage() { return _img; }
  
  private Graphics(String fName) {
    _img = new ImageIcon(getClass().getResource(fName));
  }
}
