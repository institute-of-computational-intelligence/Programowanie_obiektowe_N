
package laboratorium_4;

import java.lang.reflect.Array;
import java.util.List;


public class Product {
    
    private int id;
    private String type;
    private String name;
    private float price;
    

    public Product() {
        this.id = 0;
        this.type = "---";
        this.name = "---";
        this.price = 0.0f;
        
    }

    public Product(int id, String type, String name, float price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public Product(String type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

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

    @Override
    public String toString() {
        return "Product: "
                + " Id: " + id
                + " Type: " + type 
                + " Name: " + name 
                + " Price: " + price;
        
    }
    
    
    
}
