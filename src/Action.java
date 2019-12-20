public class Action {

	////////////////////////////////////////////////////////////////////////

	public void construire(String pierreOuGlace, int numeroCase, Plateau plateau, Joueur joueur, Tour tour) {
		if (plateau.caseNombre(numeroCase) == ' ') {
			if (pierreOuGlace.equals("P")) {
				if (joueur.getNombreObstaclePierre(tour.getIndice()) > 0) {
					plateau.setCase(numeroCase, 'P');
					joueur.setNombreObstaclePierre(joueur.getNumero(tour.getIndice()),
							joueur.getNombreObstaclePierre(tour.getIndice()) - 1);
				} else {
					System.out.println("plus d'obstacle en pierre à disposition");
					tour.refaire();
				}
			} else if (pierreOuGlace.equals("G")) {
				if (joueur.getNombreObstacleGlace(tour.getIndice()) > 0) {
					plateau.setCase(numeroCase, 'G');
					joueur.setNombreObstacleGlace(joueur.getNumero(numeroCase),
							joueur.getNombreObstacleGlace(tour.getIndice()) - 1);
				} else {
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

	public void completer(Joueur joueur, Tour tour, String action1, String action2, String action3, String action4,
			String action5) {
		ArrayDeque<String> fileInstructionTemporelle = new ArrayDeque<String>();
		fileInstructionTemporelle = joueur.getFileInstruction(tour.getIndice());
		fileInstructionTemporelle.add(action1);
		System.out.println(joueur.getFileInstruction(tour.getIndice()).getLast());
		fileInstructionTemporelle.add(action2);
		System.out.println(joueur.getFileInstruction(tour.getIndice()).getLast());
		fileInstructionTemporelle.add(action3);
		System.out.println(joueur.getFileInstruction(tour.getIndice()).getLast());
		fileInstructionTemporelle.add(action4);
		System.out.println(joueur.getFileInstruction(tour.getIndice()).getLast());
		fileInstructionTemporelle.add(action5);
		System.out.println(joueur.getFileInstruction(tour.getIndice()).getLast());
		joueur.setFileInstruction(tour.getIndice(), fileInstructionTemporelle);
	}

	//////////////////////////////////////////////////////////////////

	public void executer(Joueur joueur, Plateau plateau, Fin fin, Carte carte, Tour tour) {
		if (joueur.getFileInstruction(tour.getIndice()).size() > 0) {
			while (joueur.getFileInstruction(tour.getIndice()).size() > 0) {
				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {
					String actionEnCour = joueur.getFileInstruction(tour.getIndice()).removeFirst();
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

					String actionEnCour = joueur.getFileInstruction(tour.getIndice()).removeLast();

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

			System.out.println("votre file d'instruction est vide");
			tour.refaire();
		}
	}
}