package base;

/**
 *
 * @author onivia
 */
public class MiLista {
    private Nodo p;
    private Nodo u;
    public int tamano;

    public MiLista() {
        this.p = null;
        this.u = null;
        this.tamano = 0;
    }
    
    private boolean estaVacia() {
        return (p == null && u == null);
        //return (tamano == 0);
    }
    
    public void adicionar(Nodo nodo) {
        if(estaVacia()) {
            p = nodo;
            u = nodo;
        } else {
            u.sgte = nodo;
            u = nodo;
        }
        tamano += 1;
    }
    
    public Nodo obtenerNodoxPosicion(int posi) {
        
    }
    
    public void insertarNodoxPosicion(Nodo nodo, int posi) {
        
    }
    
    public void recorrerLista() {
        Nodo nodo = null;        
        nodo = p;
        for (int i = 0; i < tamano; i++) {
            System.out.println(nodo.dato);
            nodo = nodo.sgte;
        }
    }
}
