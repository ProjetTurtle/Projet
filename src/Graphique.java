import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphique extends JFrame {
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
	    //la méthode pack de la classe JFrame calcule 
	    //la dimension de la fenêtre en fonction de ce qui est mis à l'intérieur. 
	    
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
	    
	    Panneau pan = new Panneau();
	    
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE);
	    
	    //On prévient notre JFrame que notre JPanel sera son content pane
	    fenetre.setContentPane(pan);               
	    fenetre.setVisible(true);


	    
	    
	  }
}
