import java.awt.*;
import java.applet.*;
public class Userapp extends Applet
{
  TextField t1,t2;
  public void init()
  {
    t1=new TextField(8);
    t2=new TextField(8);
    add(t1);
    add(t2);
    t1.setText("10");
    t2.setText("20");
  }
  public void paint(Graphics g)
  {
    int x=0,y=0,z=0;
    String s1,s2,s;
    try
    {
      s1=t1.getText();
      s2=t2.getText();
      x=Integer.parseInt(s1);
      y=Integer.parseInt(s2);
      z=x+y;
    }
    catch(Exception e)
    {
    }
    s=String.valueOf(z);
    g.drawString("The Sum is "10,75);
    g.drawString(s,100,75);
  }
  public Boolean action(Event ev,Object ob)
  {
  repaint();
  return(true);
  }
}    
