package javalab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Person {

    private static int maxCarCount;
    private String firstName;
    private String lastName;
    private List<String> registrationNumbers;

    public Person() {
        this.firstName = "none";
        this.lastName = "none";
        this.registrationNumbers = new ArrayList<>();
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registrationNumbers = new ArrayList<>();
    }

    public static int getMaxCarCount() {
        return maxCarCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getRegistrationNumbers() {
        return registrationNumbers;
    }

    public static void setMaxCarCount(int maxCarCount) {
        Person.maxCarCount = maxCarCount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addCarRegistrationNumber(String registrationNumber) {
        if (this.registrationNumbers.size() <= Person.maxCarCount) {
            this.registrationNumbers.add(registrationNumber);
        }
    }

    public void removeCarRegistrationNumber(String registrationNumber) {
        this.registrationNumbers.remove(registrationNumber);
    }

    @Override
    public String toString() {
        String str = "Person. First name:" + firstName + " Lastname:" + lastName + "\r\n Registration Numbers: \r\n";
        for (String registrationNumber : registrationNumbers) {
            str += registrationNumber + "\r\n";
        }
        return str;
    }

    public void details() {
        System.out.println(this.toString());
    }

}
