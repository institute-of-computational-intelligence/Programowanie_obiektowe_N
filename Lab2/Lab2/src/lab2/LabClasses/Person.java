package lab2.LabClasses;

import java.util.Date;
import lab2.MyUtilities.*;

public class Person {
    protected String firstName;
    protected String lastName;
    protected Date dateOfBirth; // LocalDateTime (> Java 8)

    public Person(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {}

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
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Type: " + super.toString() + " First name: " + firstName + ", Last name: " + lastName + " Date of Birth: " + DateFormatter.FormatDate("yyyy-MM-dd", dateOfBirth);
    }
    
    public void details(){
        System.out.println(this);
    }
}