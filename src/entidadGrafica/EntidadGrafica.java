package entidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica extends JLabel{

	protected ImageIcon spriteIcon;
	protected String[] sprites;
   

    public EntidadGrafica() {}

    /**
     * Consulta el sprite actual.
     * @return El sprite actual que contiene la entidad grafica.
     */
    public ImageIcon getSprite() {
    	return spriteIcon;
    };
    
    public String[] getSprites() {
    	return sprites;
    }
    
    public ImageIcon actualizarSprite(int movimiento) {
        this.spriteIcon = new ImageIcon( this.getClass().getResource( sprites[movimiento] ) );
        this.spriteIcon.setImage( this.spriteIcon.getImage() );
        
        return spriteIcon;
    }
    
}
