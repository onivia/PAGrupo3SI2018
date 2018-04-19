package ordenpedido;

import facturacion.Factura;

/**
 *
 * @author ONivia
 */
public class OrdenTrabajo extends Orden {
    public OrdenTrabajo() {
    }
    
    public void asociarDespachador() {
        System.out.println("se asocio el despachador");
    }

    @Override
    public void finalizarOrden() {
        System.out.println("se finalizo la orden de trabajo");
    }

    @Override
    public void anular() {
        Factura factura = new Factura();
        factura.anular();
    }
}
