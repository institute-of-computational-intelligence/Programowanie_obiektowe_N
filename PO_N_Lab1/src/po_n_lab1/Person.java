/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Notebook
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

    public static int getMaxCarCount() {
        return maxCarCount;
    }

    public static void setMaxCarCount(int aMaxCarCount) {
        maxCarCount = aMaxCarCount;
    }

    public void addCarRegistrationNumber(String registrationNumber) {
        if (getMaxCarCount() <= this.registrationNumbers.size()) {
            System.out.println("The Person already have maximum number of cars");
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
            System.out.println("The giver registration number is not assigned to a person.");
        }
        registrationNumbers.remove(registrationNumber);
    }

    @Override
    public String toString() {
        String str = String.format("First name: %s, Last name: %s, Cars count: %d \r\n Registration numbers: ", firstName, lastName, this.registrationNumbers.size());
        for (String regNum : registrationNumbers) {
            str += regNum + ", ";
        }
        return str;
    }

    public void details() {
        System.out.println(this);
    }
}
