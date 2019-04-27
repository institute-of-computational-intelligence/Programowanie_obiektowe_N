/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_2;

import java.util.List;

/**
 *
 * @author Student
 */
public class Building {
    private List <Apartment> apartments;
    private String address;

    public Building(String address) {
        this.address = address;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void details(){
    
        System.out.println(this);
        
    }
    public void createApartment(Apartment apartment){
        apartments.add(apartment);
    }
    
    public void destroyApartment(int apartmentNumber){
        Apartment apartment = apartments.stream()
                .filter(t -> t.getNumber == apartmentNumber)
                .findFirst()
                .get();
                
    }

    @Override
    public String toString() {
        return "Building{" + "apartments=" + apartments + ", address=" + address + '}';
    }
    
    
}
