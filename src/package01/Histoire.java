package package01;

import package02.Arme_Couteau;
import package02.Arme_Scalpel;
import package02.Ennemi_Bacterie;
import package02.Ennemi_Pangolin;
import package02.SuperEnnemi;

public class Histoire {
	
	Jeu jeu;
	UI ui;
	GestionnaireEcran ge;
	SuperJoueur joueur = new Joueur_Medecin();
	SuperEnnemi ennemi;
	
	int recetteMagique;
	
	public Histoire(Jeu j, UI interfaceUtilisateur, GestionnaireEcran gEcran) {
		
		jeu = j;
		ui = interfaceUtilisateur;
		ge = gEcran;
	}
	
	public void configurationBase() {
		
		ui.nomJoueurLabel.setText(joueur.nom + "");
		
		ui.nombreHpLabel.setText(joueur.hp + "");
		
		ui.nomArmeLabel.setText(joueur.armeUtilise.nom);
		
		recetteMagique = 0;
	}
	
	//CHOIX POSSIBLE LE LONG DE L'HISTOIRE
	public void selectionPosition(String positionSuivante) {
		
		switch(positionSuivante) {
		case "selectionJoueur": selectionJoueur(); break;
		case "medecin": medecin(); break;
		case "citoyen": citoyen(); break;
		case "malade": malade(); break;
		case "citoyenApres": citoyenApres(); break;
		case "maladeApres": maladeApres(); break;
		case "parlerPresident": parlerPresident(); break;
		case "attaquerPresident": attaquerPresident(); break;
		case "continuerChemin": continuerChemin(); break;
		case "nord": nord(); break;
		case "est": est(); break;
		case "ouest": ouest(); break;
		case "attaquer": attaquer(); break;
		case "attaqueJoueur": attaqueJoueur(); break;
		case "attaqueEnnemi": attaqueEnnemi(); break;
		case "gagner": gagner(); break;
		case "perdre": perdre(); break;
		case "fin": fin(); break;
		case "nouvellePartie": nouvellePartie(); break;
		}
	}
	//PARTIE DE SELECTOIN DU JOUEUR AU DEBUT DU JEU
	public void selectionJoueur() {
		ui.textePrincipalArea.setText("Tu es à l'entrée d'une ville où une pendémie s'est abattue. \nTu es actuellement médecin mais tu peux pénetrer dans cette ville sous une autre identité. \n\nFais-le bon choix !?");
		ui.choix1.setText("Rester Médecin");
		ui.choix2.setText("Devenir Citoyen");
		ui.choix3.setText("Devenir Malade");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "medecin";
		jeu.positionSuivante2 = "citoyen";
		jeu.positionSuivante3 = "malade";
		jeu.positionSuivante4 = "";
	}
	
	public void medecin() {
		
		ui.textePrincipalArea.setText("Tu t'apprête à rentrer dans la ville lorsque tu tombes nez à nez avec le président de la ville. \nPris de court, tu dois faire un choix !");
		ui.choix1.setText("Parler avec le président");
		ui.choix2.setText("Attaquer le président");
		ui.choix3.setText("Continuer ton chemin");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "parlerPresident";
		jeu.positionSuivante2 = "attaquerPresident";
		jeu.positionSuivante3 = "continuerChemin";
		jeu.positionSuivante4 = "";
	}
	
	public void citoyen() {
		
		joueur = new Joueur_Citoyen();
		ui.nomJoueurLabel.setText(joueur.nom);
		ui.nombreHpLabel.setText("" + joueur.hp);
		ui.nomArmeLabel.setText(joueur.armeUtilise.nom);
		ui.textePrincipalArea.setText("Tu t'apprête à rentrer dans la ville lorsque tu tombes nez à nez avec le président de la ville. \nPris de court, tu dois faire un choix !");
		ui.choix1.setText("Parler avec le président");
		ui.choix2.setText("Attaquer le président");
		ui.choix3.setText("Continuer ton chemin");
		
		jeu.positionSuivante1 = "parlerPresident";
		jeu.positionSuivante2 = "attaquerPresident";
		jeu.positionSuivante3 = "continuerChemin";
	}
	
	public void citoyenApres() {
			
			joueur = new Joueur_Citoyen();
			ui.nomJoueurLabel.setText(joueur.nom);
			ui.nomArmeLabel.setText(joueur.armeUtilise.nom);
			ui.textePrincipalArea.setText("Tu t'apprête à rentrer dans la ville lorsque tu tombes nez à nez avec le président de la ville. \nPris de court, tu dois faire un choix !");
			ui.choix1.setText("Parler avec le président");
			ui.choix2.setText("Attaquer le président");
			ui.choix3.setText("Continuer ton chemin");
			
			jeu.positionSuivante1 = "parlerPresident";
			jeu.positionSuivante2 = "attaquerPresident";
			jeu.positionSuivante3 = "continuerChemin";
		}
	
	public void malade() {
		
		joueur = new Joueur_Malade();
		ui.nomJoueurLabel.setText(joueur.nom);
		ui.nombreHpLabel.setText("" + joueur.hp);
		ui.nomArmeLabel.setText(joueur.armeUtilise.nom);
		ui.textePrincipalArea.setText("Tu t'apprête à rentrer dans la ville lorsque tu tombes nez à nez avec le président de la ville. \nPris de court, tu dois faire un choix !");
		ui.choix1.setText("Parler avec le président");
		ui.choix2.setText("Attaquer le président");
		ui.choix3.setText("Continuer ton chemin");
		
		jeu.positionSuivante1 = "parlerPresident";
		jeu.positionSuivante2 = "attaquerPresident";
		jeu.positionSuivante3 = "continuerChemin";
	}
	
	public void maladeApres() {
			
			joueur = new Joueur_Malade();
			ui.nomJoueurLabel.setText(joueur.nom);
			ui.nomArmeLabel.setText(joueur.armeUtilise.nom);
			ui.textePrincipalArea.setText("Tu t'apprête à rentrer dans la ville lorsque tu tombes nez à nez avec le président de la ville. \nPris de court, tu dois faire un choix !");
			ui.choix1.setText("Parler avec le président");
			ui.choix2.setText("Attaquer le président");
			ui.choix3.setText("Continuer ton chemin");
			
			jeu.positionSuivante1 = "parlerPresident";
			jeu.positionSuivante2 = "attaquerPresident";
			jeu.positionSuivante3 = "continuerChemin";
		}
	
	public void parlerPresident() {
		
		if(recetteMagique==0) {
			ui.textePrincipalArea.setText("Président: Bonjour étranger. Je n'ai jamais vu ton visage. \nJe suis vraiment désolé mais je ne peux pas laisser un étranger entrer sur mon territoire.");
			ui.choix1.setText(">");
			ui.choix2.setText("");
			ui.choix3.setText("");
			ui.choix4.setText("");
			
			if(joueur.nom == "Médecin"){
				jeu.positionSuivante1 = "medecin";
			}
			else if(joueur.nom=="Citoyen") {
				jeu.positionSuivante1 = "citoyenApres";
			}
			else{
				jeu.positionSuivante1 = "maladeApres";
			}	
			jeu.positionSuivante2 = "";
			jeu.positionSuivante3 = "";
			jeu.positionSuivante4 = "";
		}
		else if(recetteMagique==1) {
			fin();
		}
	}
	public void attaquerPresident() {
		ui.textePrincipalArea.setText("Président: Wow ne soit pas bête! \nLe président t'a attaqué si fort que tu as dû rennoncer au combat.\n(Tu as reçu 3 points de dégât)");
		joueur.hp = joueur.hp -3;
		ui.nombreHpLabel.setText("" + joueur.hp);
		ui.choix1.setText(">");
		ui.choix2.setText("");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		if(joueur.nom == "Médecin"){
			jeu.positionSuivante1 = "medecin";
		}
		else if(joueur.nom=="Citoyen") {
			jeu.positionSuivante1 = "citoyenApres";
		}
		else{
			jeu.positionSuivante1 = "maladeApres";
		}	
		jeu.positionSuivante2 = "";
		jeu.positionSuivante3 = "";
		jeu.positionSuivante4 = "";
	}
	public void continuerChemin() {
		ui.textePrincipalArea.setText("Tu arrives sur une grosse intersection.\nSi tu vas au sud, tu retournes à l'entrée de la ville.");
		ui.choix1.setText("Aller au Nord");
		ui.choix2.setText("Aller à l'Est");
		ui.choix3.setText("Aller au Sud");
		ui.choix4.setText("Aller à l'Ouest");
		
		jeu.positionSuivante1 = "nord";
		jeu.positionSuivante2 = "est";
		if(joueur.nom == "Médecin"){
			jeu.positionSuivante3 = "medecin";
		}
		else if(joueur.nom=="Citoyen") {
			jeu.positionSuivante3 = "citoyenApres";
		}
		else{
			jeu.positionSuivante3 = "maladeApres";
		}	
		jeu.positionSuivante4 = "ouest";
	}
	public void nord() {
		ui.textePrincipalArea.setText("Il y a un hôpital.\nTu en profites pour te faire vacciner et tu te reposes avec les infirmières.\n\n(Tu gagnes 2 points de vie)");
		joueur.hp = joueur.hp + 2;
		ui.nombreHpLabel.setText("" + joueur.hp);
		ui.choix1.setText("Aller au Sud");
		ui.choix2.setText("");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "continuerChemin";
		jeu.positionSuivante2 = "";
		jeu.positionSuivante3 = "";
		jeu.positionSuivante4 = "";
	}
	public void est() {
		
		if(joueur.armeUtilise.nom=="Scalpel") {
			ui.textePrincipalArea.setText("Tu es entré dans un supermarché et tu as trouvé un couteau!\n\n(Tu as une nouvelle arme: un couteau)");
			
			joueur.armeUtilise = new Arme_Couteau();
			ui.nomArmeLabel.setText(joueur.armeUtilise.nom);
		}
		else {
			ui.textePrincipalArea.setText("Tu es entré dans un supermarché et tu as trouvé un scalpel!\n\n(Tu as une nouvelle arme: un scalpel)");
			
			joueur.armeUtilise = new Arme_Scalpel();
			ui.nomArmeLabel.setText(joueur.armeUtilise.nom);
		}
		
		ui.choix1.setText("Aller à l'Ouest");
		ui.choix2.setText("");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "continuerChemin";
		jeu.positionSuivante2 = "";
		jeu.positionSuivante3 = "";
		jeu.positionSuivante4 = "";
	}
	public void ouest() {
		
		int i = new java.util.Random().nextInt(100)+1;
		
		if(i<90) {
			ennemi = new Ennemi_Pangolin();
		}
		else {
			ennemi = new Ennemi_Bacterie();
		}
		
		ui.textePrincipalArea.setText("Tu te balade dans la ville déserte quand tu te retrouves subitement face à " + ennemi.nomTexte1 + "!");
		ui.choix1.setText("Attaquer");
		ui.choix2.setText("Courir");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "attaquer";
		jeu.positionSuivante2 = "continuerChemin";
		jeu.positionSuivante3 = "";
		jeu.positionSuivante4 = "";
	}
	public void attaquer() {
		
		ui.textePrincipalArea.setText(ennemi.nom + ": " + ennemi.hp + "HP. \n\nQue veux-tu faire ?");
		ui.choix1.setText("Attaquer");
		ui.choix2.setText("Courir");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "attaqueJoueur";
		jeu.positionSuivante2 = "continuerChemin";
		jeu.positionSuivante3 = "";
		jeu.positionSuivante4 = "";
	}
	public void attaqueJoueur() {
		
		int degatMedecin = new java.util.Random().nextInt(joueur.armeUtilise.degat);
		
		ui.textePrincipalArea.setText("Tu viens d'attaquer " + ennemi.nomTexte + " et tu viens de lui faire " + degatMedecin + " points de dégât!");
		
		ennemi.hp = ennemi.hp - degatMedecin;
		
		ui.choix1.setText(">");
		ui.choix2.setText("");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		if(ennemi.hp>0) {
			jeu.positionSuivante1 = "attaqueEnnemi";
			jeu.positionSuivante2 = "";
			jeu.positionSuivante3 = "";
			jeu.positionSuivante4 = "";
		}
		else if(ennemi.hp<1) {
			jeu.positionSuivante1 = "gagner";
			jeu.positionSuivante2 = "";
			jeu.positionSuivante3 = "";
			jeu.positionSuivante4 = "";
		}
	}
	public void attaqueEnnemi() {
		
		int degatEnnemi = new java.util.Random().nextInt(ennemi.attaque);
		
		ui.textePrincipalArea.setText(ennemi.messageAttaque + "\nTu perds " + degatEnnemi + " points de vie!");
		
		joueur.hp = joueur.hp - degatEnnemi;
		ui.nombreHpLabel.setText("" + joueur.hp);
		
		ui.choix1.setText(">");
		ui.choix2.setText("");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		if(joueur.hp>0) {
			jeu.positionSuivante1 = "attaquer";
			jeu.positionSuivante2 = "";
			jeu.positionSuivante3 = "";
			jeu.positionSuivante4 = "";
		}
		else if(joueur.hp<1) {
			jeu.positionSuivante1 = "perdre";
			jeu.positionSuivante2 = "";
			jeu.positionSuivante3 = "";
			jeu.positionSuivante4 = "";
		}
	}
	public void gagner() {
		ui.textePrincipalArea.setText("Tu as remporté le combat face à " + ennemi.nomTexte + "\n" + ennemi.nomTexte + "vient de te délivrer la recette magique pour vaincre la pandémie!\n\n(Tu as obtenu la Recette Magique!)");
		
		recetteMagique = 1; 
	
		ui.choix1.setText("Aller à l'Est");
		ui.choix2.setText("");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "continuerChemin";
		jeu.positionSuivante2 = "";
		jeu.positionSuivante3 = "";
		jeu.positionSuivante4 = "";
	}
	public void perdre() {
		
		ui.textePrincipalArea.setText("Tu es mort!\n\n<PARTIE TERMINÉE>");
	
		ui.choix1.setText("Nouvelle partie");
		ui.choix2.setText("");
		ui.choix3.setText("");
		ui.choix4.setText("");
		
		jeu.positionSuivante1 = "nouvellePartie";
		jeu.positionSuivante2 = "";
		jeu.positionSuivante3 = "";
		jeu.positionSuivante4 = "";
	}
	public void fin() {
		
		ui.textePrincipalArea.setText("Président: Oh Tu as réussi à tuer " + ennemi.nom + "!?\nMerci beaucoup. Tu es un vrai héro!\nTu as sauvé mon territoire de la pandémie!\n\n<FIN>");
		
		ui.choix1.setVisible(false);
		ui.choix2.setVisible(false);
		ui.choix3.setVisible(false);
		ui.choix4.setVisible(false);
	}
	public void nouvellePartie() {
		
		selectionJoueur();
		ge.AfficheEcranAccueil();
	}

}
