package lab1;

public class Garage {
    Car[] cars;
    String address;
    int capacity;

    public Garage(){ }
    public Garage(String address, int capacity) {
        this.address = address;
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }
    
    public int carsCount(){
        return cars.length;
    }
    
    public void carEnter(Car car) throws CloneNotSupportedException {
        Car tmpCar[];
        if(cars != null)
        {            
            tmpCar = cars.clone();
            cars = new Car[cars.length + 1];
            for(int i = 0; i < tmpCar.length; i++){
                cars[i] = tmpCar[i];
            }
        }
        else
            cars = new Car[1];
    
        cars[cars.length - 1] = car;

    }
    
    public void details(){
        System.out.println("Capacity: " + capacity);
        System.out.println("Cars in the garage:");

        for(int i = 0; i < cars.length; i++){
            cars[i].details();
        }
    }
}
