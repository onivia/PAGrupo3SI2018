package ordenpedido;

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
}
