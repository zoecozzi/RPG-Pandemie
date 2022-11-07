package package01;

import package02.Arme_Couteau;

public class Joueur_Citoyen extends SuperJoueur {
	
	public Joueur_Citoyen() {
		
		nom = "Citoyen";
		hp = 15;
		armeUtilise = new Arme_Couteau();
		
	}

}
