/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Student
 */
public class Student extends Person {
    private int year;
    private int group;
    private int indexId;
    private List <Grade> grades;
    
    public Student(){}

    public Student(int year, int group, int indexId, String firstName, String lastName, Date dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexId = indexId;
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
    
    public void details(){
    
        System.out.println(this);
       
    }
    
    public void addGrade(String subjectName, double value, Date date){
    
        grades.add(new Grade(subjectName, value, date));
    }
    
    public void addGrade(Grade grade){
    
        grades.add(grade);
    }
    public void displayGrades(){
    
        grades.forEach(i -> {
        
            System.out.println(i);
        });
        

    }
    
    public void displayGrades(String subjectName){
   
        grades.forEach(i -> {
            if(i.getSubjectName().contentEquals(subjectName))
            System.out.println(i);
        });
    }
    public void deleteGrade(String subjectName, double value, Date date){
    
        grades.remove()
    }
    public void deleteGrade(Grade grade){
    
        grades.remove(grade);
    }
    public void deleteGrades(String subjectName){
    
        grades.forEach(i -> {
            if(i.getSubjectName().contentEquals(subjectName))
            grades.remove(i);
        });
    }
    
    public void deleteGrades(){
    
        
    }
}
