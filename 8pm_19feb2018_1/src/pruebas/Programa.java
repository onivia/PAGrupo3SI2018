package pruebas;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        int i = 0;
        
        for (i = 0; i < 10; i++) {
            //System.out.println(i);            
            
            i += 20;
        }
        
        i = 0;
        while(i< 10) {
            System.out.println(i);
            
            i += 1; //i = i + 1    i++; ++i;
        }
    }
}
