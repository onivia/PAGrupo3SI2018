package ean.northwind.comun.pojos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ONivia
 */
@Entity
@Table(name="orders")
public class Order {
    @Id
    private int OrderID;
    private String CustomerID; 
    private int EmployeeID;
    private Date OrderDate;
    private Date RequiredDate;
    private Date ShippedDate;
    private int ShipVia;
    private double Freight; 
    private String ShipName;
    private String ShipAddress;
    private String ShipCity;
    private String ShipRegion;
    private String ShipPostalCode;
    private String ShipCountry;

    public Order() {
    }

    /**
     * @return the OrderID
     */
    public int getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the CustomerID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID the CustomerID to set
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return the EmployeeID
     */
    public int getEmployeeID() {
        return EmployeeID;
    }

    /**
     * @param EmployeeID the EmployeeID to set
     */
    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    /**
     * @return the OrderDate
     */
    public Date getOrderDate() {
        return OrderDate;
    }

    /**
     * @param OrderDate the OrderDate to set
     */
    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * @return the RequiredDate
     */
    public Date getRequiredDate() {
        return RequiredDate;
    }

    /**
     * @param RequiredDate the RequiredDate to set
     */
    public void setRequiredDate(Date RequiredDate) {
        this.RequiredDate = RequiredDate;
    }

    /**
     * @return the ShippedDate
     */
    public Date getShippedDate() {
        return ShippedDate;
    }

    /**
     * @param ShippedDate the ShippedDate to set
     */
    public void setShippedDate(Date ShippedDate) {
        this.ShippedDate = ShippedDate;
    }

    /**
     * @return the ShipVia
     */
    public int getShipVia() {
        return ShipVia;
    }

    /**
     * @param ShipVia the ShipVia to set
     */
    public void setShipVia(int ShipVia) {
        this.ShipVia = ShipVia;
    }

    /**
     * @return the Freight
     */
    public double getFreight() {
        return Freight;
    }

    /**
     * @param Freight the Freight to set
     */
    public void setFreight(double Freight) {
        this.Freight = Freight;
    }

    /**
     * @return the ShipName
     */
    public String getShipName() {
        return ShipName;
    }

    /**
     * @param ShipName the ShipName to set
     */
    public void setShipName(String ShipName) {
        this.ShipName = ShipName;
    }

    /**
     * @return the ShipAddress
     */
    public String getShipAddress() {
        return ShipAddress;
    }

    /**
     * @param ShipAddress the ShipAddress to set
     */
    public void setShipAddress(String ShipAddress) {
        this.ShipAddress = ShipAddress;
    }

    /**
     * @return the ShipCity
     */
    public String getShipCity() {
        return ShipCity;
    }

    /**
     * @param ShipCity the ShipCity to set
     */
    public void setShipCity(String ShipCity) {
        this.ShipCity = ShipCity;
    }

    /**
     * @return the ShipRegion
     */
    public String getShipRegion() {
        return ShipRegion;
    }

    /**
     * @param ShipRegion the ShipRegion to set
     */
    public void setShipRegion(String ShipRegion) {
        this.ShipRegion = ShipRegion;
    }

    /**
     * @return the ShipPostalCode
     */
    public String getShipPostalCode() {
        return ShipPostalCode;
    }

    /**
     * @param ShipPostalCode the ShipPostalCode to set
     */
    public void setShipPostalCode(String ShipPostalCode) {
        this.ShipPostalCode = ShipPostalCode;
    }

    /**
     * @return the ShipCountry
     */
    public String getShipCountry() {
        return ShipCountry;
    }

    /**
     * @param ShipCountry the ShipCountry to set
     */
    public void setShipCountry(String ShipCountry) {
        this.ShipCountry = ShipCountry;
    }
}
