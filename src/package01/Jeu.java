package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jeu {
	
	GestionnaireChoix cGestionnaire = new GestionnaireChoix();
	UI ui = new UI();
	GestionnaireEcran ge = new GestionnaireEcran(ui);
	Histoire histoire = new Histoire(this, ui, ge);
	
	String positionSuivante1, positionSuivante2, positionSuivante3, positionSuivante4;
	
	public static void main(String[] args) {
		
		new Jeu();
		
	}
	
	public Jeu() {
		
		ui.creationUI(cGestionnaire);
		histoire.configurationBase();
		ge.AfficheEcranAccueil();
	}
	
	public class GestionnaireChoix implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String tonChoix = event.getActionCommand();
			
			switch(tonChoix) {
			case "start": ge.EcranJeu(); histoire.selectionJoueur();break;
			case "c1": histoire.selectionPosition(positionSuivante1); break;
			case "c2": histoire.selectionPosition(positionSuivante2);break;
			case "c3": histoire.selectionPosition(positionSuivante3);break;
			case "c4": histoire.selectionPosition(positionSuivante4);break;
			}
		}
	}
}
