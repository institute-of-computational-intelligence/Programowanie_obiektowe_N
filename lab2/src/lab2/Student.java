/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Date;
import java.util.List;


public class Student extends Person{
    
    private int year;
    private int group;
    private int indexid;
    private List <Grade> grades;

    
    public Student(int year, int group, int indexid, List<Grade> grades, String firstName, String lastName, Date dataOfBirth) {
        super(firstName, lastName, dataOfBirth);
        this.year = year;
        this.group = group;
        this.indexid = indexid;
        this.grades = grades;
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

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" + "year=" + year + ", group=" + group + ", indexid=" + indexid + ", grades=" + grades + '}';
    }
    
    @Override
void details(){
    System.out.println(this);
   
    
    public void addGrade(String subjectName, double value ,Date date){
    
        grades.add(new Grade( subjectName,value ,date));
}
    
public void addGrade(Grade grade){
    
    grades.add(grade);
}

   
    
   

    
    
}
