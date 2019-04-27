/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

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
        
    
        
}
