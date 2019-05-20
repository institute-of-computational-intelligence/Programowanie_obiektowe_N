package entities;
// Generated 2019-04-28 23:44:05 by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

    private int id;
    private Date creationdate;
    private String clientfirstname;
    private String clientlastname;
    private Date deliverydate;
    private String deliverymethod;
    private String deliveryaddress;
    private Set productses = new HashSet(0);

    public Orders() {
    }

    public Orders(int id, Date creationdate, String clientfirstname, String clientlastname, Date deliverydate, String deliverymethod, String deliveryaddress) {
        this.id = id;
        this.creationdate = creationdate;
        this.clientfirstname = clientfirstname;
        this.clientlastname = clientlastname;
        this.deliverydate = deliverydate;
        this.deliverymethod = deliverymethod;
        this.deliveryaddress = deliveryaddress;
    }

    public Orders(int id, Date creationdate, String clientfirstname, String clientlastname, Date deliverydate, String deliverymethod, String deliveryaddress, Set productses) {
        this.id = id;
        this.creationdate = creationdate;
        this.clientfirstname = clientfirstname;
        this.clientlastname = clientlastname;
        this.deliverydate = deliverydate;
        this.deliverymethod = deliverymethod;
        this.deliveryaddress = deliveryaddress;
        this.productses = productses;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreationdate() {
        return this.creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getClientfirstname() {
        return this.clientfirstname;
    }

    public void setClientfirstname(String clientfirstname) {
        this.clientfirstname = clientfirstname;
    }

    public String getClientlastname() {
        return this.clientlastname;
    }

    public void setClientlastname(String clientlastname) {
        this.clientlastname = clientlastname;
    }

    public Date getDeliverydate() {
        return this.deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getDeliverymethod() {
        return this.deliverymethod;
    }

    public void setDeliverymethod(String deliverymethod) {
        this.deliverymethod = deliverymethod;
    }

    public String getDeliveryaddress() {
        return this.deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public Set getProductses() {
        return this.productses;
    }

    public void setProductses(Set productses) {
        this.productses = productses;
    }

    @Override
    public String toString() {
        return String.format("Order | id: %d, creation date: %s, First name: %s, Last name: %s, Delivery date: %s, Delivery method: %s, Delivery addr: %s", id, creationdate, clientfirstname, clientlastname, deliverydate, deliverymethod, deliveryaddress);
    }

}
