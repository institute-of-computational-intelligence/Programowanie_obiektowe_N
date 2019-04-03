package javalab1;

/**
 *
 * @author Student
 */
public class Garage implements Cloneable{
    private Car[] cars;
    private String address;
    int capacity;

    public Garage() {}

    public Garage(String address, int capacity) {
        this.address = address;
        this.capacity = capacity;
        cars = new Car[capacity];
    }

    public Car[] getCars() {
        return cars;
    }

    public String getAddress() {
        return address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        cars = new Car[capacity];

    }
    
    public int carsCount(){
        return cars.length;
    }
    
    public void carEnter(Car car){
        if (carsCount() >= capacity) {
            System.out.println(String.format("The garage at %s is full.", address));
        } else {
            int index =0;
            while(cars[index] != null){
              index++;
            }
            cars[index] = car;
        }
    }
    
    public Car carLeave(){
        if (carsCount() == 0) {
            System.out.println("There is no cars to leave.");
            return null;
        } else {
            Car car = cars[carsCount() - 1];
            cars[carsCount() - 1] = null;
            return car;
        }
    }
    
    @Override
    public String toString(){
        return "Garage. address:"+address+" capacity:"+capacity;
    }
    
    public void details(){
        System.out.println(this.toString());
    }
    
    @Override
    public Garage clone() throws CloneNotSupportedException{
        try {
            return (Garage) super.clone();
        } catch (CloneNotSupportedException e) {
            Garage garage = new Garage();
            garage.address = this.getAddress();
            garage.capacity= this. getCapacity();
            Car[] cars = this.getCars();
            garage.cars = new Car[cars.length];
            System.arraycopy(cars, 0, garage.cars, 0, cars.length);
            return garage;
        }
    }
}
