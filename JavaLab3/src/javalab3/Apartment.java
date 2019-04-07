package javalab3;

/**
 *
 * @author Student
 */
public class Apartment {
    private int number;
    private float area;
    private int numberOfRooms;
    private boolean balcony;
    private int level;

    public Apartment(int number, float area, int numberOfRooms, boolean balcony, int level) {
        this.number = number;
        this.area = area;
        this.numberOfRooms = numberOfRooms;
        this.balcony = balcony;
        this.level = level;
    }

    public int getNumber() {
        return number;
    }

    public float getArea() {
        return area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public int getLevel() {
        return level;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public String toString(){
        return "Apartment nr:"+this.number+" area:"+this.area+" number of rooms: "+this.numberOfRooms+" level:"+this.level;
    }
    
    public void details(){
        System.out.println(this.toString());
    }
    
    
}
