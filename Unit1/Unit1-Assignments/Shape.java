//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Shape
{
   //instance variables
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col)
   {
		xPos = x;
		yPos = y;
		width = wid;
		height = ht;
		color = col;
   }


   public void draw(Graphics window)
   {
      window.setColor(Color.RED);
      window.fillRect(200, 200, 200, 200);
      
      window.setColor(Color.GREEN);
      window.fillOval(100, 100, 200, 100);
      
      window.setColor(Color.BLACK);
      window.fillOval(300, 400, 50, 60);

      //draw whatever you want
      //    ^
      //  [ :: ]
      //    ()

   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString()
   {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }
}