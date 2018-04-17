package principal;

import ordenpedido.Orden;
import ordenpedido.OrdenCompra;
import ordenpedido.OrdenTrabajo;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        procesarOrden();
    }
    
    public static void procesarOrden() {
        int tipoorden = 0;        
        tipoorden = 3;
        
        //TIPOORDEN tipo_orden = TIPOORDEN.ORDEN_COMPRA;
        
        Orden orden = Orden.crearOrden(tipoorden);
        finalizaOrden(orden);
    }
    
    //PLL Process Logic Layer - BLL Business Logic Layer
    public static void finalizaOrden(Orden orden) {
        //validar el monto de la orden antes de finalizarla
        orden.finalizarOrden();
        
        /*
        if(orden == OrdenCompra) {
            OrdenCompra oc = (OrdenCompra)orden;
            oc.asociarCliente();
        }
        */
    }
    
    
    //-------------------------------------------------------
    public static void finalizaOrden_Compra(OrdenCompra orden) {
        //validar el monto de la orden antes de finalizarla
        orden.finalizarOrden();
    }
    
    public static void finalizaOrden_Trabajo(OrdenTrabajo orden) {
        //validar el monto de la orden antes de finalizarla
        orden.finalizarOrden();
    }
    
    public static void finalizaOrden(Object orden) {
        
    }
}
