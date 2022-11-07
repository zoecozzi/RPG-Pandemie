package package01;

import package02.Arme_Scalpel;

public class Joueur_Medecin extends SuperJoueur {
	
	public Joueur_Medecin() {
		
		nom = "Médecin";
		hp = 10;
		armeUtilise = new Arme_Scalpel();
		
	}

}
