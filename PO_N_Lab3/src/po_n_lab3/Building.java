/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class Building {

    private List<Apartment> aparments;
    private String address;

    public List<Apartment> getAparments() {
        return aparments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Building(String address) {
        this.aparments = new ArrayList<>();
        this.address = address;
    }

    public void details() {
        System.out.println(this);
    }

    public void createApartment(Apartment apartment) {
        this.aparments.add(apartment);
    }

    public void destroyApartment(int apartmentNumber) {
        Apartment apartment = aparments.stream()
                .filter(ap -> ap.equals(apartmentNumber))
                .findFirst()
                .get();
        if (apartment == null) {
            System.out.println("Apartment not exits.");
            
        } else {
            aparments.remove(apartment);
        }
    }

    @Override
    public String toString() {
        String str = String.format("Building | Address: %s, \r\n Apartments: \r\n", address);
        for (Apartment apartment : aparments) {
            str += apartment + "\r\n";
        }
        str += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
        return str;
    }
}
