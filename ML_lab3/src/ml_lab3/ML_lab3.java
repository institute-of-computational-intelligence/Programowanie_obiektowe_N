package ML_lab.java;

import java.util.ArrayList;
import java.util.List;

public class ML_lab.java; {

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
        
       
    }

}
