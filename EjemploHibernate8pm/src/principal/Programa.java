package principal;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import repositorio.Customer;
import repositorio.NorthwindFactory;
import repositorio.NorthwindRepositorySingleton;

/**
 *
 * @author estudiante
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pruebaHibernate_Customer();
    }
    
    private static void pruebaHibernate_Customer() {
        Logger.getRootLogger().setLevel(Level.ERROR);
                        
        NorthwindFactory repositorioNorthwind = NorthwindRepositorySingleton.getInstancia();
        Customer cust = null;        
        Query query = null;
        
        query = repositorioNorthwind.getSession().createQuery("FROM Customer WHERE CustomerID = :CustomerID");
        query.setString("CustomerID", "BERGS");        
        cust = (Customer)query.uniqueResult();
        
        repositorioNorthwind.closeSession();
        
        System.out.println(cust.getContactName());        
    }
    
}
