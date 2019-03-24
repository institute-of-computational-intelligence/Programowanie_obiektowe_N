
package project_2;

import java.util.Date;


public class Person {
    
    protected String firstName;
    protected String lastName;
    protected Date dateofBirth;

    public Person() {
        this.firstName = "brak";
        this.lastName = "brak";
        this.dateofBirth = new Date();       
    }

    public Person(String firstName, String lastName, Date dateofBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofBirth = dateofBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateofBirth=" + dateofBirth + '}';
    }
    
    public void details()
    {
        System.out.println(this);
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }
    
    
}
