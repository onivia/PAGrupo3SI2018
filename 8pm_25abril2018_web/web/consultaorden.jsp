<%-- 
    Document   : consultaorden
    Created on : 25/04/2018, 08:20:03 PM
    Author     : ONivia
--%>

<%@page import="ean.northwind.comun.pojos.Customer"%>
<%@page import="ean.northwind.bll.procesos.CustomerBL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    //Declaraciones
    enum EstadosPagina{RESPUESTA,MENSAJE}
%>
<%
    EstadosPagina estadoPagina = null;
    String numorden = null;
    String customerId = null;
    String contactName = null;
    
    if(request.getParameter("ordenid")!=null) {
        numorden = request.getParameter("ordenid");
        
        CustomerBL customerbl = null;
        Customer cust = null;
        
        if(!numorden.equals("")) {
            customerbl = new CustomerBL();
            cust = customerbl.obtenerCustomerByOrderId(Integer.parseInt(numorden));

            if(cust!=null) {
                customerId = cust.getCustomerID();
                contactName = cust.getContactName();
                estadoPagina = EstadosPagina.RESPUESTA;
            } else {
                estadoPagina = EstadosPagina.MENSAJE;
            }
        }
    }    
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Entre Numero de la Orden: </h2>
        <form name="form1" method="post" action="consultaorden.jsp">
            <input type="text" name="ordenid" value="">
            <input type="submit" value="Consultar">
        </form>
        <%if(estadoPagina == EstadosPagina.RESPUESTA) { %>
            <p>
                <b>El Id Cliente es: </b><%=customerId%><br>
                <b>El Cliente es: </b><%=contactName%><br>
                <a href="actualizacliente.jsp?customerId=<%=customerId%>">Actualizar Cliente</a>
            </p>        
        <%} else if(estadoPagina == EstadosPagina.MENSAJE) {%>        
            <p>
                <b>La Orden: <%=numorden%> NO existe!</b>
            </p>
        <%}%>
    </body>
</html>
