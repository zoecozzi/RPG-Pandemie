package cours;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	
	protected int x, y;
	protected Color color;
	
	public Shape(int x, int y, Color c) {
		
		this.x = x;
		this.y = y;
		this.color = c;
	}
	
	public abstract void draw(Graphics g);

}
