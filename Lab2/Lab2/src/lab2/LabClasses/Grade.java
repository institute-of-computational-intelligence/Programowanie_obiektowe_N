package lab2.LabClasses;

import java.util.Date;
import lab2.MyUtilities;

public class Grade implements Cloneable {
    private String subjectName;
    private Date date;
    private double value;

    public Grade() {}

    public Grade(String subjectName, double value ,Date date) {
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
        return "Grade: " + value + ", Subject: " + subjectName + ", Date: " + MyUtilities.DateFormatter.FormatDate("yyyy-MM-dd", date);
    }
    
    public void details(){
        System.out.println(this);
    }

    @Override
    protected Grade clone() throws CloneNotSupportedException {
        return new Grade(this.subjectName, this.value, this.date);
    }
    
    
}
