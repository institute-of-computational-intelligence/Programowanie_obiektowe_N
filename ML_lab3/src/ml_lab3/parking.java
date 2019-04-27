
package ML_lab3.java;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;


public class Parking {
    
    private String name;
    private List<Car> cars;
    private int capacity;

    public Parking(List<Car> cars) {
        this.cars = new ArrayList<Car>();
        this.cars = cars;
        
    }

    public List<Car> getCars() {
        return cars;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Parking{" + "name: " + name + ", \n Cars count: " + cars + ", \nCapacity: " + capacity + '}';
    }
    
    void details(){
        System.out.println(toString()+"\n");
    }
    
    void carEnter(Car car){
        
        cars.add(car);
    }
    
    public Car carLeave(String registrationNumber) throws CloneNotSupportedException{
       Car car = cars.stream()
                .filter(gr -> (gr.getRegistrationNumber() == null ? registrationNumber == null : gr.getRegistrationNumber().equals(registrationNumber)))
                .findFirst()
                .get();
       Car carToReturn = car.clone();
       cars.remove(car);
       return carToReturn;   
    }
    
    
    
    
}
