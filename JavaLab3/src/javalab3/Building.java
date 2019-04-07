package javalab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Building {
    private List<Apartment> aparments;
    private String address;

    public Building(String address) {
        this.aparments = new ArrayList<>();
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Apartment> getAparments() {
        return aparments;
    }
    
    public void details(){
        System.out.println(this.toString());
    }
    
    public void createAparment(Apartment apartment){
        this.aparments.add(apartment);
    }
    
    public void destroyApartment(int apartmentNumber){
    
    }
    @Override
    public String toString(){
        String foo = "";
        for(Apartment apa : this.aparments){
            foo += apa.toString();
            foo += "\n";
        }
        return address+"\n"+foo;
    }
}
