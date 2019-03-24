
package javaapplication2;

import java.util.Date;


    public class Person
{
protected String firstName;
protected String lastName;
protected Date dateOfBirth;

 



    public Person(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    
      public Person() {
        this.firstName = "brak";
        this.lastName = "brak";
        this.dateOfBirth = new Date();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + '}';
    }
   
    public void details()
    {
        System.out.println(firstName + " " + lastName + " " + dateOfBirth + " ");
               
    }
    
    
      
}
    

