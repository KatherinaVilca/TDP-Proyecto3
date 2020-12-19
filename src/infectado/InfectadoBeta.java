package infectado;

import java.awt.Point;

import javax.swing.ImageIcon;

import entidadGrafica.*;

public class InfectadoBeta extends Infectado{
	
	//private DisparoInfectadoFactory disparoFactory;

	public InfectadoBeta (Point posicionCreacion) {
		super(posicionCreacion);
		entidadGrafica= new EntidadGraficaInfectadoBeta();
	}

	public void recibirAtaque(int poderAtaqueRecibido) {
		
		if(vida-poderAtaqueRecibido !=0) {
			
		}
	}

	public void atacar() {
		
		estado= EstadosInfectado.ATACANDO.getEstado();
	}

	public Point desplazarse() {
		
		estado= EstadosInfectado.DESPLAZANDOSE.getEstado();
		return null;
	}

	ImageIcon getSprite() {
	
		return null;
	}

	void actualizarSprite(int nuevoEstado) {
		
	}

}
