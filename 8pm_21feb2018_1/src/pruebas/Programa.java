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
        String nombre1 = "";
        String nombre2 = "";
        String nombre3 = "";
        
        //[2][3][4]
        int[][][] numeros =
        {
            {
                {3,5,6,7},
                {30,51,66,71},
                {31,52,63,72}                    
            },
            {
                {32,53,62,73},
                {33,54,69,74},
                {34,55,60,75}                    
            }
        };
        
        System.out.println(numeros[0][1][3]);
    }
}
