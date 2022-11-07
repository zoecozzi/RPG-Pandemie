package cours;

import java.awt.Color;
import java.awt.Graphics;

public class RectangleShape extends Shape {
	
	protected int width, height;
	
	public RectangleShape (int x, int y, Color c, int w, int h) {
		
		super(x, y, c);
		this.width = w;
		this.height = h;
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.drawRect(this.x, this.y, this.width, this.height);
	}

}
