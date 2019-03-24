/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab1;

/**
 *
 * @author Notebook
 */
public class Garage {

    private Car[] cars;
    private String address;
    private int capacity;

    public Car[] getCars() {
        return cars;
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
        this.cars = new Car[capacity];
    }

    public int carsCount() {
         int count =0, index=0;
            while(index < cars.length){
              if(cars[index] != null)
                  count++;
                index++;
            }
        return count;
    }

    public Garage() {
        this.capacity = 0;
        this.address = "none";
        this.cars = new Car[this.capacity];
    }

    public Garage(String address, int capacity) {
        this.capacity = capacity;
        this.address = address;
        this.cars = new Car[capacity];
    }

    public void carEnter(Car car) {
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

    public Car carLeave() {
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
    public String toString() {
        String str = String.format("Garage | Address: %s, Capacity: %d, Cars count: %d \r\n CARS: \r\n", address, capacity, carsCount());
        for (Car car : cars) {
            str += car + "\r\n";
        }
        str += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++";
        return str;
    }

    public void details() {
        System.out.println(this);
    }
    
    @Override
    public Garage clone() throws CloneNotSupportedException {
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
