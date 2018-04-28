package principal;

import java.util.LinkedList;

/**
 *
 * @author onivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LinkedList | ArrayList
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        
        //System.out.println(lista.get(1));
        lista.remove(1);
        
        for(Integer i : lista) {
            System.out.println(i);           
        }
    }    
}
