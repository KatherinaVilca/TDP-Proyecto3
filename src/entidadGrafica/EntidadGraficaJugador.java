package entidadGrafica;

import javax.swing.ImageIcon;

public class EntidadGraficaJugador extends EntidadGrafica {
    
    private static EntidadGraficaJugador instance;
    

    //private String[] sprites;

    private EntidadGraficaJugador() {

        sprites = new String[4];
        sprites[0] =  "/sprites/Player/quietoDerecha.png"; //QUIETO
        sprites[1] = "/sprites/Player/completo1izq.png";//MOV_IZQ
        sprites[2] = "/sprites/Player/completo1derechaActualizado.png";//MOV_DER
        sprites[3] = "/sprites/Player/disparoarribaizq.png";//DISPARANDO

        this.spriteIcon = new ImageIcon( this.getClass().getResource( sprites[0] ) );
		this.spriteIcon.setImage( this.spriteIcon.getImage() );

    }

    public static EntidadGraficaJugador getInstance() {
        if( instance == null ) {
			instance = new EntidadGraficaJugador();
		}
		
		return instance;
    }

    /**
     * Actualiza el sprite actual por el correspondiente al movimiento parametrizado.
     * @param movimiento Indica el movimiento que se esta efectuando actualmente.
     * 0=QUIETO; 1=MOV_IZQ; 2=MOV_DER; 3=DISPARANDO;
     * @return El nuevo sprite que representa el movimiento parametrizado.
     */
    public ImageIcon actualizarSprite(int movimiento) {
    	
        this.spriteIcon = new ImageIcon( this.getClass().getResource( sprites[movimiento] ) );
        this.spriteIcon.setImage( this.spriteIcon.getImage() );
        
        return spriteIcon;
    }


}
