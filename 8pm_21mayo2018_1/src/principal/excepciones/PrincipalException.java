package principal.excepciones;

/**
 *
 * @author ONivia
 */
public class PrincipalException extends Exception {
    public int n;
    
    public PrincipalException(String msj, int n) {
        super(msj);
        
        this.n = n;
    }        
}
