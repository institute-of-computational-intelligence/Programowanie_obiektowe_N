/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.List;

/**
 *
 * @author Student
 */
public class Building { 
        
    private List<Apartment> aparments;
    private String address;

        
    public Building(String address) {
        this.address = address;
    }

    public List<Apartment> getAparments() {
        return aparments;
    }

    public void setAparments(List<Apartment> aparments) {
        this.aparments = aparments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    void createApartment (Apartment apartment){
        aparments.add(apartment);
    }
        
    void destroyApartment (int apartmentNumber){
        
    }

    @Override
    public String toString() {
        return "Building{" + "aparments=" + aparments + ", address=" + address + '}';
    }
    
    public void details() {
        System.out.println(this);
    }
        
    
}
