
public class Tour {
	

	private int indice = 0;
	private int nombreDeJoueurActif;

	
////////////////////////////////////////////////////
	
	
	////////////////////////////////////////////
	//////	Bouclage indice
	
	public void fin() {
		if (this.indice == nombreDeJoueurActif - 1) {
    		this.indice = 0;
    	}
    	else {
    		this.indice += 1;
    	}
	}
	
	////////////////////////////////////////////
	//////	Refaire son tour
	
	public void refaire () {
		if (this.indice == 0) {
			this.indice = nombreDeJoueurActif - 1;
		}
		else {
			this.indice -= 1;
		}
	}

	
////////////////////////////////////////////////////
	


	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	
	public int getNombreDeJoueurActif() {
		return nombreDeJoueurActif;
	}

	public void setNombreDeJoueurActif(int nombreDeJoueurActif) {
		this.nombreDeJoueurActif = nombreDeJoueurActif;
	}
	

}
