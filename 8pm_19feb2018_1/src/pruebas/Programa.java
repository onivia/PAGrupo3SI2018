package pruebas;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        String s1 = "hola";
        String s2 = "mundo";
        String sformato = "%2$s %1$s";
        
        String mensaje1 = s2 + " " + s1;        
        String mensaje2 = String.format(sformato,s1,s2);        
        
        System.out.println(mensaje1);
        System.out.println(mensaje2);
    }
}
