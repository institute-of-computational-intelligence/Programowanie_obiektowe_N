/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */

import java.util.*;

public class Grade {
    private String subjectName;
    private double value;
        private Date date;
    
    public Grade() {}

    public Grade(String subjectName, double value, Date date) {
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
    public String toString(){
        return subjectName + " " + date + " " + value;
    }
    
    public void details(){
        System.out.println(this.toString());
    }
}
