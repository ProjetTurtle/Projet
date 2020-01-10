import java.util.ArrayDeque;


public class Action {
	
	
////////////////////////////////////////////////////////////////////////
	
	public void construire (String pierreOuGlace, int indiceLigne, int indiceColonne, Plateau plateau, Joueur[] joueur, Tour tour) {
		if (plateau.regarderPlateau(indiceLigne, indiceColonne) == ' ') {
			if (pierreOuGlace.equals("P")) {
				if (joueur[tour.getIndice()].getNombreObstaclePierre() > 0) {
					plateau.modifierPlateau(indiceLigne, indiceColonne, 'P');
					joueur[tour.getIndice()].setNombreObstaclePierre(joueur[tour.getIndice()].getNombreObstaclePierre() - 1 );
				}
				else {
					System.out.println("plus d'obstacle en pierre à disposition");
					tour.refaire();
				}
			}
			else if (pierreOuGlace.equals("G")) {
				if (joueur[tour.getIndice()].getNombreObstacleGlace() > 0) {
					plateau.modifierPlateau(indiceLigne, indiceColonne, 'G');
					joueur[tour.getIndice()].setNombreObstacleGlace(joueur[tour.getIndice()].getNombreObstacleGlace() - 1 );
				}
				else {
					System.out.println("plus d'obstacle en glace à disposition");
					tour.refaire();
				}
			}
				
			}
		else {
			System.out.println("la case désignée est déjà occupée");
			tour.refaire();

		}
	}
	
/////////////////////////////////////////////////////////////////
	
	
	public void completer (Joueur[] joueur, Tour tour, String action1, String action2, String action3, String action4, String action5) {
		ArrayDeque<String> fileInstructionTemporelle = new ArrayDeque<String>();
		fileInstructionTemporelle = joueur[tour.getIndice()].getFileInstruction();
		fileInstructionTemporelle.add(action1);
		fileInstructionTemporelle.add(action2);
		fileInstructionTemporelle.add(action3);
		fileInstructionTemporelle.add(action4);
		fileInstructionTemporelle.add(action5);
		joueur[tour.getIndice()].setFileInstruction(fileInstructionTemporelle);
	}
	

//////////////////////////////////////////////////////////////////
	
	public void executer (Joueur[] joueur, Plateau plateau, Fin fin, Carte carte, Tour tour) {
		if ( joueur[tour.getIndice()].getFileInstruction().size() > 0) {
			while (joueur[tour.getIndice()].getFileInstruction().size() > 0) {
				if (joueur[tour.getIndice()].getFileInstructionMode() == 0) {
					String actionEnCour = joueur[tour.getIndice()].getFileInstruction().removeFirst();
					if (actionEnCour.equals("avancer")) {
						carte.avancer(joueur, plateau, fin, tour);
					}
					if (actionEnCour.equals("pivoterDroite")) {
						carte.pivoterDroite(joueur, tour);
					}
					if (actionEnCour.equals("pivoterGauche")) {
						carte.pivoterGauche(joueur, tour);
					}
					if (actionEnCour.equals("laser")) {
						carte.laser(joueur, plateau, tour);
					}
				}
				else {
					String actionEnCour = joueur[tour.getIndice()].getFileInstruction().removeLast();
					if (actionEnCour.equals("avancer")) {
						carte.avancer(joueur, plateau, fin, tour);
					}
					if (actionEnCour.equals("pivoterDroite")) {
						carte.pivoterDroite(joueur, tour);
					}
					if (actionEnCour.equals("pivoterGauche")) {
						carte.pivoterGauche(joueur, tour);
					}
					if (actionEnCour.equals("laser")) {
						carte.laser(joueur, plateau, tour);
					}
					
				}
			}
		}
		else {
			System.out.println(joueur[tour.getIndice()].getFileInstruction());
			System.out.println("votre file d'instruction est vide");
			tour.refaire();
		}
		
	}

}
