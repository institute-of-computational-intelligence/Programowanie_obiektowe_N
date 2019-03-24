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
public class Car {

    private String brand;
    private String model;
    private int doorCount;
    private float engineVolume;
    private double avgConsump;
    private String registrationNumber;

    private static int carCount = 0;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getAvgConsump() {
        return avgConsump;
    }

    public void setAvgConsump(double avgConsump) {
        this.avgConsump = avgConsump;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Car() {
        this.avgConsump = 0.0;
        this.brand = "none";
        this.doorCount = 0;
        this.engineVolume = 0.0F;
        this.model = "none";
        this.registrationNumber = "none";
        Car.carCount++;
    }

    public Car(String brand, String model, int doorCount, float engineVolume, double avgConsump, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.doorCount = doorCount;
        this.engineVolume = engineVolume;
        this.avgConsump = avgConsump;
        this.registrationNumber = registrationNumber;
        Car.carCount++;
    }

    @Override
    public String toString() {
        return String.format("Car | Brand: %s, Model: %s, NumOfDoors: %d, EngineVol: %f, AvgConsump: %f, RegistrationNumber: %s", brand, model, doorCount, engineVolume, avgConsump, registrationNumber);
    }

    public double calculateConsump(double roadLength) {
        return (avgConsump * roadLength) / 100.0;
    }

    public double calculateCost(double roadLength, double petrolCost) {
        return calculateConsump(roadLength) * petrolCost;
    }

    public void details() {
        System.out.println(this);
    }

    public static void displayCarCount() {
        System.out.println(String.format("Car instances count: %d", Car.carCount));
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
           return new Car(this.brand,this.model, this.doorCount, this.engineVolume, this.avgConsump, this.registrationNumber);
        }
    }
}
