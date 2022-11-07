package package01;

public class GestionnaireEcran {
	
	UI ui;
	
	public GestionnaireEcran(UI interfaceUtilisateur) {
		
		ui = interfaceUtilisateur;
	}
	
	public void AfficheEcranAccueil() {
		
		//Show the title screen
		ui.titreJeuPanel.setVisible(true);
		ui.boutonCommencerPanel.setVisible(true);
		
		//Hide the game screen
		ui.textePrincipalPanel.setVisible(false);
		ui.boutonChoixPanel.setVisible(false);
		ui.joueurPanel.setVisible(false);
	}
	public void EcranJeu() {
		
		//Hide the title screen
		ui.titreJeuPanel.setVisible(false);
		ui.boutonCommencerPanel.setVisible(false);
				
		//Show the game screen
		ui.textePrincipalPanel.setVisible(true);
		ui.boutonChoixPanel.setVisible(true);
		ui.joueurPanel.setVisible(true);
	}

}
