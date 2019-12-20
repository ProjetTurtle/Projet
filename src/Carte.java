public class Carte {

	////////////////////////////////////////////////

	////////////////// AVANCER

	public void avancer(Joueur joueur, Plateau plateau, Fin fin, Tour tour) {

		if (joueur.getOrientation(tour.getIndice()) == 'N') {

			if (joueur.getPosition(tour.getIndice()) < 9) {

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' '); // modifie la position de celui qui est en
																			// train de jouer

				plateau.setCase(joueur.getPositionDepart(tour.getIndice()), plateau.numeroJoueurEnChar(joueur));

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == ' ') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 8, plateau.numeroJoueurEnChar(joueur));

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPosition(tour.getIndice()) - 8);

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == 'D') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				if (fin.getNombreDeJoueurActif() == 2) {

					fin.setNomJoueurGagnant1(joueur.getNom(tour.getIndice()));

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

				else {

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == 'P') {

				joueur.setOrientation(tour.getIndice(), 'S');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == 'G') {

				joueur.setOrientation(tour.getIndice(), 'S');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == '1') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == '2') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == '3') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 8) == '4') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

		}

		////////////////////////

		else if (joueur.getOrientation(tour.getIndice()) == 'E') {

			if (joueur.getPosition(tour.getIndice()) % 8 == 0) {

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				plateau.setCase(joueur.getPositionDepart(tour.getIndice()), plateau.numeroJoueurEnChar(joueur));

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == ' ') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 1, plateau.numeroJoueurEnChar(joueur));

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPosition(tour.getIndice()) + 1);

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == 'D') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				if (fin.getNombreDeJoueurActif() == 2) {

					fin.setNomJoueurGagnant1(joueur.getNom(tour.getIndice()));

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

				else {

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == 'P') {

				joueur.setOrientation(tour.getIndice(), 'W');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == 'G') {

				joueur.setOrientation(tour.getIndice(), 'W');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == '1') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == '2') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == '3') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 1) == '4') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'S') {

			if (joueur.getPosition(tour.getIndice()) > 56) {

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				plateau.setCase(joueur.getPositionDepart(tour.getIndice()), plateau.numeroJoueurEnChar(joueur));

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == ' ') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 8, plateau.numeroJoueurEnChar(joueur));

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPosition(tour.getIndice()) + 8);

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == 'D') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				if (fin.getNombreDeJoueurActif() == 2) {

					fin.setNomJoueurGagnant1(joueur.getNom(tour.getIndice()));

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

				else {

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == 'P') {

				joueur.setOrientation(tour.getIndice(), 'N');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == 'G') {

				joueur.setOrientation(tour.getIndice(), 'N');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == '1') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == '2') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == '3') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) + 8) == '4') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) + 8, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'W') {

			if (joueur.getPosition(tour.getIndice()) % 8 == 1) {

				// attention le modulo était faux !!!!

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				plateau.setCase(joueur.getPositionDepart(tour.getIndice()), plateau.numeroJoueurEnChar(joueur));

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				// orientation ajoutée

				joueur.setOrientation(tour.getIndice(), 'S');

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == ' ') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 1, plateau.numeroJoueurEnChar(joueur));

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPosition(tour.getIndice()) - 1);

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == 'D') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				if (fin.getNombreDeJoueurActif() == 2) {

					fin.setNomJoueurGagnant1(joueur.getNom(tour.getIndice()));

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

				else {

					fin.setNombreDeJoueurActif(fin.getNombreDeJoueurActif() - 1);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == 'P') {

				joueur.setOrientation(tour.getIndice(), 'E');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == 'G') {

				joueur.setOrientation(tour.getIndice(), 'E');

				if (joueur.getFileInstructionMode(tour.getIndice()) == 0) {

					joueur.setFileInstructionMode(tour.getIndice(), 1);

				}

				else {

					joueur.setFileInstructionMode(tour.getIndice(), 0);

				}

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == '1') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == '2') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == '3') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

			else if (plateau.caseNombre(joueur.getPosition(tour.getIndice()) - 1) == '4') {

				plateau.setCase(joueur.getPosition(tour.getIndice()) - 1, ' ');

				plateau.setCase(joueur.getPosition(tour.getIndice()), ' ');

				joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

				joueur.setOrientation(tour.getIndice(), 'S');

				// Atention faire que l'autre tortue renvienne elle aussi à sa position de
				// départ

			}

		}

	}

	/**
	 * 
	 * PIVOTER A DROITE
	 * 
	 * @param joueur
	 * 
	 * @param tour
	 * 
	 */

	public void pivoterDroite(Joueur joueur, Tour tour) {

		if (joueur.getOrientation(tour.getIndice()) == 'N') {

			joueur.setOrientation(tour.getIndice(), 'E');

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'E') {

			joueur.setOrientation(tour.getIndice(), 'S');

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'S') {

			joueur.setOrientation(tour.getIndice(), 'W');

		}

		else {

			joueur.setOrientation(tour.getIndice(), 'N');

		}

	}

	/**
	 * 
	 * PIVOTER A GAUCHE
	 * 
	 * @author pabe10705
	 * 
	 * @param joueur
	 * 
	 * @param Tour
	 *            tour
	 * 
	 * @return nothing
	 * 
	 */

	public void pivoterGauche(Joueur joueur, Tour tour) {

		if (joueur.getOrientation(tour.getIndice()) == 'N') {

			joueur.setOrientation(tour.getIndice(), 'W');

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'W') {

			joueur.setOrientation(tour.getIndice(), 'S');

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'S') {

			joueur.setOrientation(tour.getIndice(), 'E');

		}

		else {

			joueur.setOrientation(tour.getIndice(), 'N');

		}

	}

	///////////////////////////////////////////////////

	/////////////////// LASER

	public void laser(Joueur joueur, Plateau plateau, Tour tour) {

		if (joueur.getOrientation(tour.getIndice()) == 'N') {

			int positionLaser = joueur.getPosition(tour.getIndice());

			while (positionLaser < 0) {

				if (plateau.caseNombre(positionLaser - 8) == ' ') {

					positionLaser -= 8;

				}

				else if (plateau.caseNombre(positionLaser - 8) == 'P') {

					break;

				}

				else if (plateau.caseNombre(positionLaser - 8) == 'G') {

					plateau.setCase(positionLaser - 8, ' ');

					break;

				}

				else if (plateau.caseNombre(positionLaser - 8) == '1') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser - 8) == '2') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser - 8) == '3') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser - 8) == '4') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

			}

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'E') {

			int positionLaser = joueur.getPosition(tour.getIndice());

			while (positionLaser % 8 == 0) {

				if (plateau.caseNombre(positionLaser + 1) == ' ') {

					positionLaser += 1;

				}

				else if (plateau.caseNombre(positionLaser + 1) == 'P') {

					break;

				}

				else if (plateau.caseNombre(positionLaser + 1) == 'G') {

					plateau.setCase(positionLaser + 1, ' ');

					break;

				}

				else if (plateau.caseNombre(positionLaser + 1) == '1') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser + 1) == '2') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser + 1) == '3') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser + 1) == '4') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

			}

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'S') {

			int positionLaser = joueur.getPosition(tour.getIndice());

			while (positionLaser > 64) {

				if (plateau.caseNombre(positionLaser + 8) == ' ') {

					positionLaser -= 8;

				}

				else if (plateau.caseNombre(positionLaser + 8) == 'P') {

					break;

				}

				else if (plateau.caseNombre(positionLaser + 8) == 'G') {

					plateau.setCase(positionLaser - 8, ' ');

					break;

				}

				else if (plateau.caseNombre(positionLaser + 8) == '1') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser + 8) == '2') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser + 8) == '3') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser + 8) == '4') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser + 8) == 'D') {

					while (positionLaser < 0) {

						if (plateau.caseNombre(positionLaser - 8) == ' ') {

							positionLaser -= 8;

						}

						else if (plateau.caseNombre(positionLaser - 8) == '1') {

							joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

							joueur.setOrientation(tour.getIndice(), 'S');

							break;

						}

						else if (plateau.caseNombre(positionLaser - 8) == '2') {

							joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

							joueur.setOrientation(tour.getIndice(), 'S');

							break;

						}

						else if (plateau.caseNombre(positionLaser - 8) == '3') {

							joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

							joueur.setOrientation(tour.getIndice(), 'S');

							break;

						}

						else if (plateau.caseNombre(positionLaser - 8) == '4') {

							joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

							joueur.setOrientation(tour.getIndice(), 'S');

							break;

						}

						break;

					}

				}

			}

		}

		else if (joueur.getOrientation(tour.getIndice()) == 'W') {

			int positionLaser = joueur.getPosition(tour.getIndice());

			while (positionLaser < 0) {

				if (plateau.caseNombre(positionLaser - 1) == ' ') {

					positionLaser -= 1;

				}

				else if (plateau.caseNombre(positionLaser - 1) == 'P') {

					break;

				}

				else if (plateau.caseNombre(positionLaser - 1) == 'G') {

					plateau.setCase(positionLaser - 1, ' ');

					break;

				}

				else if (plateau.caseNombre(positionLaser - 1) == '1') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser - 1) == '2') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser - 1) == '3') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

				else if (plateau.caseNombre(positionLaser - 1) == '4') {

					joueur.setPosition(tour.getIndice(), joueur.getPositionDepart(tour.getIndice()));

					break;

				}

			}

		}

	}

}