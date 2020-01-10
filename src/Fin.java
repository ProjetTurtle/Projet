
public class Fin {
	
	private int nombreDeJoueurActif;
	private String nomJoueurGagnant1;
	private String nomJoueurGagnant2;
	private String nomJoueurGagnant3;
	private String nomJoueurGagnant4;
	

///////////////////////////////////////////////////////////////
	
	
	public void afficher(Initialisation initialisation) {
		if (initialisation.getNombreDeJoueur() == 2) {
			System.out.println(" Gagnant : " + this.nomJoueurGagnant1);

		}
		else if (initialisation.getNombreDeJoueur()== 3) {
			System.out.println(" Premier : " + this.nomJoueurGagnant1);
			System.out.println(" Deuxième " + this.nomJoueurGagnant2);
			System.out.println(" Troisième " + this.nomJoueurGagnant3);

		}
		else { 
			System.out.println(" Premier : " + this.nomJoueurGagnant1);
			System.out.println(" Deuxième : " + this.nomJoueurGagnant2);
			System.out.println(" Troisième : " + this.nomJoueurGagnant3);
			System.out.println(" Quatrième : " + this.nomJoueurGagnant4);
		}
		
	}
	
	
	
///////////////////////////////////////////////////////////////


	public int getNombreDeJoueurActif () {
		return nombreDeJoueurActif;
	}
	public void setNombreDeJoueurActif (int nombreDeJoueurActif) {
		this.nombreDeJoueurActif = nombreDeJoueurActif;
	}
	public String getNomJoueurGagnant1() {
		return nomJoueurGagnant1;
	}
	public void setNomJoueurGagnant1(String nomJoueurGagnant1) {
		this.nomJoueurGagnant1 = nomJoueurGagnant1;
	}
	public String getNomJoueurGagnant2() {
		return nomJoueurGagnant2;
	}
	public void setNomJoueurGagnant2(String nomJoueurGagnant2) {
		this.nomJoueurGagnant2 = nomJoueurGagnant2;
	}
	public String getNomJoueurGagnant3() {
		return nomJoueurGagnant3;
	}
	public void setNomJoueurGagnant3(String nomJoueurGagnant3) {
		this.nomJoueurGagnant3 = nomJoueurGagnant3;
	}
	public String getNomJoueurGagnant4() {
		return nomJoueurGagnant4;
	}
	public void setNomJoueurGagnant4(String nomJoueurGagnant4) {
		this.nomJoueurGagnant4 = nomJoueurGagnant4;
	}


}
