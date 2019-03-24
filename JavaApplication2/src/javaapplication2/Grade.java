
package javaapplication2;

import java.util.Date;


public class Grade {
    
    private String subjectName;
    private Date date;
    private double value;

    public Grade(String subjectName, Date date, double value) {
        this.subjectName = subjectName;
        this.date = date;
        this.value = value;
    }
     public Grade() {
        this.subjectName = "brak";
        this.date = new Date();
        this.value = 0.0;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Date getDate() {
        return date;
    }

    public double getValue() {
        return value;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public void details()
    {
        System.out.println(subjectName + " " + date + " " + value + " ");
               
    }
}
