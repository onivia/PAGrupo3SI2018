package principal;

import java.util.logging.Level;
import java.util.logging.Logger;
import principal.excepciones.PrincipalException;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        m1();
        System.out.println("algo");
    }
    
    public static void m1() {
        Operacion oper = null;
                
        try {
            oper = new Operacion();
            oper.dividir(20, 10);
            
        } catch (PrincipalException ex) {            
            System.out.println(ex.getMessage());
            System.out.println("El valor de n es: " + ex.n);
        } finally {
            System.out.println("termino");            
        }
    }    
}
