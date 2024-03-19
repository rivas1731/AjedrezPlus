
package piezas;

import ajedrezplus2.pkg0.PanelAjedrez;

public class Peon extends Pieza {
    
    public Peon(int color, int col, int fil){
        super(color, col, fil);
        
        if(color == PanelAjedrez.blanco){
            imagen = getImagen("/piezas/peon");
        } else{
            imagen = getImagen("/piezas/peonotro");
        }
    }
    
}
