import java.util.ArrayList;
import java.util.Collections;

public class Paquet {

                private ArrayList<ArrayList<String>> deck = new ArrayList<ArrayList<String>>();

               

               

//////////////////////////////////////////////////////

 

public void creationDeck (Joueur joueur, Tour tour) {

ArrayList<String> deckTemporelle = new ArrayList<String>();

for (int i = 0; i < 18; i++) {

deckTemporelle.add("avancer");

}

for (int i = 0; i < 8; i++) {

deckTemporelle.add("pivoterDroite");

}

for (int i = 0; i < 8; i++) {

deckTemporelle.add("pivoterGauche");

}

for (int i = 0; i < 3; i++) {

deckTemporelle.add("laser");

}

Collections.shuffle(deckTemporelle);

if (joueur.getNumero(tour.getIndice()) == tour.getIndice()) {

deck.set(tour.getIndice(), deckTemporelle);

joueur.setDeck(tour.getIndice(),deck.get(tour.getIndice()));

}

}

 

//////////////////////////////////////////

 

public ArrayList<ArrayList<String>> getDeck() {

return deck;

}

 

public void setDeck(ArrayList<ArrayList<String>> deck) {

this.deck = deck;

}

}