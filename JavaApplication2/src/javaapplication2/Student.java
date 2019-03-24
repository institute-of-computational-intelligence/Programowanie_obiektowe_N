
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    
    private int year;
    private int group;
    private int indexld;
    private List<Grade>grades;
    
     public Student() {
        this.year = 1;
        this.group = 1;
        this.indexld = 111;
        this.grades = new ArrayList<Grade>();
    }

    public Student(int year, int group, int indexld, List<Grade> grades) {
        this.year = year;
        this.group = group;
        this.indexld = indexld;
        this.grades = grades;
    }

    public int getYear() {
        return year;
    }

    public int getGroup() {
        return group;
    }

    public int getIndexld() {
        return indexld;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setIndexld(int indexld) {
        this.indexld = indexld;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" + "year=" + year + ", group=" + group + ", indexld=" + indexld + ", grades=" + grades + '}';
    }
    
     public void details()
    {
        System.out.println(year + " " + group + " " + indexld + " " + grades + " ");
               
    }
    
    /* public void addGrade(String subjectName, double value, Date date)
     {
         
         ;}
     */
}
