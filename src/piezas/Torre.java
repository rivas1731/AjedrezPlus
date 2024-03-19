
package piezas;

import ajedrezplus2.pkg0.PanelAjedrez;

public class Torre extends Pieza {
    
    public Torre(int color, int col, int fil) {
        super(color, col, fil);
        
        if(color == PanelAjedrez.blanco){
            imagen = getImagen("/piezas/torre");
        } else{
            imagen = getImagen("/piezas/torreotra");
        }
    }
    
}
