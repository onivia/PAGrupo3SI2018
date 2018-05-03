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
    
    public void adicionar(Nodo nodo) throws Exception {
        insertarNodoxPosicion(nodo, tamano);
    }
    
    public Nodo obtenerNodoxPosicion(int posi) {
        Nodo nodobuscado = null;
        
        if(posi >= 0 && posi < tamano) {
            nodobuscado = p;
            for (int i = 1; i < posi; i++) {
                nodobuscado = nodobuscado.sgte;
            }                                    
        }
        
        return nodobuscado;
    }
    
    public void insertarNodoxPosicion(Nodo nodo, int posi) throws Exception {        
            if(estaVacia()) { //adicionar el nodo cuando la lista esta vacia
                p = nodo;
                u = nodo;
                
                tamano += 1;
            }
            else if(posi >= 0 && posi <= tamano) { //se valida que la posicion sea valida
                if(posi == 0) {
                    nodo.sgte = p;
                    p = nodo;
                }
                else if(posi == tamano) {                    
                    u.sgte = nodo;
                    u = nodo;
                }
                else {
                    Nodo nodoanterior = obtenerNodoxPosicion(posi - 1);
                    nodo.sgte = nodoanterior.sgte;
                    nodoanterior.sgte = nodo;
                }
                
                tamano += 1;
            }
            else {
                throw new Exception("Error, la posicion: " + posi + " NO es valida!.");
            }
    }
    
    public void removerPrimero() {
        if(!estaVacia()) {
            if(tamano == 1) {
                p = null;
                u = null;
            } else {
                Nodo na = obtenerNodoxPosicion(1);
                p.sgte = null;
                p = na;
            }            
            tamano -= 1;
        }
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
