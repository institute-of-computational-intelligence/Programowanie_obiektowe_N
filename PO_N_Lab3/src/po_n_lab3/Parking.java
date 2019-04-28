/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab3;

import java.util.List;

/**
 *
 * @author Notebook
 */
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

    public void carEnter(Car car) {
        if (cars.size() >= capacity) {
            System.out.println(String.format("The parking at %s is full.", name));
        } else {
            cars.add(car);
        }
    }

    public Car carLeave(String registrationNumber) {
        Car car = cars.stream()
                .filter(rn -> rn.getRegistrationNumber().equals(registrationNumber))
                .findFirst()
                .get();
              
        if (car == null) {
            System.out.println("Car not exits.");
            return null;
        } else {
            cars.remove(car);
            
            return car;
        }
    }

    @Override
    public String toString() {
        String str = String.format("Parking %s, Capacity: %d, Cars count: %d \r\n CARS: \r\n", name, capacity, cars.size());
        for (Car car : cars) {
            str += car + "\r\n";
        }
        str += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
        return str;
    }

    public void details() {
        System.out.println(this);
    }

}
