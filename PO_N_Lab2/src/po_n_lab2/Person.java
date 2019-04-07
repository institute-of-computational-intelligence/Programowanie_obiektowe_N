/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab2;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Notebook
 */
public class Person {

    protected String firstName;
    protected String lastName;
    protected Date dateOfBirth;

    public Person() {
        this.firstName = "none";
        this.lastName = "none";
        this.dateOfBirth = new Date();
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

    @Override
    public String toString() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        String str = String.format("Type: %s First name: %s, Last name: %s, Date of Birth: %s", this.getClass().getName(), firstName, lastName, formatter.format(dateOfBirth) );
        return str;
    }

    public void details() {
        System.out.println(this);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
