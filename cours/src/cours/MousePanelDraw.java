package cours;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePanelDraw implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragged");
		System.out.println("X: " + e.getX() + " - Y : " + e.getY());
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moved");
		System.out.println("X: " + e.getX() + " - Y : " + e.getY());
	}
}
