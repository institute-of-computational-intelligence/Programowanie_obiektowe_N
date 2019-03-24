/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */

import java.util.*;

public class Student extends Person{
    private int year;
    private int group;
    private int indexid;
    private List<Grade> grades = new ArrayList<Grade>();

    public Student() { 
    }

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexid) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexid = indexid;
        
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

    @Override
    public String toString(){
        return super.toString() + " " + year + " " + group + " " + indexid + " " + grades;
    }
    
    @Override
    void details(){
        System.out.println(this);
    }
    
    public void addGrade(String subjectName, double value, Date date){
        grades.add(new Grade(subjectName, value, date));
    }
    
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    
    public void displayGrades(){
        for(Grade g : grades){
            System.out.println(g);
        }
    }
    
    public void displayGrades(String subjectName){
        for(Grade g : grades){
            if(g.getSubjectName() == subjectName){
                System.out.println(g);
            }
        }
    }
    
    public void deleteGrade(String subjectName, double value, Date date){
        Grade g = new Grade(subjectName, value, date);
        grades.remove(g);
    }
    
    public void deleteGrade(Grade grade){
        grades.remove(grade);
    }
    
    public void deleteGrades(String subjectName){
        for(Grade g : grades){
            if(g.getSubjectName() == subjectName){
                grades.remove(g);
            }
        }
    }
    
    public void deleteGrades(){
        grades.clear();
    }
}
