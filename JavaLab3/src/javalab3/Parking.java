package javalab3;

import java.util.List;

/**
 *
 * @author Student
 */
public class Parking {
    private String name;
    private List<Car> cars;
    private int capacity;
    
    public Parking(List<Car> cars){
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getCars() {
        return cars;
    }
    
     public void carEnter(Car car){
         if(this.cars.size() > capacity){
             System.out.println("The parking is full.");
             return;
         }
         cars.add(car);
    }
    
    public Car carLeave(String registrationNumber){
        for(Car car : this.cars){
            if( car.getRegistrationNumber().equals(registrationNumber) ){
                this.cars.remove(car);
                return car;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String auta = "Cars:\n";
         for(Car car : this.cars){
            auta += car.toString();
            auta +="\n";
        }
        return "parking "+this.name + " pojemnosc "+capacity+" \n" + auta;
    }
    
    public void details(){
        System.out.println(this.toString());
    }
    
}
