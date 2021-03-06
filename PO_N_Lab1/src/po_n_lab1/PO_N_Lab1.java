/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab1;

import java.io.IOException;

/**
 *
 * @author Notebook
 */
public class PO_N_Lab1 {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        Car car1 = new Car();
        car1.details();
        car1.setBrand("Fiat");
        car1.setModel("126p");
        car1.setDoorCount(2);
        car1.setEngineVolume(650);
        car1.setAvgConsump(6.0);
        car1.setRegistrationNumber("KR12345");
        car1.details();
        Car car2 = new Car("Syrena", "105", 2, 0.8f, 7.6d, "WE1234");
        System.out.println(car2);
        double routeConsumption = car2.calculateConsump(500);
        System.out.println(String.format("Route consumption: %f l", routeConsumption));
        double routeCost = car2.calculateCost(500, 5);
        System.out.println(String.format("Route cost: %f", routeCost));
        Car.displayCarCount();
        System.out.println("==================Copy References Example ==========================");
        Car car3 = car2;
        car3.details();
        car3.setModel("OPEL");
        car3.details();
        car2.details();
        System.out.println("==================Copy objects Example ==========================");
        Car car4 = car2.clone();
        car4.setModel("AUDI");
        car2.details();
        car4.details();
        System.out.println("================== GARAGE ==========================");
        Garage garage1 = new Garage();
        garage1.setAddress("ul. Garażowa 1");
        garage1.setCapacity(1);
        garage1.carEnter(car4);
        garage1.details();
        Garage garage2 = new Garage("ul. Garażowa 2", 2);
        garage2.carEnter(car1);
        garage2.carEnter(car2);
        garage2.details();
        Car movedCar = garage1.carLeave();
        garage2.carEnter(movedCar);
        String address = garage2.getAddress();
        Car[] cars = garage2.getCars();
        garage1.details();
        garage2.details();
        System.out.println("==================Copy References Example with array field ==========================");
        Garage garage3 = garage2;
        garage3.carLeave();
        garage2.details();
        garage3.details();
        System.out.println("==================Copy objects Example with array field ==========================");
        Garage garage4 = garage2.clone();
        garage4.carEnter(car4);
        garage2.details();
        garage4.details();
        System.out.println("================== Class with list field ==========================");
        Person.setMaxCarCount(3);
        Person person1 = new Person();
        person1.setFirstName("Jan");
        person1.setLastName("Kowalski");
        person1.addCarRegistrationNumber("SCZ 12345");
        person1.addCarRegistrationNumber("SC 9863");
        person1.addCarRegistrationNumber("SCZ 37893");
        person1.addCarRegistrationNumber("SCZ 4912");
        person1.details();
        Person person2 = new Person("Piotr", "Nowak");
        person2.addCarRegistrationNumber("DW 9866");
        person2.details();
        person2.removeCarRegistrationNumber("DW 9866");
        person2.details();
        person2.removeCarRegistrationNumber("DW 9866");
    }

}
