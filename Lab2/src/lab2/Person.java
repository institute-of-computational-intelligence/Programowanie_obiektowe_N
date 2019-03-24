package lab2;

import java.util.Date;

public class Person {
    protected String firstName;
    protected String lastName;
    protected Date dateOfBitrh;

    public Person() {
        this.firstName = "-";
        this.lastName = "-";
    }

    public Person(String firstName, String lastName, Date dateOfBitrh) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBitrh = dateOfBitrh;
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

    public Date getDateOfBitrh() {
        return dateOfBitrh;
    }

    public void setDateOfBitrh(Date dateOfBitrh) {
        this.dateOfBitrh = dateOfBitrh;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBitrh=" + dateOfBitrh + '}';
    }
    
    public void details() {
        System.out.println(toString());
    }
    
}