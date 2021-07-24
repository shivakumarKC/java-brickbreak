package brickbreakergame;

import java.awt.BasicStroke; /*the basicstroke class is used for the creation of outerline in bricks*/
import java.awt.Color;
import java.awt.Graphics2D;
/*2d graphics is used for the bricks creation */

public class MapGenerator
{
	public int map[][];
	
	public int brickWidth;
	
	public int brickHeight;
	
	public MapGenerator(int row ,int col) 
	
	
	{
	    	map = new int[row][col];
		    for(int i=0;i<map.length;i++) 
		     {
			      for(int j=0;j<map[0].length;j++) 
			          {
				             map[i][j]=1;
			          }
		      }
		
		              brickWidth = 550/col; /*the brick size is defined by the developer and user cant change the brick size*/
		              brickHeight= 140/row;
	
	}
	
	

		public void draw(Graphics2D g)
		{
			for(int i=0;i<map.length;i++)
			{
				for(int j=0;j<map[0].length;j++)
				{
					if(map[i][j] > 0)
					{
						g.setColor(Color.red);
						g.fillRect(j * brickWidth + 75, i * brickHeight + 50,brickWidth,brickHeight); /*gives the brick colour and structure and the brick colour is independent */
						
						g.setStroke(new BasicStroke(3));
						g.setColor(Color.black);
						g.drawRect(j * brickWidth + 75, i * brickHeight + 50,brickWidth,brickHeight); /*the air gap between is bricks is created using stroke in java */
					}	
			   	}
			}
		}
		
		public void setBrickValue(int value, int row, int col)
		
		   {
			     map[row] [col] =value;
			}
		
}
		
		

