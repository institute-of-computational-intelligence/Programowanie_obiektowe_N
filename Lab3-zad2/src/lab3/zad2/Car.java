package lab3.zad2;

public class Car implements Cloneable {
    String brand;
    String model;
    int doorCount;
    float engineVolume;
    double avgConsump;
    String registrationNumber;
    static int carCount;

    public Car() { carCount++; }

    public Car(String brand, String model, int doorCount, float engineVolume, double avgConsump, String registrationNumber)  {
        this();
        this.brand = brand;
        this.model = model;
        this.doorCount = doorCount;
        this.engineVolume = engineVolume;
        this.avgConsump = avgConsump;
        this.registrationNumber = registrationNumber;    
    }

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
    public static int getCarCount() {
        return carCount;
    }
    public static void setCarCount(int carCount) {
        Car.carCount = carCount;
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", doorCount=" + doorCount + ", engineVolume=" + engineVolume + ", avgConsump=" + avgConsump + ", registrationNumber=" + registrationNumber + '}';
    }
    
    public void details(){
        System.out.println(this);
    }
    
    public double calculateConsump(int kilometers){
        return (kilometers/100)*avgConsump;
    }
    
    public double calculateCost(int kilometers, int price){
        return calculateConsump(kilometers)*price;
    }
    
    public static void displayCarCount(){
        System.out.println(carCount);
    }
    
//    @Override
//    public Car clone() throws CloneNotSupportedException {
//        Car tmpCar = new Car();
//        tmpCar.avgConsump = this.avgConsump;
//        tmpCar.brand = this.brand;
//        tmpCar.doorCount = this.doorCount;
//        tmpCar.engineVolume = this.engineVolume;
//        tmpCar.registrationNumber = this.registrationNumber;
//        tmpCar.model = this.model;
//        return tmpCar;
//    }

    // Porównać z ^
    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }
}

