package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        m2();        
    }
    
    public static void m2() {
        //try con recursos
        //Closable
        Cliente cliente = null;
        
        try(FileWriter fw = new FileWriter("C:\\Tmp\\Universidad\\PruebasJava\\Salida.txt", true);) {
            String sep = System.getProperty("line.separator");
            
            fw.write("hola4" + sep);
            
            cliente.registrar();
            
        } catch (IOException | NullPointerException ex) {
            if(ex instanceof IOException) {
                System.out.println("IOException: " + ex.getMessage());
            } else if(ex instanceof NullPointerException) {
                System.out.println("NullPointerException: " + ex.getMessage());
            }
        }
    }
    
    public static void m1() {
        FileWriter fw = null;
        String sep = System.getProperty("line.separator");
        
        try {
             fw = new FileWriter("C:\\Tmp\\Universidad\\PruebasJava\\Salida.txt", true);
             
             fw.write("hola2" + sep);                          
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if(fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());                
            }
        }
    }    
}
