package cours;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PaintPanel extends JPanel{

	protected int x,y;
	protected ArrayList<Shape> shapes;
	
	public PaintPanel() {
		this.x = 50;
		this.y = 50;
		this.shapes = new ArrayList<Shape>();
	}
	
	public void mouseClick(MouseEvent me) {
		//this.x = me.getX();
		//this.y = me.getY();
		this.shapes.get(this.shapes.size() - 1).mouseClick(me);
		this.repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawString("Add a rectangle here", 55, 65);
		g.setColor(Color.RED);
		//g.drawRect(this.x, this.y, 200, 50);
		for (Shape s : shapes) {
			s.draw(g);
		}
	}
	
	protected void addShape(Shape f) {
		this.shapes.add(f);
		this.repaint();
	}
}
