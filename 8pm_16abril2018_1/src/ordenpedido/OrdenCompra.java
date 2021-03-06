package ordenpedido;

import facturacion.Factura;

/**
 *
 * @author ONivia
 */
public class OrdenCompra extends Orden {
    public OrdenCompra() {
    }
    
    public void asociarCliente() {
        System.out.println("se asocio el cliente");
    }

    @Override
    public void finalizarOrden() {
        System.out.println("se finalizo la orden de compra");               
    }

    @Override
    public void anular() {
        Factura factura = new Factura();
        factura.anular();
    }
}
