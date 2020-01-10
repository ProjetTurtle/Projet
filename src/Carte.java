
public class Carte {

////////////////////////////////////////////////
////////////////// 	AVANCER
	
	public void avancer(Joueur[] joueur, Plateau plateau, Fin fin, Tour tour) {
		
		if (joueur[tour.getIndice()].getOrientation() == 'N') {
			if (joueur[tour.getIndice()].getPositionLigne() < 1)  {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');  // modifie la position de celui qui est en train de jouer
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionDepartLigne(), joueur[tour.getIndice()].getPositionDepartColonne(), plateau.numeroJoueurEnChar(joueur, tour));
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
			}
			
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne() - 1, joueur[tour.getIndice()].getPositionColonne()) == ' ') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() - 1, joueur[tour.getIndice()].getPositionColonne(), plateau.numeroJoueurEnChar(joueur, tour));
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionLigne() - 1);
				
			}
			
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne() - 1, joueur[tour.getIndice()].getPositionColonne()) == 'D') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() - 1,joueur[tour.getIndice()].getPositionLigne(), ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');
				if (fin.getNombreDeJoueurActif() == 2) {
					fin.setNomJoueurGagnant1(joueur[tour.getIndice()].getNom());
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
				else {
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
			}
			
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne()) == 'P' || plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne()) == 'G') {
				joueur[tour.getIndice()].setOrientation('S');
				if (joueur[tour.getIndice()].getFileInstructionMode() == 0) {
					joueur[tour.getIndice()].setFileInstructionMode(1);
				}
				else {
					joueur[tour.getIndice()].setFileInstructionMode(0);
				}
			}
			
			else {
				for (int i = 0; i < 4; i++) {
					if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() - 1) == plateau.numeroEnChar(i));
				}
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() - 1, joueur[tour.getIndice()].getPositionColonne(), ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
				// Atention faire que l'autre tortue renvienne elle aussi à sa position de départ
			}
		}
		
		
		
////////////////////////
		else if (joueur[tour.getIndice()].getOrientation() == 'E') {
			if (joueur[tour.getIndice()].getPositionColonne() > 6)  {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');  // modifie la position de celui qui est en train de jouer
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionDepartLigne(), joueur[tour.getIndice()].getPositionDepartColonne(), plateau.numeroJoueurEnChar(joueur, tour));
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() + 1) == ' ') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() + 1, plateau.numeroJoueurEnChar(joueur, tour));
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionLigne() + 1);
				
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne()) == 'D') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionLigne() + 1, ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');
				if (fin.getNombreDeJoueurActif() == 2) {
					fin.setNomJoueurGagnant1(joueur[tour.getIndice()].getNom());
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
				else {
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() + 1) == 'P' || plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne()) == 'G') {
				joueur[tour.getIndice()].setOrientation('S');
				if (joueur[tour.getIndice()].getFileInstructionMode() == 0) {
					joueur[tour.getIndice()].setFileInstructionMode(1);
				}
				else {
					joueur[tour.getIndice()].setFileInstructionMode(0);
				}
				
			}
			else {
				for (int i = 0; i < 4; i++) {
					if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() - 1) == plateau.numeroEnChar(i));
				}
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() - 1, joueur[tour.getIndice()].getPositionColonne(), ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
				// Atention faire que l'autre tortue renvienne elle aussi à sa position de départ
			}
			
		}
		
		
		else if (joueur[tour.getIndice()].getOrientation() == 'S') {
			if (joueur[tour.getIndice()].getPositionLigne() > 6)  {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');  // modifie la position de celui qui est en train de jouer
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionDepartLigne(), joueur[tour.getIndice()].getPositionDepartColonne(), plateau.numeroJoueurEnChar(joueur, tour));
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne() + 1, joueur[tour.getIndice()].getPositionColonne()) == ' ') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() + 1,joueur[tour.getIndice()].getPositionColonne(), plateau.numeroJoueurEnChar(joueur, tour));
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionLigne() + 1);
				
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne() + 1, joueur[tour.getIndice()].getPositionColonne()) == 'D') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() + 1,joueur[tour.getIndice()].getPositionLigne(), ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');
				if (fin.getNombreDeJoueurActif() == 2) {
					fin.setNomJoueurGagnant1(joueur[tour.getIndice()].getNom());
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
				else {
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne()) == 'P' || plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne()) == 'G') {
				joueur[tour.getIndice()].setOrientation('S');
				if (joueur[tour.getIndice()].getFileInstructionMode() == 0) {
					joueur[tour.getIndice()].setFileInstructionMode(1);
				}
				else {
					joueur[tour.getIndice()].setFileInstructionMode(0);
				}
				
			}
			else {
				for (int i = 0; i < 4; i++) {
					if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() - 1) == plateau.numeroEnChar(i));
				}
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() - 1, joueur[tour.getIndice()].getPositionColonne(), ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
				// Atention faire que l'autre tortue renvienne elle aussi à sa position de départ
			}
		}
		
		
		else if (joueur[tour.getIndice()].getOrientation() == 'W') {
			if (joueur[tour.getIndice()].getPositionColonne() < 1)  {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');  // modifie la position de celui qui est en train de jouer
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionDepartLigne(), joueur[tour.getIndice()].getPositionDepartColonne(), plateau.numeroJoueurEnChar(joueur, tour));
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() - 1) == ' ') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne() - 1, plateau.numeroJoueurEnChar(joueur, tour));
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionColonne() - 1);
				
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() - 1) == 'D') {
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionLigne() - 1, ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(),joueur[tour.getIndice()].getPositionColonne(), ' ');
				if (fin.getNombreDeJoueurActif() == 2) {
					fin.setNomJoueurGagnant1(joueur[tour.getIndice()].getNom());
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
				else {
					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);
				}
			}
			else if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() - 1) == 'P' || plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne()) == 'G') {
				joueur[tour.getIndice()].setOrientation('S');
				if (joueur[tour.getIndice()].getFileInstructionMode() == 0) {
					joueur[tour.getIndice()].setFileInstructionMode(1);
				}
				else {
					joueur[tour.getIndice()].setFileInstructionMode(0);
				}
				
			}
			else {
				for (int i = 0; i < 4; i++) {
					if (plateau.regarderPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne() - 1) == plateau.numeroEnChar(i));
				}
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne() - 1, joueur[tour.getIndice()].getPositionColonne(), ' ');
				plateau.modifierPlateau(joueur[tour.getIndice()].getPositionLigne(), joueur[tour.getIndice()].getPositionColonne(), ' ');
				joueur[tour.getIndice()].setPositionLigne(joueur[tour.getIndice()].getPositionDepartLigne());
				joueur[tour.getIndice()].setPositionColonne(joueur[tour.getIndice()].getPositionDepartColonne());
				joueur[tour.getIndice()].setOrientation('S');
				// Atention faire que l'autre tortue renvienne elle aussi à sa position de départ
			}
		}
		
	}
	
	
	/**
	 * 	PIVOTER A DROITE
	 * @param joueur
	 * @param tour
	 */
	public void pivoterDroite (Joueur[] joueur, Tour tour) {
		if (joueur[tour.getIndice()].getOrientation() == 'N') {
			joueur[tour.getIndice()].setOrientation('E');
		}
		else if (joueur[tour.getIndice()].getOrientation() == 'E') {
			joueur[tour.getIndice()].setOrientation('S');
		}
		else if (joueur[tour.getIndice()].getOrientation() == 'S') {
			joueur[tour.getIndice()].setOrientation('W');
		}
		else {
			joueur[tour.getIndice()].setOrientation('N');
		}
	}
	
	
	/**
	 * PIVOTER A GAUCHE
	 * @author pabe10705
	 * @param joueur
	 * @param Tour tour
	 * @return nothing
	 */
	public void pivoterGauche (Joueur[] joueur, Tour tour) {
		
		if (joueur[tour.getIndice()].getOrientation() == 'N') {
			joueur[tour.getIndice()].setOrientation('W');
		}
		else if (joueur[tour.getIndice()].getOrientation() == 'W') {
			joueur[tour.getIndice()].setOrientation('S');
		}
		else if (joueur[tour.getIndice()].getOrientation() == 'S') {
			joueur[tour.getIndice()].setOrientation('E');
		}
		else {
			joueur[tour.getIndice()].setOrientation('N');
		}
	}
	
	
///////////////////////////////////////////////////
/////////////////// LASER
	
	public void laser (Joueur[] joueur, Plateau plateau, Tour tour) {
		int positionLaserLigne = joueur[tour.getIndice()].getPositionLigne();
		int positionLaserColonne = joueur[tour.getIndice()].getPositionColonne();
		
		if (joueur[tour.getIndice()].getOrientation() == 'N') {
			
			while(positionLaserLigne > 1) {
				if ( plateau.regarderPlateau(positionLaserLigne - 1, positionLaserColonne) == ' ') {
					positionLaserLigne -= 1;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne - 1, positionLaserColonne) == 'P') {
					break;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne - 1, positionLaserColonne) == 'G') {
					plateau.modifierPlateau(positionLaserLigne - 1, positionLaserColonne, ' ');
					break;
				}
				else {
					for (int i = 0; i < 4; i++) {
						if (plateau.regarderPlateau(positionLaserLigne, positionLaserColonne + 1) == plateau.numeroEnChar(i)) {
							break;
						}
					}
				}


			}
		}
		
		
		else if (joueur[tour.getIndice()].getOrientation() == 'E') {
			while(positionLaserColonne < 6) {
				if ( plateau.regarderPlateau(positionLaserLigne, positionLaserColonne + 1) == ' ') {
					positionLaserLigne += 1;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne, positionLaserColonne + 1) == 'P') {
					break;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne, positionLaserColonne + 1) == 'G') {
					plateau.modifierPlateau(positionLaserLigne, positionLaserColonne + 1, ' ');
					break;
				}
				else {
					for (int i = 0; i < 4; i++) {
						if (plateau.regarderPlateau(positionLaserLigne, positionLaserColonne + 1) == plateau.numeroEnChar(i)) {
							break;
						}
					}
				}
			}
		}
		
		
		
		else if (joueur[tour.getIndice()].getOrientation() == 'S') {
			while(positionLaserLigne < 6) {
				if ( plateau.regarderPlateau(positionLaserLigne + 1, positionLaserColonne) == ' ') {
					positionLaserLigne += 1;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne + 1, positionLaserColonne) == 'P') {
					break;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne + 1, positionLaserColonne) == 'G') {
					plateau.modifierPlateau(positionLaserLigne + 1, positionLaserColonne, ' ');
					break;
				}
				else {
					for (int i = 0; i < 4; i++) {
						if (plateau.regarderPlateau(positionLaserLigne, positionLaserColonne + 1) == plateau.numeroEnChar(i)) {
							break;
						}
					}
				}
			}
		}
		
		
		else if (joueur[tour.getIndice()].getOrientation() == 'W') {
			while(positionLaserColonne > 1) {
				if ( plateau.regarderPlateau(positionLaserLigne, positionLaserColonne - 1) == ' ') {
					positionLaserLigne -= 1;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne, positionLaserColonne - 1) == 'P') {
					break;
				}
				else if ( plateau.regarderPlateau(positionLaserLigne, positionLaserColonne - 1) == 'G') {
					plateau.modifierPlateau(positionLaserLigne, positionLaserColonne - 1, ' ');
					break;
				}
				else {
					for (int i = 0; i < 4; i++) {
						if (plateau.regarderPlateau(positionLaserLigne, positionLaserColonne + 1) == plateau.numeroEnChar(i)) {
							break;
						}
					}
				}
			}
		}
		
		
	}

}
