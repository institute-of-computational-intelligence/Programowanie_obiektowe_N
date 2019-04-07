package laboratoria_3_zadanie_2;

import java.util.ArrayList;
import java.util.List;

public class Laboratoria_3_Zadanie_2 {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        System.out.println("\nLinia kodu wykonana\n");
        cars.add(new Car("Syrena", "105", 2, 0.8f, 7.6d, "WE1234"));
        System.out.println("\nLinia kodu wykonana\n");
        cars.add(new Car("AUDI", "A4", 4, 1.9f, 7.6d, "SC1234"));
        System.out.println("\nLinia kodu wykonana\n");
        cars.add(new Car("Renault", "Clio", 5, 1.4f, 4.6d, "WW1234"));
        System.out.println("\nLinia kodu wykonana\n");
        Parking parking = new Parking(cars);
        System.out.println("\nLinia kodu wykonana\n");
        Car car = parking.carLeave("WW1234");
        System.out.println("\nLinia kodu wykonana\n");
        parking.details();
        System.out.println("\nLinia kodu wykonana\n");
        car.setRegistrationNumber("AA543321");
        System.out.println("\nLinia kodu wykonana\n");
        parking.carEnter(car);
        System.out.println("\nLinia kodu wykonana\n");
        parking.details();
        System.out.println("\nLinia kodu wykonana\n");
        
        /*Apartment ap1 = new Apartment(1, 40, 3, true, 1);
        Apartment ap2 = new Apartment(2, 60, 5, true, 1);
        Apartment ap3 = new Apartment(3, 50, 4, false, 2);
        Building building = new Building("Armii Krajowej 36");
        building.createAparment(ap1);
        building.createAparment(ap2);
        building.createAparment(ap3);
        building.details();
        */
    }

}
