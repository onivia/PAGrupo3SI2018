package pruebas;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        int i = 2;
        int j = 10;
        
        //&& --> short circuit
        //&
        
        if(i == j & evalua(i,i)) { // false && true = false
            System.out.println("ok1"); //NO se muestra
        }
    }
    
    public static boolean evalua(int numero, int comparador) {
        
        System.out.println("ok2"); //SI se muestra
        
        return (numero == comparador);
    }
}
