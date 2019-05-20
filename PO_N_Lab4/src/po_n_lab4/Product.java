/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab4;

/**
 *
 * @author Notebook
 */
public class Product {

    private int id;
    private String type;
    private String name;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Product() {
        this.id = 0;
        this.name = "";
        this.price = 0.0f;
        this.type = "";
    }

    public Product(int id, String type, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public Product(String type, String name, float price) {
        this.id = 0;
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    @Override
    public String toString(){
        return String.format("Id: %d, Name: %s, Type: %s, Price %f", id, name, type, price);
    }
}
