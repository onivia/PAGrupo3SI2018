package principal;

import principal.excepciones.PrincipalException;

/**
 *
 * @author ONivia
 */
public class Operacion {
    public Operacion() {
    }
    
    public int dividir(int n1, int n2) throws PrincipalException {
        if(n2 == 0 || n2 == 10)
            throw new PrincipalException("n2 NO puede ser 0 ni 10", n2);
        
        return (n1/n2);
    }
}
