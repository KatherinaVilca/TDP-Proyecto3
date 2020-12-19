package entidadGrafica;

import javax.swing.ImageIcon;

public class EntidadGraficaInfectado extends EntidadGrafica {
	

	public EntidadGraficaInfectado() {
		this.spriteIcon=null;
	}
	
	public ImageIcon getSprite() {
		return this.spriteIcon;
	}
	
	public void actualizarSprite(int nuevoEstado) {
		//falta contenedor de imagenes.
	}
	
}
