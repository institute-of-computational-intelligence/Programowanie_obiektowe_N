/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Date;

/**
 *
 * @author Student
 */
public class Grade {
    private String subjectName;
    private Date date;
    private double value;
    
    public Grade(){}

    public Grade(String subjectName, double value, Date date) {
        this.subjectName = subjectName;
        this.value = value;
        this.date = date;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Grade{" + "subjectName=" + subjectName + ", date=" + date + ", value=" + value + '}';
    }
    public void details(){
    
        System.out.println(this);
    }
    
    
}
