package ball_breaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class MapGen {
	public int map[][];
	public int brickWidth;
	public int brickHeight;
	public MapGen(int row,int col) {
		map = new int[row][col];
		for(int i =0;i< map.length;i++)
		{
			for(int j =0;j< map[0].length;j++)
			{
				map[i][j] = 1;
			}
		}
		brickWidth = 480/col;
		brickHeight = 150/row;
	}
	public void draw(Graphics2D gr) {
		for(int i =0;i<map.length;i++)
		{
			for(int j =0;j<map[0].length;j++)
			{
				if(map[i][j] > 0)
				{
					gr.setColor(Color.green);
					gr.fillRect(j* brickWidth + 100 , i* brickHeight+50,brickWidth,brickHeight);
					gr.setStroke(new BasicStroke(3));
					gr.setColor(Color.black);
					gr.drawRect(j* brickWidth + 100 , i* brickHeight+50,brickWidth,brickHeight);
				}
			}
		}
	}
	public void setBrickValue(int value,int row,int col) {
		map[row][col] =value;
	}
}
