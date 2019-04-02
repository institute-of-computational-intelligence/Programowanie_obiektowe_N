
package laboratoria_1;

import java.util.Arrays;



public class Garage implements Cloneable  {
    
      /* Zmienne */
    private Car[] cars;
    private String address;
    private int capacity;
    /* Zmienne */
    
    /* Koństruktory */
    public Garage() {
        this.capacity =0;
        this.address = "brak";
        this.cars = new Car[this.capacity];
    }

    public Garage(String address, int capacity) {
        this.address = address;
        this.capacity = capacity;
        this.cars = new Car[capacity];
        
    }

    /* Koniec koństruktora */
    
    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
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
    
    public int CarsCount(){
        return cars.length;
    }

    @Override
    public String toString() {
        return "Garage{" + "cars=" + Arrays.toString(cars) + ", address=" + address + ", capacity=" + capacity + '}';
    }
    
    public void details(){
        
        System.out.println(toString());
        
    }

    @Override
    protected Garage clone() throws CloneNotSupportedException {
        return (Garage)super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    public void carEnter(Car car){
       if (CarsCount()>=capacity){
           System.out.println(String.format("Garaz przy adresie %s jest pelny",address ));
       }
       
       else
       {
           int index=0;
           
           while(cars[index]!=null){
               index++;
           }
           cars[index]=car;
           
       }
       
    }
    
    public Car carLeave(){
        
        if(CarsCount()==0){
            System.out.println("Nie ma samochodu do usuniecia");
            return null;
        }
        else{
            Car car = cars[CarsCount()-1];
            cars[CarsCount()-1] = null;
            return car;
        }
        
    }
}
