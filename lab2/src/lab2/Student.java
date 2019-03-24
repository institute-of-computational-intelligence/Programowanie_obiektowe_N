
package lab2;

import java.util.Date;
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    private int year;
    private int group;
    private int indexId;
    private List<Grade> grades;

    public Student() {
    }

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexId ) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexId = indexId;
        this.grades = new ArrayList<Grade>();
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

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" + "year=" + year + ", group=" + group + ", indexId=" + indexId + ", grades=" + grades + '}';
    }
    
    @Override
    public void details(){
        System.out.println(toString());
    }
    
    public void addGrade(String subjectName,double value,Date date){
        
        Grade dodajGrada = new Grade(subjectName,value,date);
        grades.add(dodajGrada);
      
    }
    
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    
    public void displayGrades(){
        grades.forEach((nowygrad) -> {
            nowygrad.details();
        });
    }
    
}
