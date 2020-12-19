package entidadGrafica;

import javax.swing.ImageIcon;

public class EntidadGraficaInfectadoBeta extends EntidadGraficaInfectado {

	public EntidadGraficaInfectadoBeta () {
		
		  this.spriteIcon = new ImageIcon( this.getClass().getResource( "/sprites/beta.png" ));
		  this.spriteIcon.setImage( this.spriteIcon.getImage() );
	}
}
