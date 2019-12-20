
import java.util.ArrayList;

public class Tour {
	

	private int indice = 1;
	private ArrayList<Integer> ordre = new ArrayList<Integer>();
	private int numeroDuJoueurCommencant;
	private int nombreDeJoueurActif;

	
	//////////////////////////////////////////////
	
	
	public void ordre(int nombreDeJoueur, Joueur joueur) {
		  if (nombreDeJoueur == 2) {
			  if (this.numeroDuJoueurCommencant == 0) {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(1);
				  ordreTemporelle.add(2);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(0,1);
				  joueur.setNumeroPassage(1,2);
			  }
			  else {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(2);
				  ordreTemporelle.add(1);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(1,2);
				  joueur.setNumeroPassage(0,1);
			  }
			  
		  }
		  else if (nombreDeJoueur == 3) {
			  if (this.numeroDuJoueurCommencant == 0) {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(1);
				  ordreTemporelle.add(2);
				  ordreTemporelle.add(3);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(0,1);
				  joueur.setNumeroPassage(1,2);
				  joueur.setNumeroPassage(2,3);
			  }
			  else if (this.numeroDuJoueurCommencant == 1) {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(2);
				  ordreTemporelle.add(3);
				  ordreTemporelle.add(1);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(1,2);
				  joueur.setNumeroPassage(2,3);
				  joueur.setNumeroPassage(0,1);
			  }
			  else {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(3);
				  ordreTemporelle.add(1);
				  ordreTemporelle.add(2);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(2,3);
				  joueur.setNumeroPassage(0,1);
				  joueur.setNumeroPassage(1,2);
			  }
			  
		  }
		  else {
			  if (this.numeroDuJoueurCommencant == 0) {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(1);
				  ordreTemporelle.add(2);
				  ordreTemporelle.add(3);
				  ordreTemporelle.add(4);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(0,1);
				  joueur.setNumeroPassage(1,2);
				  joueur.setNumeroPassage(2,3);
				  joueur.setNumeroPassage(3,4);
			  }
			  else if (this.numeroDuJoueurCommencant == 1) {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(2);
				  ordreTemporelle.add(3);
				  ordreTemporelle.add(4);
				  ordreTemporelle.add(1);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(1,2);
				  joueur.setNumeroPassage(2,3);
				  joueur.setNumeroPassage(3,4);
				  joueur.setNumeroPassage(0,1);
			  }
			  else if (this.numeroDuJoueurCommencant == 2) {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(3);
				  ordreTemporelle.add(4);
				  ordreTemporelle.add(1);
				  ordreTemporelle.add(2);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(2,3);
				  joueur.setNumeroPassage(3,4);
				  joueur.setNumeroPassage(0,1);
				  joueur.setNumeroPassage(1,2);
			  }
			  else {
				  ArrayList<Integer> ordreTemporelle = new ArrayList<Integer>();
				  ordreTemporelle.add(4);
				  ordreTemporelle.add(1);
				  ordreTemporelle.add(2);
				  ordreTemporelle.add(3);
				  this.ordre = ordreTemporelle;
				  joueur.setNumeroPassage(3,4);
				  joueur.setNumeroPassage(0,1);
				  joueur.setNumeroPassage(1,2);
				  joueur.setNumeroPassage(2,3);
			  }
			  
		  }
	}
	
	
	
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


	public ArrayList<Integer> getOrdre() {
		return ordre;
	}


	public void setOrdre(ArrayList<Integer> ordre) {
		this.ordre = ordre;
	}



	public int getNuméroDuJoueurCommençant() {
		return numeroDuJoueurCommencant;
	}



	public void setNuméroDuJoueurCommençant(int numéroDuJoueurCommençant) {
		this.numeroDuJoueurCommencant = numéroDuJoueurCommençant;
	}
	
	public int getNombreDeJoueurActif() {
		return nombreDeJoueurActif;
	}

	public void setNombreDeJoueurActif(int nombreDeJoueurActif) {
		this.nombreDeJoueurActif = nombreDeJoueurActif;
	}
	

}
