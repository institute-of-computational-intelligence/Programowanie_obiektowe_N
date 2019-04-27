package javalab4;

public class Product {
    private int id;
    private String type;
    private String name;
    private float price;

    public Product() {
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

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    @Override
    public String toString(){
        return "Produkt: " +  id + " " + type + " " + name + " " + price;
    }

}
