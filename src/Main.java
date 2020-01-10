import java.util.Scanner;



public class Main {

	/**
	 * Point  d'entrée du programme
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("					BIENVENUE SUR ROBOT TURTLES" + "\n");
		
	    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////                   Menu                  ///////////////////////////////////////////////
		
		
		// tests
		Fenetre fenetre = new Fenetre();
		fenetre.graphique();

		
		/////////////////////////////////////////
	    ///////////// Demande le nombre de joueur
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Combien de joueur souhaitent jouer ?");
		System.out.println(" -->        2 ou 3 ou 4 ?");
		int nombreDeJoueur = scanner.nextInt();
		// Attention : IL FAUT VERIFIER QUE L'ENTREE EST DE TYPE INT !!!!!
		while (nombreDeJoueur < 2 || nombreDeJoueur > 4) {
			System.out.println(" Veuillez entrer un chiffre parmi les suivants : ");
			System.out.println(" 2 ou 3 ou 4");
			nombreDeJoueur = scanner.nextInt();
		}
		System.out.println("Vous avez choisi de lancer une partie à " + nombreDeJoueur + " joueurs" + "\n");
		
		
		
	    ////////////////////////////////////////
	    /////////// Initialise le nombre de joueur
	    Initialisation initialisation = new Initialisation();
	    initialisation.setNombreDeJoueur(nombreDeJoueur);
	    
	    
	    ////////////////////////////////////////
	    /////////// Initialise le nom des joueurs
	    String[] NomJoueur = new String[nombreDeJoueur];
	    scanner.nextLine();
	    for (int i = 0; i < nombreDeJoueur; i++) {
	    	System.out.println("Veuillez entrer le nom du joueur numéro " + i);
	    	String nom = scanner.nextLine();
	    	NomJoueur[i] = nom;
	    }
	    initialisation.setListeNomJoueur(NomJoueur);
	    
	    ///////////////////////////////////////
	    ///////////Initialise la rotation des tours
	    Tour tour = new Tour();
	    tour.setNombreDeJoueurActif(nombreDeJoueur);

	    
	    ////////////////////////////////////////
	    /////////// Initialise le plateau
	    Plateau plateau = new Plateau();
	    plateau.initialiserPlateau();
	    initialisation.PositionPiecesDepart(plateau);
	    
	    
	    ///////////////////////////////////////
	    /////////// Initialise chaque joueur
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		Joueur joueur3 = new Joueur();
		Joueur joueur4 = new Joueur();
		Joueur[] joueur = new Joueur[] {joueur1,joueur2,joueur3,joueur4};
	    initialisation.joueur(joueur);
	    

	    ///////////////////////////////////////
	    /////////// Initialise le paquet de carte
	    Paquet paquet = new Paquet();
	    initialisation.paquet(joueur, tour);
	    
	    

	    ///////////////////////////////////////
	    ///////////Initialise les cartes
	    Carte carte = new Carte();
	    
	    
	    ///////////////////////////////////////
	    ///////////Initialise la condition de fin
	    Fin fin = new Fin();
	    fin.setNombreDeJoueurActif(nombreDeJoueur);
	    
	    
	    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	    ////////////////////////////////////                    Lancement du jeu                    ///////////////////////////////////////////          
	    
	    
	    
	    // attention lorsqu'un joueur attérit sur un diament, il ne peut plus jouer son tour
	    // il faut rajouter une sécurité du style : private int fini = 0; 
	    // avec 0 lorsque le joueur est toujours en jeu
	    // avec 1 si le joueur n'est plus en jeu
	    
	    

	    Action action = new Action();
	    while (fin.getNombreDeJoueurActif() > 1) {
	    	
	    	plateau.afficherPlateau();
	    	System.out.println();
	    	System.out.println(joueur[tour.getIndice()].getNom() + " est ligne : " + joueur[tour.getIndice()].getPositionLigne() + " et est colonne " + joueur[tour.getIndice()].getPositionColonne());
	    	System.out.println(joueur[tour.getIndice()].getNom() + " est orientation : " + joueur[tour.getIndice()].getOrientation());
	    	System.out.println("\n");
	    	System.out.println(" C'est au tour de : " + joueur[tour.getIndice()].getNom() + ", il joue la tortue " + joueur[tour.getIndice()].getNumero());
	    	System.out.println();
		    System.out.println(" Quel action souhaitez-vous réaliser ?");
		    System.out.println(" Construire un mur = M, Executer le programme = E, Compléter le programme = C");
		    System.out.println(" --> M ou E ou C");
		    String reponse = scanner.nextLine();
		    if (reponse.equals("M")) {
		    	System.out.println("Quel type de Mur voulez-vous construire ?");
		    	System.out.println(" Mur de glace = G, Mur de Pierre = P");
		    	System.out.println("--> G ou P");
		    	String pierreOuGlace = scanner.nextLine();
		    	System.out.println(" Sur quelle ligne voulez-vous construire ce mur ?");
		    	int indiceLigne = scanner.nextInt();
		    	System.out.println(" Sur quelle colonne voulez-vous construire ce mur ?");
		    	int indiceColonne = scanner.nextInt();
		    	action.construire(pierreOuGlace, indiceLigne, indiceColonne, plateau, joueur, tour);
		    	scanner.nextLine();
		    	tour.fin();
		    }
		    if (reponse.equals("E")) {
		    	action.executer(joueur, plateau, fin, carte, tour);
		    	tour.fin();
		    }
		    if (reponse.equals("C")) {
		    	if (joueur[tour.getIndice()].getDeck().size() == 0) {
		    		paquet.creationDeck(joueur, tour);
		    		tour.fin();
		    	}
		    	else {
		    		System.out.println("Les options sont les suivantes : ");
			   		for (int i = 0; i < 5; i++) {
			   			System.out.println(joueur[tour.getIndice()].getDeck().remove(0));
			   		}
			   		System.out.println(" quelles instructions souhaitez-vous ajouter ?");
			   		System.out.println(" Veuillez les saisir dans l'ordre.");
			   		System.out.println(" si vous ne voulez plus réaliser d'action, entrer rien");
			   		System.out.println(" action 1 : ");
			   		String action1 = scanner.nextLine();
			   		System.out.println(" action 2 : ");
			   		String action2 = scanner.nextLine();
			   		System.out.println(" action 3 : ");
			   		String action3 = scanner.nextLine();
			   		System.out.println(" action 4 : ");
			   		String action4 = scanner.nextLine();
			   		System.out.println(" action 5 : ");
			   		String action5 = scanner.nextLine();
			   		action.completer(joueur, tour, action1, action2, action3, action4, action5);
			   		tour.fin();
	
		    	}
	    	}
	}
	    
	    fin.afficher(initialisation);
	    System.out.println("fin");
	

}
}
