package infectado;
import java.awt.Point;

import javax.swing.ImageIcon;

import entidadGrafica.*;

public class InfectadoAlpha extends Infectado {
	
	//private DisparoInfectadoFactory disparoFactory;
	
	private InfectadoAlphaState state;
	
	public InfectadoAlpha(Point posicionCreacion) {
		super(posicionCreacion);
		state= new InfectadoAlphaNormalState(this);
		//disparoFactory= new
		entidadGrafica= new EntidadGraficaInfectadoAlpha();
		entidadGrafica.actualizarSprite(1);
		id= this.hashCode();
	}
	
	public void recibirAtaque( int poderAtaqueRecibido) {
		state.recibirAtaque(poderAtaqueRecibido);
	}
	public void atacar() {
		state.atacar();
	};
	public Point desplazarse() { //  retorno un point
		state.desplazarse();
	}
	
	public void changeState(InfectadoAlphaState state) {
		this.state= state;
	}
	
	public ImageIcon getSprite() {
		return entidadGrafica.getSprite();
	}
	
	/*public void actualizarSprite( int nuevoEstado) {
		entidadGrafica.actualizarImagen();
	}
	*/
	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		estado=0;
	}


	
}