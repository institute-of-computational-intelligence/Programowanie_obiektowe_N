/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {

        System.err.println("");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Syrena", "105", 2, 0.8f, 7.6d, "WE1234"));
        cars.add(new Car("AUDI", "A4", 4, 1.9f, 7.6d, "SC1234"));
        cars.add(new Car("Renault", "Clio", 5, 1.4f, 4.6d, "WW1234"));
        Parking parking = new Parking(cars);
        Car car = parking.carLeave("WW1234");
        parking.details();
        car.setRegistrationNumber("AA543321");
        parking.carEnter(car);
        parking.details();
//        Apartment ap1 = new Apartment(1, 40, 3, true, 1);
//        Apartment ap2 = new Apartment(2, 60, 5, true, 1);
//        Apartment ap3 = new Apartment(3, 50, 4, false, 2);
//        Building building = new Building("Armii Krajowej 36");
//        building.createApartment(ap1);
//        building.createApartment(ap2);
//        building.createApartment(ap3);
//        building.details();
        }
}
