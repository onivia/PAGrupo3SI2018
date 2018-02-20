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
        int i = 2;
        
        switch (i) {
            case 10:
                System.out.println("i si es 10");
                break;
            case 2:
            case 5:
                System.out.println("i es igual a 5 o a 2");                
                break;
            default:
                System.out.println("i ni es 5 ni es 10");
                break;
        }
    }
}
