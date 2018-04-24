package ean.northwind.cliente.probador;

import ean.northwind.bll.procesos.CustomerBL;
import ean.northwind.comun.pojos.Customer;
import ean.northwind.dal.repositorio.NorthwindFactory;
import ean.northwind.dal.repositorio.NorthwindRepositorySingleton;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Query;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        Logger.getRootLogger().setLevel(Level.ERROR);
        //prueba_Consulta_Customer();                
        prueba_ObtenerClienteDesdeOrderId();
    }
    
    public static void prueba_ObtenerClienteDesdeOrderId() {
        CustomerBL customerbl = null;
        Customer cust = null;
        int orderid = 10254;
        
        customerbl = new CustomerBL();
        cust = customerbl.obtenerCustomerByOrderId(orderid);
        
        System.out.println(cust.getContactName());                
    }
    
    public static void prueba_Consulta_Customer() {
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
