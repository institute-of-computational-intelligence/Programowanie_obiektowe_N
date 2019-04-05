/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 1
 */
public class Student extends Person{
    
    private int year;
    private int group;
    private int indexid;
    private List<Grade> grades;

    public Student() {
        super();
        this.year = 0;
        this.group = 0;
        this.indexid = 0;
        this.grades = new ArrayList();
    }


        public Student (String firstName, String lastName, Date date, int year, int group, int indexid) {
        super(firstName, lastName, date);
        this.year = year;
        this.group = group;
        this.indexid = indexid;
        this.grades = new ArrayList();
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

    @Override
    public String toString() {
        
        return super.toString() + ", year:" + year + ", group:" + group + ", indexid:" + indexid + "\n Grades: " ;
    }

    public List<Grade> getGrades() {
        return grades;
    }
    
    void addGrade(String subjectName, double value, Date date) {
        grades.add( new Grade(subjectName,value,date));
    }
    
    void addGrade(Grade grade)    {
        grades.add(new Grade(grade.getSubjectName(), grade.getValue(), grade.getDate()));
    }
    @Override
    public void details()  {
        System.out.print(toString());
        displayGrades();
        System. out.println();
    }
    
    void deleteGrade( String subjectName, double value, Date date)  {
        Grade grade = new Grade(subjectName,value,date);
        deleteGrade(grade);
    }
    
    void deleteGrade (Grade grade)  {
        if (grades.removeIf(x -> x.equals(grade))){}
        else
            System.out.println("There is no such grade.");
    }
    
    void deleteGrades (String subjectName) {    //removes all grades with subjectName
        if (grades.removeIf(x -> x.subjectName.equals(subjectName))){}
        else
            System.out.println("No grade with such subject name.");
            
        
    }
    /*
    void deleteGrades2 (String subjectName) {   //removes first grade with name subjectName
        for (int i=0; i<grades.size(); i++)
            if (grades.get(i).subjectName.equals(subjectName)) {grades.remove(i);break;}
            else
                System.out.println("No grade with such subject name.");
            
                }
    */
    
    void deleteGrades() {
       grades.clear();
    }
    void displayGrades() {
        grades.forEach((grade) -> {
            System.out.println(grade.toString());
            
        });
    }
    
    void displayGrades(String subjectName) {
        for (Grade grade: grades)
        {
            if (grade.subjectName.equals(subjectName))
            System.out.println(grade.toString());
                    
        }
        
    }
    
}
