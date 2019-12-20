

import java.util.Random;

 

public class Initialisation {

               

                private int nombreDeJoueur;

                private String[] listeNomJoueur = new String[nombreDeJoueur];

 

///////////////////////////////////////////////////////////////

                public void PositionPiecesDepart (Plateau plateau) {

                               switch (this.nombreDeJoueur) {

                              

                                               case 2:

                                                               plateau.modifierPlateau(0,  1, '1');

                                                               plateau.modifierPlateau(0,  5, '2');

                                                               plateau.modifierPlateau(7,  3, 'D');

                                                              

                                                               for(int i = 0; i<8; i++) {

                                                                               plateau.modifierPlateau(i, 7, 'P');

                                                               }

                                                               break;

                                                              

                                              

                                               case 3:

                                                               plateau.modifierPlateau(0,  0, '1');

                                                               plateau.modifierPlateau(0,  3, '2');

                                                               plateau.modifierPlateau(0,  6, '3');

                                                              

                                                               for(int i=0; i<7; i+=3) {

                                                                               plateau.modifierPlateau(7,  i, 'D');

                                                               }

                                                              

                                                               for(int i = 0; i<8; i++) {

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

 

                public void joueurs (Joueur joueur) {

                              

                               joueur.setNom(0, this.listeNomJoueur[0]);

                               joueur.setNom(1, this.listeNomJoueur[1]);

                               joueur.setNom(2, this.listeNomJoueur[2]);

                               joueur.setNom(3, this.listeNomJoueur[3]);

 

                               switch (nombreDeJoueur) {

 

                               case 2 :

                                               // joueur 1

                                               joueur.setNumero(0, 1);

                                               joueur.setPosition(0, 2);

                                               joueur.setPositionDepart(0, 2);

 

                                               //joueur 2

                                               joueur.setNumero(1, 2);

                                               joueur.setPosition(1, 6);

                                               joueur.setPositionDepart(1, 6);

 

                                               break;

 

                               case 3 :

                                               // joueur 1

                                               joueur.setNumero(0, 1);

                                               joueur.setPosition(0, 1);

                                               joueur.setPositionDepart(0, 1);

 

                                               //joueur 2

                                               joueur.setNumero(1, 2);

                                               joueur.setPosition(1, 4);

                                               joueur.setPositionDepart(1, 4);

 

                                               //joueur 3

                                               joueur.setNumero(2, 3);

                                               joueur.setPosition(2, 7);

                                               joueur.setPositionDepart(2, 7);

                                              

                                               break;

 

                               case 4 :

                                               // joueur 1

                                               joueur.setNumero(0, 1);

                                               joueur.setPosition(0, 1);

                                               joueur.setPositionDepart(0, 1);

 

                                               //joueur 2

                                               joueur.setNumero(1, 2);

                                               joueur.setPosition(1, 3);

                                               joueur.setPositionDepart(1, 3);

                                                              

                                               //joueur 3

                                               joueur.setNumero(2, 3);

                                               joueur.setPosition(2, 6);

                                               joueur.setPositionDepart(2, 6);

                                              

                                               //joueur 4

                                               joueur.setNumero(3, 4);

                                               joueur.setPosition(3, 8);

                                               joueur.setPositionDepart(3, 8);

 

                                               break;

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