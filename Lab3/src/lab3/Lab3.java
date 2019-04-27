//Zadanie 1.
package lab3;

/**
 *
 * @author Student
 */
public class Lab3 {
    
    public static void main(String[] args) {
    // Interfaces, Dependency injection
    DbConnection oracleConnection = new OracleDbConnection();
    DbConnection sqlServerConnection = new SqlServerConnection();
    Application application =
    //new Application(sqlServerConnection); // injection of sqlserver connection
    new Application(oracleConnection); // injection of oracle connection
    application.GetData();
    System.out.println("============================================");
    System.err.println("");
   /* List<Car> cars = new ArrayList<>();
    cars.add(new Car("Syrena", "105", 2, 0.8f, 7.6d, "WE1234"));
    cars.add(new Car("AUDI", "A4", 4, 1.9f, 7.6d, "SC1234"));
    cars.add(new Car("Renault", "Clio", 5, 1.4f, 4.6d, "WW1234"));
    Parking parking = new Parking(cars);
    Car car = parking.carLeave("WW1234");
    parking.details();
    car.setRegistrationNumber("AA543321");
    parking.carEnter(car);
    parking.details();
    Apartment ap1 = new Apartment(1, 40, 3, true, 1);
    Apartment ap2 = new Apartment(2, 60, 5, true, 1);
    Apartment ap3 = new Apartment(3, 50, 4, false, 2);
    Building building = new Building("Armii Krajowej 36");
    building.createApartment(ap1);
    building.createApartment(ap2);
    building.createApartment(ap3);
    building.details();*/
 }
    
}
