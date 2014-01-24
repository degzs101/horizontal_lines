


import javax.swing.JApplet;
import java.awt.Color; 
import java.awt.Graphics;

public class lines extends JApplet 
{

int line;
	public void init()
	{
		if (getParameter("line") == null)
			line = 7;
		else
			line = Integer.parseInt(getParameter("line"));
	}


  public void paint (Graphics g) 
  {
    super.paint(g);
    int y = 10;
    // Draw the horizontal lines:
    for (int i=0; i<line; y++) {
        if (i % 2==0)
        	g.setColor (Color.blue);
        else
    	   g.setColor (Color.red);
     g.drawLine (10,y, 240,y);
     y = y + 20;
      
      }
    }
}


