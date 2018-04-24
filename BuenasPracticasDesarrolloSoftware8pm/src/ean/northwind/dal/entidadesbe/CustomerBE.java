package ean.northwind.dal.entidadesbe;

import ean.northwind.comun.pojos.Customer;
import ean.northwind.comun.pojos.Order;
import ean.northwind.dal.repositorio.NorthwindFactory;
import ean.northwind.dal.repositorio.NorthwindRepositorySingleton;
import org.hibernate.Query;

/**
 *
 * @author ONivia
 */
public class CustomerBE {
    private NorthwindFactory repositorioNorthwind;

    public CustomerBE(NorthwindFactory repositorioNorthwind) {
        this.repositorioNorthwind = repositorioNorthwind;
    }
    
    public Customer getCustomerByOrder(Order order) {        
        Customer cust = null;
        Query query = null;
        
        query = repositorioNorthwind.getSession().createQuery("FROM Customer WHERE CustomerID = :CustomerID");
        query.setString("CustomerID", order.getCustomerID());        
        cust = (Customer)query.uniqueResult();
        
        return cust;        
    }    
}
