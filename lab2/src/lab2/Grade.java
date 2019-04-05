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
public class Grade {
    
    String subjectName;
    private Date date;
    private double value;

    public Grade() {
    this.subjectName = "-";
    this.value = 0;
    }

    public Grade(String subjectName,  double value, Date date) {
        this.subjectName = subjectName;
        this.date = date;
        this.value = value;
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
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "Grade: " + value + " ,Subject: " + subjectName + " ,Date: " + dateFormat.format(date) ;
    }
    void details() {
        System.out.println(toString());
    }
    
    
}
