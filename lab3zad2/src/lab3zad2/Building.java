/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3zad2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Building {
    
    private List<Apartment> apartments;
    private String address;

    public Building(String address) {
        this.address = address;
        apartments = new ArrayList();
        
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

    @Override
    public String toString() {
        return "Building" + ", address: " + address +"\nApartments:\n" + apartments   +"\n";
    }
    
    void details()  {
        System.out.println(toString());
        }
    
    void createAparment(Apartment apartment)   {
        apartments.add(new Apartment(apartment.getNumber(),apartment.getArea(),apartment.getNumberOfRooms(),apartment.getBalcony(),apartment.getLevel()));
    }
    
    void destroyApartment(int apartmentNumber)  {
        for(Apartment apartment:apartments)
        {
            if (apartment.getNumber() == apartmentNumber) {apartments.remove(apartment);
        }
    }
}

  
}
