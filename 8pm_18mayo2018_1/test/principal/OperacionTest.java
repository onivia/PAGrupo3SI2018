package principal;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ONivia
 */
public class OperacionTest {
    
    public OperacionTest() {
    }

    @Test
    public void testSumar1() {
        System.out.println("sumar");
        int n1 = 10;
        int n2 = 20;
        Operacion instance = new Operacion();
        int expResult = 30;
        int result = instance.sumar(n1, n2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSumar2() {
        System.out.println("sumar");
        int n1 = 10;
        int n2 = -20;
        Operacion instance = new Operacion();
        int expResult = 10;
        int result = instance.sumar(n1, n2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
