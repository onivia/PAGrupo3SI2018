package pruebas;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje1 = String.format("%1$-10.3s","hola","mundo");
        String mensaje2 = String.format("%1$-10d", 100);
        String mensaje3 = String.format("%1$-10.2f", 200.54964604860);
        String mensaje4 = String.format("%1$e", 200.54964604860);
        String mensaje5 = String.format("%1$g", 2.005496e+02);
        String mensaje6 = String.format("%1$h", 10);
        
        System.out.println(mensaje6);
    }
    
}
