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
public class Grade {

    private String subjectName;
    private Date date;
    private double value;

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

    public Grade() {
        this.value = 0.0d;
        this.subjectName = "none";
        this.date = new Date();
    }

    public Grade(String subjectName, double value, Date date) {
        this.date = date;
        this.subjectName = subjectName;
        this.value = value;
    }

    @Override
    public String toString() {
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        return String.format("Grade: %f, Subject: %s, Date: %s", value, subjectName, formatter.format(date));
    }

    public void details() {
        System.out.println(this);
    }

}
