package ordenpedido;

import Interfaces.IDocumento;
import Interfaces.IDocumentoFinalizable;

/**
 *
 * @author ONivia
 */
public abstract class Orden implements IDocumentoFinalizable, IDocumento {
    public void autorizarOrden() {
        System.out.println("se autorizo orden");    }
    
    public abstract void finalizarOrden();
    
    public abstract void anular();
    
    public static Orden crearOrden(int tipoorden) {
        Orden orden = null;
                        
        switch(tipoorden) {
            case 1:
                orden = new OrdenCompra();
                break;
            case 2:
                orden = new OrdenTrabajo();
                break;
        }
        
        return orden;
    }
}
