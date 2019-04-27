
package lab3_zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Building {
    List<Apartment> apartments;
    String address;

    public Building(String address) {
        this.address = address;
        apartments = new ArrayList<>();
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        
        String disp = "Building" + address + "\n Apartments: \n";        
        for(Apartment apartment: apartments){
            disp += "\t" + apartment + "\n";
        }
        return disp;
    }
    
    public void details(){
        System.out.println(this);
    }
    
    void createApartment(Apartment apartment){
        apartments.add(apartment);
    }
    
    void destroyApartment(int apartmentNumber) throws NoSuchElementException {
        try{
            Apartment toDestroy = apartments.stream().filter(t -> t.number == apartmentNumber).findFirst().get();
        }
        catch(NoSuchElementException ex){
            System.err.println("No such apartment");
            throw ex;
        }
    }
}
