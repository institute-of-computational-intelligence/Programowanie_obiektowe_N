package javalab3;

/**
 *
 * @author Student
 */
public class Car implements Cloneable {
    private String brand;
    private String model;
    private int doorCount;
    private float engineVolume;
    private double avgConsump;
    private String registrationNumber;
    private static int carCount;
    
    public Car(){}
    
    public Car(String brand, String model, int doorCount, float engineVolume, double avgConsump, String registrationNumber){
        this.brand = brand;
        this.model = model;
        this.doorCount = doorCount;
        this.engineVolume = engineVolume;
        this.avgConsump= avgConsump;
        this.registrationNumber= registrationNumber;
        carCount++;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public double getAvgConsump() {
        return avgConsump;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setAvgConsump(double avgConsump) {
        this.avgConsump = avgConsump;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    @Override
    public String toString(){
        return "Car. brand:"+brand+" model:"+model+" doors:"+doorCount+" engine:"+engineVolume;
    }
    
    public double calculateConsump(double roadLength){
        return 1.0;
    }
    
    public double calculateCost(double roadLength, double petrolCost){
        return calculateConsump(roadLength)*petrolCost;
    }
    
    public void details(){
        System.out.println(this.toString());
    }
    
    public static void displayCarCount(){
        System.out.println(carCount);
    }
    
    @Override
    public Car clone() throws CloneNotSupportedException{
        Car foo;
        try{
            foo = (Car)super.clone();
        }catch(CloneNotSupportedException e){
           return new Car(this.brand,this.model, this.doorCount, this.engineVolume, this.avgConsump, this.registrationNumber);
        }
        
        return foo;
    }
    
}