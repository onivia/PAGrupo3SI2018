<%-- 
    Document   : actualizacliente
    Created on : 4/05/2018, 02:38:22 PM
    Author     : ONivia
--%>

<%@page import="ean.northwind.comun.pojos.Customer"%>
<%@page import="ean.northwind.bll.procesos.CustomerBL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    //Declaracion
    enum EstadosPagina {EXISTECLIENTE,CLIENTEACTUALIZADO}
%>
<%
    EstadosPagina estadopagina = null;
    String customerId = null;
    String CompanyName = null;
    String ContactName = null;
    String ContactTitle = null;
    String Address = null;
    String City = null;
    String Region = null;
    String PostalCode = null;
    String Country = null;
    String Phone = null;
    String Fax = null;
    
    String respuestaActualizacion = null;
    
    Customer cust = null;
    CustomerBL customerbl = new CustomerBL();
    
    if(request.getParameter("customerid")!=null && request.getParameter("customerid")!= "") {
        customerId = request.getParameter("customerid");
        cust = customerbl.obtenerCustomerByCustomerID(customerId);
        if(cust!=null) {            
            CompanyName = cust.getCompanyName();
            ContactName = cust.getContactName();
            ContactTitle = cust.getContactTitle();
            Address = cust.getAddress();
            City = cust.getCity();
            Region = cust.getRegion();
            PostalCode = cust.getPostalCode();
            Country = cust.getCountry();
            Phone = cust.getPhone();
            Fax = cust.getFax();
            
            estadopagina = EstadosPagina.EXISTECLIENTE;
        }
    }
    else if(request.getParameter("accion")!=null && request.getParameter("accion").equals("Actualizar")) {
        cust = new Customer();
        cust.setCustomerID(request.getParameter("customerId"));
        cust.setCompanyName(request.getParameter("CompanyName"));
        cust.setContactName(request.getParameter("ContactName"));
        cust.setContactTitle(request.getParameter("ContactTitle"));
        cust.setAddress(request.getParameter("Address"));
        cust.setCity(request.getParameter("City"));
        cust.setRegion(request.getParameter("Region"));
        cust.setPostalCode(request.getParameter("PostalCode"));
        cust.setCountry(request.getParameter("Country"));
        cust.setPhone(request.getParameter("Phone"));
        cust.setFax(request.getParameter("Fax"));
        
        respuestaActualizacion = customerbl.actualizarCustomer(cust);
        
        customerId = cust.getCustomerID();
        CompanyName = cust.getCompanyName();
        ContactName = cust.getContactName();
        ContactTitle = cust.getContactTitle();
        Address = cust.getAddress();
        City = cust.getCity();
        Region = cust.getRegion();
        PostalCode = cust.getPostalCode();
        Country = cust.getCountry();
        Phone = cust.getPhone();
        Fax = cust.getFax();
        
        estadopagina = EstadosPagina.CLIENTEACTUALIZADO;
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualiza Cliente</title>
    </head>
    <body>
        <form name="form1" method="post" action="actualizacliente.jsp" autocomplete="off">
            <%if(estadopagina == EstadosPagina.EXISTECLIENTE || estadopagina == EstadosPagina.CLIENTEACTUALIZADO) {%>
                <span>CustomerID: </span><input type="text" name="customerId" value="<%=customerId%>" readonly><br>
                <span>CompanyName: </span><input type="text" name="CompanyName" value="<%=CompanyName%>"><br>
                <span>ContactName: </span><input type="text" name="ContactName" value="<%=ContactName%>"><br>
                <span>ContactTitle: </span><input type="text" name="ContactTitle" value="<%=ContactTitle%>"><br>                
                <span>Address: </span><input type="text" name="Address" value="<%=Address%>"><br>
                <span>City: </span><input type="text" name="City" value="<%=City%>"><br>
                <span>Region: </span><input type="text" name="Region" value="<%=Region%>"><br>
                <span>PostalCode: </span><input type="text" name="PostalCode" value="<%=PostalCode%>"><br>
                <span>Country: </span><input type="text" name="Country" value="<%=Country%>"><br>
                <span>Phone </span><input type="text" name="Phone" value="<%=Phone%>"><br>
                <span>Fax: </span><input type="text" name="Fax" value="<%=Fax%>"><br><br>
                <input type="submit" name="accion" value="Actualizar" >
                
                <%if(estadopagina == EstadosPagina.CLIENTEACTUALIZADO && respuestaActualizacion!=null && respuestaActualizacion.equals("OK")) {%>
                    <p>
                        <b>El Cliente <%=customerId%> fue Actualziado con exito!</b>
                    </p>                
                <%}%>                
            <%} else {%>
                <p>
                    <b>El Cliente <%=customerId%> NO existe!</b>
                </p>
            <%}%>
        </form>
        <br>
        <a href="consultaorden.jsp">Regresar</a>
    </body>
</html>
