
package ML_lab3.java;


public class Car implements Cloneable{
    /* Zmienne */
    
    private String brand;
    private String model;
    private int doorCount;
    private float engineVolume;
    private double avgConsump;
    private String registrationNumber;
    private static int carCount = 0;
    
    /* Koniec zmiennych */
    
     public Car() {
         this.brand = "brak";
         this.model = "brak";
         this.doorCount = 0;
         this.engineVolume = 0.0F;
         this.avgConsump = 0.0;
         this.registrationNumber = "brak";
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
    
    /* Koniec koństruktorów */
    
    
    /*Gettery Settery*/

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
    
    
    /*Gettery Settery*/
    
    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", doorCount=" + doorCount + ", engineVolume=" + engineVolume + ", avgConsump=" + avgConsump + ", registrationNumber=" + registrationNumber + '}';
    }
    
    
    public double calculateConsump(double roadLength){
        
        return (roadLength/100)*avgConsump;
    };
    
    public double calculateCost(double roadLength, double petrolCost){
        return (roadLength/avgConsump)*petrolCost;
    }
    
    
    public void details(){
        System.out.println(toString()+"\n");
    }
    
    static void displayCarCount(){
        System.out.println(getCarCount());
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car)super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
}
