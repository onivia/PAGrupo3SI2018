package principal;

import base.MiLista;
import base.Nodo;

/**
 *
 * @author onivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiLista lista = new MiLista();
        Nodo nodo = null;
        
        nodo = new Nodo();
        nodo.dato = 5;
        lista.adicionar(nodo);
        
        nodo = new Nodo();
        nodo.dato = 8;
        lista.adicionar(nodo);
        
        nodo = new Nodo();
        nodo.dato = 7;
        lista.adicionar(nodo);
        
        lista.recorrerLista();
    }    
}
