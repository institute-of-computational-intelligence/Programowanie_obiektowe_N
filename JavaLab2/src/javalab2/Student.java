package javalab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Student extends Person{
    private int year;
    private int group;
    private int indexid;
    private List<Grade> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }

    public Student(String firstName,String lastName,Date dateOfBirth, int year, int group, int indexid) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexid = indexid;
        this.grades = new ArrayList<>();

    }

    public int getYear() {
        return year;
    }

    public int getGroup() {
        return group;
    }

    public int getIndexid() {
        return indexid;
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

    public void setIndexid(int indexid) {
        this.indexid = indexid;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
    
    @Override
    public String toString(){
        return this.getClass()+" "+this.firstName+" "+this.lastName+" "+this.year+" "+this.group+" "+this.indexid;
    }
    
    @Override
    public void details(){
        System.out.println(this.toString());
        displayGrades();
    }
    
    public void addGrade(String subjectName, double value, Date date){
        grades.add(new Grade(subjectName, value, date));
    }
    
    public void addGrade(Grade grade){
        grades.add(grade);
    }
    
    public void displayGrades(String subjectName){
        for(Grade foo : grades){
            foo.details();
        }
    }
    
    public void displayGrades(){
        System.out.println("Grade:\r\n");
        grades.forEach((foo) -> {
            foo.details();
        });    
    }
    
    public void deleteGrades(){
        grades.clear();
    }
    
    public void deleteGrade(String subjectString, double value, Date date){
        for(Grade foo : grades){
            if(foo.getSubjectName().equals(subjectString) && foo.getValue() == value && foo.getDate().equals(date))
                grades.remove(foo);
        }
    }
    
    public void deleteGrade(Grade grade){
        for(Grade foo : grades){
            if(foo.equals(grade))
                grades.remove(foo);
        }
    }
    
    public void deleteGrades(String subjectName){         
        for(Grade foo : grades){
            if(foo.getSubjectName().equals(subjectName))
                grades.remove(foo);
        }
    }
}
