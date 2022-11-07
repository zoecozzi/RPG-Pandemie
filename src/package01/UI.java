package package01;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import package01.Jeu.GestionnaireChoix;

public class UI {
	
	JFrame fenetre;
	JPanel titreJeuPanel, boutonCommencerPanel, textePrincipalPanel, boutonChoixPanel, joueurPanel;
	JLabel nomJeuLabel, hpLabel, nombreHpLabel, armeLabel, nomArmeLabel, nomJoueurLabel, joueurLabel;
	JButton boutonCommencer, choix1, choix2, choix3, choix4;
	JTextArea textePrincipalArea;
	Font fontTitre = new Font("Times New Roman", Font.PLAIN, 90);
	Font fontNormale = new Font("Times New Roman", Font.PLAIN, 26);
	Font fontHaut = new Font("Times New Roman", Font.PLAIN, 15);
	
	public void creationUI(GestionnaireChoix cGestionnaire) {
		
		// FENETRE
		fenetre = new JFrame();
		fenetre.setSize(800, 600);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.getContentPane().setBackground(Color.black);
		fenetre.setLayout(null);
		
		//ECRAN ACCUEIL
		titreJeuPanel = new JPanel();
		titreJeuPanel.setBounds(100, 100, 600, 500);
		titreJeuPanel.setBackground(Color.black);
		nomJeuLabel = new JLabel("LA PANDÉMIE");
		nomJeuLabel.setForeground(Color.white);
		nomJeuLabel.setFont(fontTitre);
		titreJeuPanel.add(nomJeuLabel);
		
		boutonCommencerPanel = new JPanel();
		boutonCommencerPanel.setBounds(300, 400, 200, 100);
		boutonCommencerPanel.setBackground(Color.black);
		boutonCommencer = new JButton("DÉBUT");
		boutonCommencer.setBackground(Color.black);
		boutonCommencer.setForeground(Color.white);
		boutonCommencer.setFont(fontNormale);
		boutonCommencer.setFocusPainted(false);
		boutonCommencer.addActionListener(cGestionnaire);
		boutonCommencer.setActionCommand("start");
		boutonCommencerPanel.add(boutonCommencer);
		fenetre.add(titreJeuPanel);
		fenetre.add(boutonCommencerPanel);
		
		//ECRAN JEU
		textePrincipalPanel = new JPanel();
		textePrincipalPanel.setBounds(100, 100, 600, 250);
		textePrincipalPanel.setBackground(Color.black);
		fenetre.add(textePrincipalPanel);
		
		textePrincipalArea = new JTextArea("This is the main text area");
		textePrincipalArea.setBounds(100, 100, 600, 250);
		textePrincipalArea.setBackground(Color.black);
		textePrincipalArea.setForeground(Color.white);
		textePrincipalArea.setFont(fontNormale);
		textePrincipalArea.setLineWrap(true);
		textePrincipalArea.setWrapStyleWord(true);
		textePrincipalArea.setEditable(false);
		textePrincipalPanel.add(textePrincipalArea);
		
		boutonChoixPanel = new JPanel();
		boutonChoixPanel.setBounds(250, 350, 300, 150);
		boutonChoixPanel.setBackground(Color.black);
		boutonChoixPanel.setLayout(new GridLayout(4, 1));
		fenetre.add(boutonChoixPanel);
		
		choix1 = new JButton("choix1");
		choix1.setBackground(Color.black);
		choix1.setForeground(Color.white);
		choix1.setFont(fontNormale);
		choix1.setFocusPainted(false);
		choix1.addActionListener(cGestionnaire);
		choix1.setActionCommand("c1");
		boutonChoixPanel.add(choix1);
		choix2 = new JButton("choix2");
		choix2.setBackground(Color.black);
		choix2.setForeground(Color.white);
		choix2.setFont(fontNormale);
		choix2.setFocusPainted(false);
		choix2.addActionListener(cGestionnaire);
		choix2.setActionCommand("c2");
		boutonChoixPanel.add(choix2);
		choix3 = new JButton("choix3");
		choix3.setBackground(Color.black);
		choix3.setForeground(Color.white);
		choix3.setFont(fontNormale);
		choix3.setFocusPainted(false);
		choix3.addActionListener(cGestionnaire);
		choix3.setActionCommand("c3");
		boutonChoixPanel.add(choix3);
		choix4 = new JButton("choix4");
		choix4.setBackground(Color.black);
		choix4.setForeground(Color.white);
		choix4.setFont(fontNormale);
		choix4.setFocusPainted(false);
		choix4.addActionListener(cGestionnaire);
		choix4.setActionCommand("c4");
		boutonChoixPanel.add(choix4);
		
		joueurPanel = new JPanel();
		joueurPanel.setBounds(100, 15, 600, 50);
		joueurPanel.setBackground(Color.black);
		joueurPanel.setLayout(new GridLayout(1, 4));
		fenetre.add(joueurPanel);
		
		joueurLabel = new JLabel("Joueur :");
		joueurLabel.setFont(fontHaut);
		joueurLabel.setForeground(Color.white);
		joueurPanel.add(joueurLabel);
		nomJoueurLabel = new JLabel();
		nomJoueurLabel.setForeground(Color.white);
		nomJoueurLabel.setFont(fontHaut);
		joueurPanel.add(nomJoueurLabel);
		hpLabel = new JLabel("HP:");
		hpLabel.setFont(fontHaut);
		hpLabel.setForeground(Color.white);
		joueurPanel.add(hpLabel);
		nombreHpLabel = new JLabel();
		nombreHpLabel.setForeground(Color.white);
		nombreHpLabel.setFont(fontHaut);
		joueurPanel.add(nombreHpLabel);
		armeLabel = new JLabel("Arme:");
		armeLabel.setForeground(Color.white);
		armeLabel.setFont(fontHaut);
		joueurPanel.add(armeLabel);
		nomArmeLabel = new JLabel();
		nomArmeLabel.setForeground(Color.white);
		nomArmeLabel.setFont(fontHaut);
		joueurPanel.add(nomArmeLabel);
		
		
		fenetre.setVisible(true);
	}
}
