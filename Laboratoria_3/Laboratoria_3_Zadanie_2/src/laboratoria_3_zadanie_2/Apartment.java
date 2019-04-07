
package laboratoria_3_zadanie_2;


public class Apartment {
    
    private int number;
    private float area;
    private int numberofRooms;
    private boolean balcony;
    private int level;

    public Apartment(int number, float area, int numberofRooms, boolean balcony, int level) {
        this.number = number;
        this.area = area;
        this.numberofRooms = numberofRooms;
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

    public int getNumberofRooms() {
        return numberofRooms;
    }

    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
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
        return "Apartment " + "number: " + number + ", area: " + area + ", numberofRooms: " + numberofRooms + ", balcony: " + balcony + ", level: " + level+"\n";
        
    }
    
    public void details(){
        System.out.println("\n"+toString());
    }
    
    
}
