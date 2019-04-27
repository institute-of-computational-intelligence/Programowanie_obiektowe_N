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
public class Parking {
    private String name;
    private List <Car> cars;
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
    
    public void carEnter(Car car){
        
    }
    public Car carLeave(String registrationNumber){
        
               Car car = cars.stream()
                       .filter(c -> c.getRegistrationNumber().equals(registrationNumber))
                       .findFirst()
                       .get();
        
    }

    @Override
    public String toString() {
        return "Parking{" + "name=" + name + ", cars=" + cars + ", capacity=" + capacity + '}';
    }
    public void details(){
        System.out.println(this);
    }
}
