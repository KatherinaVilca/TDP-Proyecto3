package entidadGrafica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class EntidadGrafica extends JLabel{

    protected ImageIcon spriteIcon;

    public EntidadGrafica() {}

    /**
     * Consulta el sprite actual.
     * @return El sprite actual que contiene la entidad grafica.
     */
    public ImageIcon getSprite() {
       return spriteIcon;
    }
    
    
}
