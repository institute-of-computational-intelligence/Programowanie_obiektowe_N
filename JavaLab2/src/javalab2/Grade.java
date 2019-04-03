package javalab2;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Grade {
    private String subjectName;
    private Date date;
    private double value;

    public Grade() {
        subjectName = "null";
    }

    public Grade(String subjectName, double value, Date date) {
        this.subjectName = subjectName;
        this.date = date;
        this.value = value;
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
    
    @Override
    public String toString(){
        return "Grade: "+this.subjectName+" "+this.date+" "+this.value;
    }
    

    public void details(){
        System.out.println(this.toString());
    }
}
