
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Initialisation {
	
	private int nombreDeJoueur;
	private String[] listeNomJoueur = new String[4];

///////////////////////////////////////////////////////////////
	public void PositionPiecesDepart (Plateau plateau) {
		switch (this.nombreDeJoueur) {
		
			case 2:
				plateau.modifierPlateau(0,  1, '1');
				plateau.modifierPlateau(0,  5, '2');
				plateau.modifierPlateau(7,  3, 'D');
				
				for(int i = 0; i < 8; i++) {
					plateau.modifierPlateau(i, 7, 'P');
				}
				break;
				
			
			case 3:
				plateau.modifierPlateau(0,  0, '1');
				plateau.modifierPlateau(0,  3, '2');
				plateau.modifierPlateau(0,  6, '3');
				
				for(int i=0; i < 7; i += 3) {
					plateau.modifierPlateau(7,  i, 'D');
				}
				
				for(int i = 0; i < 8; i++) {
					plateau.modifierPlateau(i, 7, 'P');
				}
				break;

				
			case 4:
				plateau.modifierPlateau(0,  0, '1');
				plateau.modifierPlateau(0,  2, '2');
				plateau.modifierPlateau(0,  5, '3');
				plateau.modifierPlateau(0,  7, '4');
				plateau.modifierPlateau(7,  1, 'D');
				plateau.modifierPlateau(7,  6, 'D');
				break;
		}
	}
	
/////////////////////////////////////////////////////////////

	public void joueur (Joueur[] joueur) {

		switch (nombreDeJoueur) {

		case 2 :
			// joueur 1
			joueur[0].setNom(listeNomJoueur[0]);
			joueur[0].setNumero(1);
			joueur[0].setPositionColonne(1);
			joueur[0].setPositionDepartColonne(1);
			
			//joueur 2
			joueur[1].setNom(listeNomJoueur[1]);
			joueur[1].setNumero(2);
			joueur[1].setPositionColonne(5);
			joueur[1].setPositionDepartColonne(5);

			break;

		case 3 :
			// joueur 1
			joueur[0].setNom(listeNomJoueur[0]);
			joueur[0].setNumero(1);
			joueur[0].setPositionColonne(0);
			joueur[0].setPositionDepartColonne(0);

			//joueur 2
			joueur[1].setNom(listeNomJoueur[1]);
			joueur[1].setNumero(2);
			joueur[1].setPositionColonne(3);
			joueur[1].setPositionDepartColonne(3);

			//joueur 3
			joueur[2].setNom(listeNomJoueur[2]);
			joueur[2].setNumero(3);
			joueur[2].setPositionColonne(7);
			joueur[2].setPositionDepartColonne(7);
			
			break;

		case 4 :
			// joueur 1
			joueur[0].setNom(listeNomJoueur[0]);
			joueur[0].setNumero(1);
			joueur[0].setPositionColonne(0);
			joueur[0].setPositionDepartColonne(0);

			//joueur 2
			joueur[1].setNom(listeNomJoueur[1]);
			joueur[1].setNumero(2);
			joueur[1].setPositionColonne(2);
			joueur[1].setPositionDepartColonne(2);
				
			//joueur 3
			joueur[2].setNom(listeNomJoueur[2]);
			joueur[2].setNumero(3);
			joueur[2].setPositionColonne(5);
			joueur[2].setPositionDepartColonne(5);
			
			//joueur 4
			joueur[3].setNom(listeNomJoueur[3]);
			joueur[3].setNumero(4);
			joueur[3].setPositionColonne(7);
			joueur[3].setPositionDepartColonne(7);;

			break;
		}		
	}
	
	
	////////////////////////////////////////////////////////
	
	public void paquet (Joueur[] joueur, Tour tour) {
		ArrayList<String> deckTemporelle = new ArrayList<String>();
		for (int i = 0; i < 18; i++) {
			deckTemporelle.add("avancer");
		}
		for (int i = 0; i < 8; i++) {
			deckTemporelle.add("pivoterDroite");
		}
		for (int i = 0; i < 8; i++) {
			deckTemporelle.add("pivoterGauche");
		}
		for (int i = 0; i < 3; i++) {
			deckTemporelle.add("laser");
		}
		for ( int i = 0; i < 4; i++) {
			Collections.shuffle(deckTemporelle);
			joueur[i].setDeck(deckTemporelle);
		}
		
	}


	////////////////////////////////////////////////////////
	
	public int Ouverture () {

		Random random = new Random();
		int joueurOuvrantLaPartie = random.nextInt(this.nombreDeJoueur);
		return joueurOuvrantLaPartie;

	}
	
////////////////////////////////////////////////////////////////
	
	
	public int getNombreDeJoueur() {
		return nombreDeJoueur;
	}
	public void setNombreDeJoueur(int nombreDeJoueur) {
	this.nombreDeJoueur = nombreDeJoueur;
	}
	public String[] getListeNomJoueur() {
	return listeNomJoueur;
	}
	public void setListeNomJoueur(String[] listeNomJoueur) {
	this.listeNomJoueur = listeNomJoueur;
	}
	
	
}