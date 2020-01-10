import javax.swing.JFrame;

public class Fenetre extends JFrame {
	
	public void graphique() {
		// créer une fenêtre
	    JFrame fenetre = new JFrame();
	    
	    //rendre la fenêtre visible
	    fenetre.setVisible(true);
	    
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //définit un titre
	    fenetre.setTitle("Robot Turtle");
	    
	    //Définit sa taille : 1000 pixels de large et 1000 pixels de haut
	    fenetre.setSize(1000, 1000);
	    
	    //Positionne la fenêtre au centre de 'écran
	    fenetre.setLocationRelativeTo(null);
	    
	    
	    //notre Pan affiche ce qui est marqué dans notre panneau
	    fenetre.setContentPane(new Panneau());
	}
	
	
	
	
}

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
