package lab2;

import java.util.Date;

public class Grade {
    private String subjectName;
    private Date date;
    private double value;

    public Grade() {
        
    }

    public Grade(String subjectName, Date date, double value) {
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
        return "Grade{" + "subjectName=" + subjectName + ", date=" + date + ", value=" + value + '}';
    }
    
    
    public void details() {
        System.out.println(toString());
    
}
}
