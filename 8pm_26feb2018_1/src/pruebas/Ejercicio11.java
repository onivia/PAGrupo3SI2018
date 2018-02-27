package pruebas;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //D:\\
        //D:/
        //D:/Dir1\\Dir2/Salida/archivo.txt/
        //:/
        //D:
        solucion();
    }
    
    public static void solucion() {
        String spath = "D:/Dir1/Dir2/Salida.log";
        int cantidadDirectorios = 0;
        
        if(estaNormalizado(spath)) {
            cantidadDirectorios = obtieneCantidadDirs(spath);
            
            System.out.println("SI esta normalizado");            
            System.out.println("Cant Dirs: " + cantidadDirectorios);                                    
            
            if(cantidadDirectorios > 0) {
                System.out.println("Directorios:");
                for(String dir : obtieneDirectorios(spath)) {
                    System.out.println("\t" + dir);
                }
            }
            System.out.println("Cant Separadores: " + obtieneCantidadSeparadores(spath));
            
            if(cantidadDirectorios>0) {
                System.out.println("Primer Dir: " + obtienePrimerDir(spath));
                System.out.println("Ultimo Dir: " + obtieneUltimoDir(spath));
            }
            
            System.out.println("Archivo sin Ext: " + obtieneNombreArchivo(spath));
            System.out.println("Ext: " + obtieneExtension(spath));
            System.out.println("Full Nombre Archivo: " + obtieneFullNombreArchivo(spath));
        }   
        else
            System.out.println("NO esta normalizado");
    }
    
    public static String obtieneFullNombreArchivo(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        String sarchivo = "";
        if(tieneArchivo(cadenaNueva)) {
            sarchivo = cadenaNueva.substring(cadenaNueva.lastIndexOf("/") + 1, cadenaNueva.length());
        }
        
        return sarchivo;
    }
    
    public static String obtieneExtension(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        String sarchivo = "";
        if(tieneArchivo(cadenaNueva)) {
            sarchivo = cadenaNueva.substring(cadenaNueva.lastIndexOf(".") + 1, cadenaNueva.length());
        }
        
        return sarchivo;
    }    
    
    public static String obtieneNombreArchivo(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        String sarchivo = "";
        if(tieneArchivo(cadenaNueva)) {
            sarchivo = cadenaNueva.substring(cadenaNueva.lastIndexOf("/") + 1, cadenaNueva.indexOf("."));
        }
        
        return sarchivo;
    }
    
    public static boolean tieneArchivo(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        
        return (cadenaNueva.contains("."));        
    }
    
    public static String obtienePrimerDir(String spath) {
        
        return (obtieneDirectorio(spath,0));        
    }
    
    public static String obtieneUltimoDir(String spath) {
        
        return (obtieneDirectorio(spath,obtieneCantidadDirs(spath) -  1));        
    }
    
    public static String obtieneDirectorio(String spath, int posicion) {
        String[] directorios = null;
        String dir = null;
        if(posicion >= 0 && posicion < obtieneCantidadDirs(spath)) {
            directorios = obtieneDirectorios(spath);
            
            dir = directorios[posicion];
        }
        
        return dir;
    }
    
    public static int obtieneCantidadSeparadores(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        int cantidadSeparadores = cadenaNueva.length() - cadenaNueva.replace("/", "").length();
        
        return cantidadSeparadores;
    }
    
    public static String[] obtieneDirectorios(String spath) {
        String cadenaNueva = estandarizaPath(spath);
        String[] ssplit = cadenaNueva.split("/");        
        String[] directorios = new String[obtieneCantidadDirs(spath)];        
        
        
        System.arraycopy(ssplit, 1, directorios, 0, obtieneCantidadDirs(spath));
        
        return directorios;
    }
    
    public static int obtieneCantidadDirs(String spath) {
        String cadenaNueva = estandarizaPath(spath);        
        String[] directorios = cadenaNueva.split("/");
        int descartados = 1;
        
        if(spath.contains(".")) {
            descartados += 1;
        }
        
        return (directorios.length - descartados);
    }
    
    public static String estandarizaPath(String spath) {
        return (spath.replace("\\", "/"));
    }
    
    public static boolean estaNormalizado(String spath) {
        return (spath.indexOf(":\\")>0 || spath.indexOf(":/")>0);
    }    
}
