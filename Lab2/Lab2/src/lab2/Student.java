package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

public class Student extends Person {
    private int year;
    private int group;
    private int indexid;
    private List<Grade> grades;

    public Student() { grades = new ArrayList<Grade>(); }

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexid) {
        
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexid = indexid;       
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

    public int getIndexid() {
        return indexid;
    }

    public void setIndexid(int indexid) {
        this.indexid = indexid;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void details(){
        System.out.println(this);
    }
    
    // To może nie działać ;)
    @Override
    public String toString() {
        return "Student{" + "year=" + year + ", group=" + group + ", indexid=" + indexid + ", grades=" + grades + '}';
    }
    
    public void addGrade(String subjectName, double value, Date date){
        Grade grade = new Grade(subjectName, value, date);
        grades.add(grade);
    }
    
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    
    public void displayGrade(){
        for(Grade grade: grades){
            grade.details();
        }
    }
    
    public void displayGrades(String subjectName){
        for(Grade grade: grades){
            if(grade.getSubjectName() == subjectName){
                grade.details();
            }
        }
    }
    
    public void deleteGrade(String subjectName, double value, Date date){
        for(Grade grade: grades)
        {
            if(grade.getSubjectName() == subjectName && 
                    grade.getValue() == value && 
                    grade.getDate() == date){
                grades.remove(grade);
            }
        }
    }
    
    public void deleteGrade(Grade grade){
        List<Grade> filteredGrades = grades.stream()
                .filter(t -> 
                        t.getSubjectName() == grade.getSubjectName()
                        && t.getValue() == grade.getValue() 
                        && t.getDate() == grade.getDate())
                .collect(toList());
        
        for(Grade gradeToRemove: filteredGrades)
        {
            grades.remove(grade);
        }
    }
 
    public void deleteGrades(String subjectName){
        List<Grade> gradesToRemove = grades.stream()
                .filter(t -> t.getSubjectName() == subjectName)
                .collect(toList());
        for(Grade grade: grades)
        {
            grades.remove(grade);
        }
    }
    
    public void deleteGrades(){
        grades = new ArrayList();
    }
}
