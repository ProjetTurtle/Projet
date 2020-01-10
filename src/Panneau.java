
import java.awt.Graphics;
import javax.swing.JPanel;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

 
public class Panneau extends JPanel {
	
  public void paintComponent(Graphics g){
	  
	  // Permet d'insérer une image
	    
	    //try {
	        //Image img = ImageIO.read(new File("background.jpeg"));
	        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	         //Pour une image de fond
	         //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	         //sinon
	         //g.drawImage(img, 0, 0, this);
	      //} catch (IOException e) {
	        //e.printStackTrace();
	      //}
    
    
    // fill pour plein
    // draw pour non plein
    g.drawRect(10, 10, this.getWidth() - 20 , this.getHeight() - 20);
    
    
    // Permet de tracer des lignes :
    //	x1 , y1 , x2, y2
    
    
    //lignes verticales
    g.drawLine(this.getWidth() * 1/8 + 10, 10, this.getWidth() * 1/8 + 10, this.getHeight() - 10);
    g.drawLine(this.getWidth() * 2/8 + 10, 10, this.getWidth() * 2/8 + 10, this.getHeight() - 10);
    g.drawLine(this.getWidth() * 3/8 + 10, 10, this.getWidth() * 3/8 + 10, this.getHeight() - 10);
    g.drawLine(this.getWidth() * 4/8 + 10, 10, this.getWidth() * 4/8 + 10, this.getHeight() - 10);
    g.drawLine(this.getWidth() * 5/8 + 10, 10, this.getWidth() * 5/8 + 10, this.getHeight() - 10);
    g.drawLine(this.getWidth() * 6/8 + 10, 10, this.getWidth() * 6/8 + 10, this.getHeight() - 10);
    g.drawLine(this.getWidth() * 7/8 + 10, 10, this.getWidth() * 7/8 + 10, this.getHeight() - 10);
    g.drawLine(this.getWidth() * 8/8 + 10, 10, this.getWidth() * 8/8 + 10, this.getHeight() - 10);
    
    // lignes horizontales
    g.drawLine(10, this.getHeight() * 1/8 + 10, this.getWidth() - 10, this.getHeight() * 1/8 + 10);
    g.drawLine(10, this.getHeight() * 2/8 + 10, this.getWidth() - 10, this.getHeight() * 2/8 + 10);
    g.drawLine(10, this.getHeight() * 3/8 + 10, this.getWidth() - 10, this.getHeight() * 3/8 + 10);
    g.drawLine(10, this.getHeight() * 4/8 + 10, this.getWidth() - 10, this.getHeight() * 4/8 + 10);
    g.drawLine(10, this.getHeight() * 5/8 + 10, this.getWidth() - 10, this.getHeight() * 5/8 + 10);
    g.drawLine(10, this.getHeight() * 6/8 + 10, this.getWidth() - 10, this.getHeight() * 6/8 + 10);
    g.drawLine(10, this.getHeight() * 7/8 + 10, this.getWidth() - 10, this.getHeight() * 7/8 + 10);
    g.drawLine(10, this.getHeight() * 8/8 + 10, this.getWidth() - 10, this.getHeight() * 8/8 + 10);
    
    

    
   
    
  
  }
  
}

