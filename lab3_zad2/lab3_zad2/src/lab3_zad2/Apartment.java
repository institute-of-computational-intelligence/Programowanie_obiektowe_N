
package lab3_zad2;

public class Apartment {
    int number;
    float area;
    int numberOfRooms;
    boolean balcony;
    int level;

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
    public void setNumber(int number) {
        this.number = number;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public boolean isBalcony() {
        return balcony;
    }
    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Apartment{" + "number=" + number + ", area=" + area + ", numberOfRooms=" + numberOfRooms + ", balcony=" + balcony + ", level=" + level + '}';
    }

    void details(){
        System.out.println(this);
    }
    
}
