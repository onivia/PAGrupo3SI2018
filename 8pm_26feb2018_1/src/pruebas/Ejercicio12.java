package pruebas;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author ONivia
 */
public class Ejercicio12 {
    public static void main(String[] args) throws IOException {
        escribeLineaEnArchivo("esta linea la añadio!", "C:\\Tmp\\Universidad\\NuevoArchivo.txt");
        
    }
    
    private static void escribeLineaEnArchivo(String linea,String fullPathArchivo) throws IOException {
        File file = new File(fullPathArchivo);        
        
        if(!file.exists()) {
            Files.write(Paths.get(fullPathArchivo), linea.getBytes(), StandardOpenOption.CREATE);
        } else {
            Files.write(Paths.get(fullPathArchivo), String.format("%n%1$s",linea).getBytes(), StandardOpenOption.APPEND);            
        }
    }
}
