package lab3_zad2;

import java.util.List;
import java.util.NoSuchElementException;

public class Parking {
    private String name;
    private List<Car> cars;
    private int capacity;

    public Parking(List<Car> cars) {
        this.cars = cars;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Car> getCars() {
        return cars;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void carEnter(Car car){
        if(cars.size() < capacity)
            cars.add(car);
    }
    
    Car carLeave(String registrationNumber) throws NoSuchElementException, CloneNotSupportedException {
        try
        {
            Car car = cars.stream().filter(c -> c.registrationNumber.equals(registrationNumber)).findFirst().get();
            return car.clone();
        }
        catch(NoSuchElementException e)
        {
            System.out.println("There is no car with this registration number: " + registrationNumber);
            throw e;
        }
    }

    @Override
    public String toString() {
        // TODO: StrinBuilder
        String disp = "Parking " + name + " Capacity: " + capacity + " Cars count: " + cars.size() + "\n";
        for(Car car: cars){
            disp += "\t" + car + "\n";
        }
        return disp;
    }
    
    public void details(){
        System.out.println(this);
    }
}
