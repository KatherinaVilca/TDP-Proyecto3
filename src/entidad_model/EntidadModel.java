package entidad_model;

import java.awt.Point;
import java.util.List;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import entidadGrafica.*;
import game_master.GameMaster;
import infectado.Infectado;
import nivel.Nivel;
import nivel.NivelController;
import view.UIUpdater;

public abstract class EntidadModel {
    
    private GameMaster gameMaster;
    protected UIUpdater uiUpdater;

    protected EntidadModel(EntidadModel entidad) {
        gameMaster = GameMaster.getInstance();
        uiUpdater = UIUpdater.getInstance();

        this.addEntidadToGameMaster(entidad);
        this.generarLabel();
    }

    /**
     * Se encarga de añadir la entidad parametrizada a la lista de entidades activas de gameMaster.
     * @param entidad Entidad a agregar a GameMaster.
     */
    private void addEntidadToGameMaster(EntidadModel entidad) {
        gameMaster.addEntidad(entidad);
    }

    /**
     * Se encarga de remover la entidad parametrizada de la lista de entidades activas de gameMaster.
     * @param entidad Entidad a remover de GameMaster.
     */
    protected void destruirEntidad(EntidadModel entidad) {
        gameMaster.removeEntidad(entidad);
    }

    /**
     * Se encarga de actualizar la entidad correspondiente y realizar el movimiento segun corresponda.
     */
    public abstract void update();

    /**
     * Se encarga de comunicarse con UIUpdater y brindarle los datos para generar el label.
     * 
     * @see UIUpdater#generarLabel(int, java.awt.Point, int, int, javax.swing.ImageIcon)
     */
    public void generarLabel() {
    	
    	NivelController nivelControler= gameMaster.getNivelController();
    	Nivel nivel = nivelControler.getNivel();
    	List<Entry<Integer, Infectado>> enemigos= nivel.getOleadaEnemigos().getOleada();
    	
    	for(Entry<Integer,Infectado> entry : enemigos) {
    	
    		Point ubicacion= entry.getValue().getPosActual();
    		ImageIcon img= entry.getValue().getSprite();
    		uiUpdater.generarLabel(entry.getValue().getId(), ubicacion,img.getIconWidth(), img.getIconHeight(), img);
    		
    	}
    	
    	
    }
}
