package ean.northwind.dal.entidadesbe;

import ean.northwind.comun.pojos.Customer;
import ean.northwind.comun.pojos.Order;
import ean.northwind.dal.repositorio.NorthwindFactory;
import org.hibernate.Query;

/**
 *
 * @author ONivia
 */
public class OrderBE {
    private NorthwindFactory repositorioNorthwind;

    public OrderBE(NorthwindFactory repositorioNorthwind) {
        this.repositorioNorthwind = repositorioNorthwind;
    }
    
    public Order getOrder(int orderid) {
        Order order = null;
        Query query = null;
        
        query = repositorioNorthwind.getSession().createQuery("FROM Order WHERE OrderID = :OrderID");
        query.setInteger("OrderID", orderid);        
        order = (Order)query.uniqueResult();
        
        return order;        
    }    
}
