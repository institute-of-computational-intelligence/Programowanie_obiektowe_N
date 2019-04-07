package lab1;

import java.util.List;

public class Person {
    private static int maxCarCount;
    private String firstName;
    private String lastName;
    private List<String> registrationNumbers;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person() {}

    public static int getMaxCarCount() {
        return maxCarCount;
    }
    public static void setMaxCarCount(int maxCarCount) {
        Person.maxCarCount = maxCarCount;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public List<String> getRegistrationNumbers() {
        return registrationNumbers;
    }

    public void addCarRegistrationNumber(String registrationNumber){
        registrationNumbers.add(registrationNumber);
    }
    
    public void removeCarRegistrationNumber(String registrationNumber){
          String number = registrationNumbers.stream().filter(t -> t.equals(registrationNumber)).findFirst().get(); 
          if(number != null)
              registrationNumbers.remove(number);
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", registrationNumbers=" + registrationNumbers + '}';
    }
    
    public void details(){
        System.out.println(this);
    }
}
