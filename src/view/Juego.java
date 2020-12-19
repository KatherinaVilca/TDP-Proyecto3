package view;

import game_master.GameMasterController;
import jugador.JugadorListenerImpl;
import view.GUI;

public class Juego {
    public static void main(String[] args) {

        GameMasterController gameMasterController = GameMasterController.getInstance();
        gameMasterController.inicializarPartida();

        GUI frame = GUI.getInstance();
        frame.setVisible(true);

        frame.addKeyListener(JugadorListenerImpl.getInstance());
        
        gameMasterController.empezarNivel();
    }    
}
