package lab1;

public class Garage {

    Car[] cars;
    String address;
    int capacity;

    public Garage() {
        this.capacity = 2;
    }

    public Garage(String address, int capacity) {
        super();
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

    public int carsCount() {
        return cars.length;
    }

    enum ChangeSize {

        IncreaseByOne,
        DecreaseByOne,
    }

    private int sizeValue(ChangeSize size) {
        if (size == ChangeSize.DecreaseByOne) {
            return -1;
        } else if (size == ChangeSize.IncreaseByOne) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Changes the size of cars array and copies existing cars that are already
     * in it
     */
    private void ChangeCarsSize(ChangeSize changeSize) {
        if (cars != null) {
            Car tmpCar[];
            tmpCar = cars.clone();
            int size = cars.length + sizeValue(changeSize);
            if(size < 1)
                size = 1;
            cars = new Car[size];
            for (int i = 0; i < tmpCar.length; i++) {
                cars[i] = tmpCar[i];
            }
        } else {
            cars = new Car[1];
        }
    }

    public void carEnter(Car car) throws CloneNotSupportedException {
        ChangeCarsSize(ChangeSize.IncreaseByOne);
        cars[cars.length - 1] = car;
    }

    public Car carLeave() throws CloneNotSupportedException, Exception {
        if (cars.length > 0) {
            Car carToReturn = cars[cars.length - 1].clone();
            ChangeCarsSize(ChangeSize.DecreaseByOne);
            return carToReturn;
        } else {
            throw new Exception("There are no cars in the garage!");
        }
    }

    public void details() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Cars in the garage:");

        for (int i = 0; i < cars.length; i++) {
            cars[i].details();
        }
    }
}
