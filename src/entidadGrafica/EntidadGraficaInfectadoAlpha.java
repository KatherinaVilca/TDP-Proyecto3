package entidadGrafica;

import javax.swing.ImageIcon;

public class EntidadGraficaInfectadoAlpha extends EntidadGraficaInfectado{

	public EntidadGraficaInfectadoAlpha () {
		
		  this.spriteIcon = new ImageIcon( this.getClass().getResource("/sprites/alpha.gif" ));
		  this.spriteIcon.setImage( this.spriteIcon.getImage() );
	}
}
