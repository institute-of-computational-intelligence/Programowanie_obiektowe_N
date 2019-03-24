
package lab_2;

import java.sql.Date;


public class Grade {
   String subjectName;
   Date date;
   double value;

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
        return "Grade{" + '}';
    }
    void details(){
        
    }
    
    
}
