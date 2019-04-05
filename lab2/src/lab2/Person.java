/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1
 */
public class Person {
    protected String firstName;
    protected String lastName;
    protected Date dateofbirth;

    public Person() {
        this.firstName = "-";
        this.lastName = "-";
    }

    public Person(String firstName, String lastName, Date dateofbirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateofbirth = dateofbirth;
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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");       
        return "Type: " + this.getClass().getName() + " First name: " + firstName + ", Last name: " + lastName + ", Date of birth: " +  dateFormat.format(dateofbirth) ;
        
    }
    
    /**
     *
     */
    public void details()  {
        System.out.println(toString());
    }
}
    