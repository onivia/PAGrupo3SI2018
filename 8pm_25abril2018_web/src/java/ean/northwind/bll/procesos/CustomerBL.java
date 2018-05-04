package ean.northwind.bll.procesos;

import ean.northwind.comun.pojos.Customer;
import ean.northwind.comun.pojos.Order;
import ean.northwind.dal.entidadesbe.CustomerBE;
import ean.northwind.dal.entidadesbe.OrderBE;
import ean.northwind.dal.repositorio.NorthwindFactory;
import ean.northwind.dal.repositorio.NorthwindRepositorySingleton;
import org.hibernate.Transaction;

/**
 *
 * @author ONivia
 */
public class CustomerBL {
    NorthwindFactory repositorioNorthwind;
    
    public CustomerBL() {
        this.repositorioNorthwind = NorthwindRepositorySingleton.getInstancia();
    }
    
    public String actualizarCustomer(Customer cust) {
        String respuesta = "OK";
        CustomerBE customerbe = null;
        
        try {
            customerbe = new CustomerBE(repositorioNorthwind);
            customerbe.updateCustomer(cust);
        } catch(Exception ex) {
            respuesta = ex.getMessage();
        }
        
        repositorioNorthwind.closeSession();
        
        return respuesta;
    }
    
    public Customer obtenerCustomerByCustomerID(String CustomerID) {
        CustomerBE customerbe = null;
        Customer cust = null;
        
        customerbe = new CustomerBE(repositorioNorthwind);
        cust = customerbe.getCustomer(CustomerID);
        
        repositorioNorthwind.closeSession();
        
        return cust;
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
        
        repositorioNorthwind.closeSession();
        
        return cust;                
    }    
}
