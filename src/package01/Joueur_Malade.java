package package01;

import package02.Arme_Mouchoire;

public class Joueur_Malade extends SuperJoueur {
	
	public Joueur_Malade() {
		
		nom = "Malade";
		hp = 5;
		armeUtilise = new Arme_Mouchoire();
		
	}

}