package principal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ONivia
 */
public class MensajeTest {    
    public MensajeTest() {
    }

    @Test
    public void testObtenerMensaje() {
        System.out.println("obtenerMensaje");
        Mensaje instance = new Mensaje();
        String expResult = "hola";
        String result = instance.obtenerMensaje();
        if(result.equals(expResult))
            assertTrue(true);
        else
            fail("Pailas no son iguales: " + expResult + "-" + result);
        //assertEquals(expResult, result);        
        //fail("The test case is a prototype.");
    }
    
}
