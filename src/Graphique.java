import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphique {
	public static void main(String[] args){
		
		// créer une fenêtre
	    JFrame fenetre = new JFrame();
	    
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //rend la fenêtre visible
	    fenetre.setVisible(true);
	    
	    //définit un titre
	    fenetre.setTitle("Robot Turtle");
	    
	    //Définit sa taille : 400 pixels de large et 100 pixels de haut
	    fenetre.setSize(1000, 1000);
	    
	    
	    //Positionne la fenêtre au centre de 'écran
	    fenetre.setLocationRelativeTo(null);
	    
	    //Positionne la fenêtre à l'écran
	    // fenetre.setLocation(int x, int y)
	    // avec x et y définissant la position de l'angle en haut à gauche de la fenêtre
	    // l'origine étant en haut à gauche
	    
	    //Empêcher le redimensionnement de la fenêtre
	    // fenetre.setResizable(boolean b)
	    // avec b = true pour l'autoriser
	    // avec b = false pour l'interdire
	    
	    //Garder la fenêtre au premier plan
	    // fenetre.setAlwaysOnTop(boolean b)
	    // avec b = true pour l'appliquer
	    // avec b = false pour ne pas l'appliquer
	    
	    JPanel pan = new JPanel();
	    
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);
	    
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    fenetre.setContentPane(pan);               
	    fenetre.setVisible(true);


	    
	    
	  } 
	
	 public static void paintComponent(Graphics g){
		    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		    System.out.println("Je suis exécutée !"); 
		    g.fillOval(20, 20, 75, 75);
		  }

}
