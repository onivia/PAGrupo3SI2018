package ean.northwind.bll.procesos;

import ean.northwind.comun.pojos.Customer;
import ean.northwind.comun.pojos.Order;
import ean.northwind.dal.entidadesbe.CustomerBE;
import ean.northwind.dal.entidadesbe.OrderBE;
import ean.northwind.dal.repositorio.NorthwindFactory;
import ean.northwind.dal.repositorio.NorthwindRepositorySingleton;

/**
 *
 * @author ONivia
 */
public class CustomerBL {
    NorthwindFactory repositorioNorthwind;
    
    public CustomerBL() {
        this.repositorioNorthwind = NorthwindRepositorySingleton.getInstancia();
    }
    
    public Customer obtenerCustomerByOrderId(int orderid) {
        OrderBE orderbe = null;
        CustomerBE customerbe = null;
        Order order = null;
        Customer cust = null;
        
        orderbe = new OrderBE(repositorioNorthwind);
        order = orderbe.getOrder(orderid);
        
        if(order!=null) {
            customerbe = new CustomerBE(repositorioNorthwind);
            cust = customerbe.getCustomerByOrder(order);
        }
        
        //repositorioNorthwind.closeSession();
        
        return cust;                
    }    
}
