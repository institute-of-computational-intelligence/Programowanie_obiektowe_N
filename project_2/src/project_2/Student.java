
package project_2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Student extends Person
{
    private int year;
    private int group;
    private int indexId;
    private List<Grade>grades;

    public Student() 
    {
        super();
        this.year = 0;
        this.group = 0;
        this.indexId = 0;
        grades = new ArrayList<Grade>();
    }

    public Student(String firstName, String lastName, Date dateofBirth, int year, int group, int indexId) 
    { 
        super(firstName, lastName, dateofBirth);
        this.year = year;
        this.group = group;
        this.indexId = indexId;
        grades = new ArrayList<Grade>();
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
    
    public void addGrade(String subjectName, double value, Date date)
    {
        grades.add(new Grade(subjectName, date, value));
    }
    public void addGrade(Grade grade)
    {
        grades.add(grade);
    }
    
    public void displayGrades()
    {
        grades.toString();
    }
    public void displayGrades(String subjectName)
    {
        for(int i=0; i<grades.size(); i++)
        {
             if(grades.get(i).getSubjectName() == subjectName) grades.get(i).getSubjectName();
        }
    }
    
    public void deleteGrade(String subjectName, double value, Date date)
    {
        
    }
    
    public void deleteGrade(Grade grade)
    {
        grades.remove(grade);
    }
    
    
    
    
    
    
    
    
    
}
