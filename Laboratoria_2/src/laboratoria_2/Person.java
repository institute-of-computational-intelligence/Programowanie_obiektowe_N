
package laboratoria_2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;





public class Person {
    
    protected String firstName;
    protected String lastName;
    protected Date dateOfBirth;

    public Person() {
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
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    
    @Override
    public String toString() {
        return "Person{" + "First name: " + firstName + ", Last name: " + lastName + ", Date of birth: " + dateOfBirth + '}';
    }

    public void details(){
        System.out.println(toString());
    }
    
    
    
}
