package cours;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaintMain {
	
	public static void main (String[] args) {
		JFrame window = new JFrame("Java Paint");
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		//JPanel mainPanel = new JPanel();
		PaintPanel mainPanel = new PaintPanel();
		mainPanel.setLayout(new FlowLayout());
		mainPanel.addMouseListener(new MousePanelInfo());

		JLabel mainLabel = new JLabel("Welcome to my Paint !");
		JLabel secondLabel = new JLabel("Catch me");
		JButton button1 = new JButton("Rectangle");
		JButton button2 = new JButton ("I am second");

		ButtonAction infoButtonAction = new ButtonAction(secondLabel);
		//button1.addActionListener(infoButton);
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainPanel.addShape(new RectangleShape(100, 200, new Color(0,0,0), 50, 70));
			}
		});
		button2.addActionListener(infoButton);
		
		mainPanel.add(mainLabel);
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(secondLabel);
		window.add(mainPanel);
		window.validate();
	}
}