package principal;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author ONivia
 */
public class EjecutableTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(NewTestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }		
        System.out.println(result.wasSuccessful());        
    }    
}
