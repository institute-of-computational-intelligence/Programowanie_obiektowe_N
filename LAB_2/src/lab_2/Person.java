
package lab_2;

import java.sql.Date;


public class Person {
    String firstName;
    String lastName;
    Date dateOfBirth;

   
    
    public Person() {
        this.firstName = "none";
        this.lastName = "none";
        //this.dateOfBirth = (21/12/1990, true);
    }

    public Person(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" + '}';
    }
    
    void details(){
        
    }
    
    
    
    
}
