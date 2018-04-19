package facturacion;

import Interfaces.IDocumento;
import Interfaces.IDocumentoFinalizable;

/**
 *
 * @author ONivia
 */
public class Factura implements IDocumentoFinalizable, IDocumento {
    public Factura() {
    }
    
    public void finalizarOrden() {
        System.out.println("se finalizo la orden");
    }
    
    public void anular() {
        System.out.println("anulo el documento");
    }
}
