
package laboratoria_3_zadanie_2;

import java.util.ArrayList;
import java.util.List;


public class Building {
    
    private List<Apartment> aparments;
    private String address;

    public Building(String address) {
        this.address = address;
        this.aparments = new ArrayList<Apartment>();
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

    @Override
    public String toString() {
        return "Building " + "aparments: " + aparments + ", address: " + address + "\n";
    }
    
    public void details(){
        System.out.println(toString());
    }
    
    void createAparment(Apartment apartment){
        aparments.add(apartment);
    }
    
    void destroyApartment(int apartmentNumber){
        
        aparments.remove(apartmentNumber);
        
    }
}
