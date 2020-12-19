package infectado;

import java.awt.Point;

import javax.swing.ImageIcon;

import entidadGrafica.*;
import premio.*;

public abstract class Infectado {

	protected int velocidadDesplazamiento;
	protected int vida;
	protected int rangoAlcanceAtaque;
	protected int poderAtaque;
	protected int accionActual;
	protected Point posActual;
	protected Point posCreacion;
	protected EntidadGrafica entidadGrafica;
	protected PremioFactory premioFactory;
	protected int estado;
	protected InfectadoVisitor visitor;
	protected int id;
	public Infectado (Point posicionCreacion) {
		
		this.vida= 100;
		this.posCreacion= posicionCreacion;
		this.posActual= new Point((int) posicionCreacion.getX(), 0); 
		this.velocidadDesplazamiento= 20;
		this.rangoAlcanceAtaque= 10;
		this.poderAtaque=24;
		this.premioFactory= PremioFactoryImpl.getInstance();
		this.accionActual= EstadosInfectado.DESPLAZANDOSE.getEstado();
		this.visitor= new InfectadoVisitorImpl(this);
		
	}
	
	abstract void recibirAtaque (int poderAtaqueRecibido); // ABSTRACT 
	
	abstract void atacar();
	
	public  Point desplazarse() {
		
		double posYActual= posActual.getY();
		double posYNueva=posYActual+ velocidadDesplazamiento;
		double posXActual= posActual.getX();
		posActual.setLocation(posXActual,posYActual);
		 
		return posActual.getLocation();
	}
	
	public Premio lanzarPremio() {
	
		return premioFactory.createPremio(posActual.getX(), posActual.getY());
	} 
	
	public int getVida() {
		return vida;
	}
	public void setVida(int v) {
		vida=v;
	}
	
	public boolean isAlive() {
		return !(accionActual == EstadosInfectado.MUERTO.getEstado());
	}
	
	public ImageIcon getSprite() {
		return entidadGrafica.getSprite();
	}
	
	public Point getPosActual() {
		return posActual;
	}
}
