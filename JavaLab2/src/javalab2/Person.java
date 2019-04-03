package javalab2;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected Date dateOfBirth;
    
    public Person(){}

    public Person(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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
    public String toString(){
        return "Person: "+this.firstName+" "+this.lastName;
    }
    

    public void details(){
        System.out.println(this.toString());
    }
    
}
