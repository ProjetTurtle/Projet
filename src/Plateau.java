public class Plateau {
	
	public char[][] plateau;
	
	public void initialiserPlateau() {
		 plateau = new char [8][8];
		 for(int i=0; i<8; i++) {
			 for(int j=0; j<8; j++) {
				 plateau[i][j]=' '; //on initialise le tableau avec un espace dans chaque case (ligne, colonne)
			 }
		 }
	 }
	 
	 public void afficherPlateau() {
		 System.out.println("  01234567");  
		 System.out.println(" +--------+");
		 System.out.println("0|" + plateau[0][0] + plateau[0][1] + plateau[0][2] + plateau[0][3] + plateau[0][4] + plateau[0][5] + plateau[0][6] + plateau[0][7] + "|");
		 System.out.println("1|" + plateau[1][0] + plateau[1][1] + plateau[1][2] + plateau[1][3] + plateau[1][4] + plateau[1][5] + plateau[1][6] + plateau[1][7] + "|");
		 System.out.println("2|" + plateau[2][0] + plateau[2][1] + plateau[2][2] + plateau[2][3] + plateau[2][4] + plateau[2][5] + plateau[2][6] + plateau[2][7] + "|");
		 System.out.println("3|" + plateau[3][0] + plateau[3][1] + plateau[3][2] + plateau[3][3] + plateau[3][4] + plateau[3][5] + plateau[3][6] + plateau[3][7] + "|");
		 System.out.println("4|" + plateau[4][0] + plateau[4][1] + plateau[4][2] + plateau[4][3] + plateau[4][4] + plateau[4][5] + plateau[4][6] + plateau[4][7] + "|");
		 System.out.println("5|" + plateau[5][0] + plateau[5][1] + plateau[5][2] + plateau[5][3] + plateau[5][4] + plateau[5][5] + plateau[5][6] + plateau[5][7] +"|");
		 System.out.println("6|" + plateau[6][0] + plateau[6][1] + plateau[6][2] + plateau[6][3] + plateau[6][4] + plateau[6][5] + plateau[6][6] + plateau[6][7] +"|");
		 System.out.println("7|" + plateau[7][0] + plateau[7][1] + plateau[7][2] + plateau[7][3] + plateau[7][4] + plateau[7][5] + plateau[7][6] + plateau[7][7] +"|");
		 System.out.println(" +--------+" );
	 }
	 
	 
	public char numeroJoueurEnChar(Joueur[] joueur, Tour tour) {
		if (joueur[tour.getIndice()].getNumero() == 1) {
			return '1';
		}
		else if (joueur[tour.getIndice()].getNumero() == 2) {
			return '2';
		}
		else if (joueur[tour.getIndice()].getNumero() == 3) {
			return '3';
		}
		else {
			return '4';
		}
		}
	
	/////////////////////////////////////
	
	
	public char numeroEnChar (int i) {
		if (i == 0) {
			return '1';
		}
		else if (i == 1) {
			return '2';
		}
		else if (i == 2) {
			return '3';
		}
		else {
			return '4';
		}
	}
	 
	
	 
	 

	public void modifierPlateau(int indiceLigne, int indiceColonne, char nouveau) {
		plateau[indiceLigne][indiceColonne] = nouveau;
		
	}
	
	public char regarderPlateau (int indiceLigne, int indiceColonne) {
		return plateau[indiceLigne][indiceColonne];
	}
}