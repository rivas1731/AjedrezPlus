
package piezas;

import ajedrezplus2.pkg0.PanelAjedrez;

public class Caballo extends Pieza {
    
    public Caballo(int color, int col, int fil) {
        super(color, col, fil);
        
        if(color == PanelAjedrez.blanco){
            imagen = getImagen("/piezas/caballo");
        } else{
            imagen = getImagen("/piezas/caballootro");
        }
    }
    
}
