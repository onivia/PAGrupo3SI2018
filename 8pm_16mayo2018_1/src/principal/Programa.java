package principal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        m3();        
    }
    
    public static void m1() {
        IOperacion suma = (x,y)->x+y;
        IOperacion resta = (x,y)->y-x;
        
        realizaOperacion(5, 10,suma);
        realizaOperacion(5, 10,resta);
        realizaOperacion(5, 10,(x,y)->y*x);
    }

    private static void realizaOperacion(int x, int y, IOperacion oper) {        
        System.out.println(oper.realizarOperacion(x, y));
    }

    public static void m2() {
        Runnable run1 = ()->{
                    int i = 0;
                    while(i<100) {
                        if(i%2==0)
                            System.out.println(i);
                        i++;                        
                    }
                };
                
        Thread hilo1 = new Thread(run1);
        Thread hilo2 = new Thread(
                ()->{
                    int i = 0;
                    while(i<100) {
                        if(i%2!=0)
                            System.out.println(i);
                        i++;                        
                    }
                }
        );
        hilo2.start(); //impares
        hilo1.start(); //pares
        System.out.println("Se ejecutaran Hilos");        
    }
    
    public static void m3() {
        List<Integer> nums = Arrays.asList(20,10,5,30);
        boolean existe = nums.stream().anyMatch(x -> x==7);
        
        List<String> noms = Arrays.asList("oskr","Daniela","pedRo");
        noms.stream()
                .filter(x -> x.toUpperCase().contains("R"))
                .forEach( x -> System.out.println(x));
        /*boolean existe2 = false;
        for(Integer n :nums) {
            if(n == 7) {
                System.out.println("El numero SI existe");
                existe2 = true;
                break;
            }
        }
        if(!existe2) {
            System.out.println("El numero NO existe");                        
        }*/
        
        //Optional<Integer> imax = nums.stream().max((t, t1) -> Long.compare(t, t1));
        //System.out.println(imax.get());
    }
}
