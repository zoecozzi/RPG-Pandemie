package cours;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MousePanelInfo implements MouseListener {
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("CLICKED");
		System.out.println("X: " + e.getX() + " - Y : " + e.getY());
		if (e.getSource().getClass() == PaintPanel.class) {
			PaintPanel pn = (PaintPanel)e.getSource();
			pn.mouseClick(e);
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("ENTERED");
		System.out.println("X: " + e.getX() + " - Y : " + e.getY());
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("EXITED");
		System.out.println("X: " + e.getX() + " - Y : " + e.getY());
	}

}
