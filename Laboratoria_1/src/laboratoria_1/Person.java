
package laboratoria_1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Person {
    
    protected static int maxCarCount;
    protected String firstName;
    protected String lastName;
    protected List <String> registrationNumbers;

    public Person() {
        this.firstName = "brak";
        this.lastName = "brak";
        this.registrationNumbers = new ArrayList<String>();
        
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumbers = new ArrayList<String>();
    }

    public Person(String firstName, String lastName, List<String> registrationNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumbers = registrationNumbers;
        this.registrationNumbers = new ArrayList<String>();
    }

    public static int getMaxCarCount() {
        return maxCarCount;
    }

    public static void setMaxCarCount(int aMaxCarCount) {
        Person.maxCarCount = aMaxCarCount;
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
    
    public void addCarRegistrationNumber(String registrationNumber) {
        if (getMaxCarCount() <= this.registrationNumbers.size()) {
            System.out.println("Ta osoba ma maksymalna ilosc pojazdow");
        } else {
            registrationNumbers.add(registrationNumber);
        }
    }
    
    public void removeCarRegistrationNumber(String registrationNumber) {
        try {
            String regNum = this.registrationNumbers
                    .stream()
                    .filter(rn -> rn.equals(registrationNumber))
                    .findFirst()
                    .get();
        } catch (NoSuchElementException ex) {
            System.out.println("Przekazywany numer rejestracyjny nie jest przypisany do nikogo");
        }
        registrationNumbers.remove(registrationNumber);
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", registrationNumbers=" + registrationNumbers + '}';
    }
    
    public void details(){
        System.out.println(toString());
    }
    
    
    
    
}


