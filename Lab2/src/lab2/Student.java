package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Student
 */
public class Student extends Person {
    
    private int year;
    private int group;
    private int indexid;
    List <Grade> grades;

    public Student() {
        super();
        this.year = 0;
        this.group = 0;
        this.indexid = 0;
        this.grades = new ArrayList<>();
    }

    public Student( String firstName, String lastName, Date dateOfBitrh, int year, int group, int indexid) {
        super(firstName, lastName, dateOfBitrh);
        this.year = year;
        this.group = group;
        this.indexid = indexid;
        this.grades = new ArrayList<>();
    }

    



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getIndexid() {
        return indexid;
    }

    public void setIndexid(int indexid) {
        this.indexid = indexid;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBitrh=" + dateOfBitrh  + "year=" + year + ", group=" + group + ", indexid=" + indexid + ", grades=" + grades + '}';
    }

    void addGrade(String subjectName, double value, Date date) {
       
        
    }

    
    
    
   
}
