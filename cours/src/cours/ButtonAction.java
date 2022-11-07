package cours;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonAction implements ActionListener{
	
	private JLabel label;
	
	public ButtonAction(JLabel lab) {
		this.label = lab;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(e.paramString());
		System.out.println(e.getSource());
		if(e.getSource().getClass() == JButton.class) {
			JButton btn = ((JButton) e.getSource());
			this.label.setText(btn.getText());
		}
	}
}
