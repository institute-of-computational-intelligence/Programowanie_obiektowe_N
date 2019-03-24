
package lab_2;

import java.sql.Date;
import java.util.List;

public class Student extends Person{
   int year;
   int group;
   int indexid;
   List <Grade> grades;

    public Student(String firstName, String lastName, Date dateOfBirth) {
    super (firstName, lastName, dateOfBirth);
    }

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexid) {
        super (firstName, lastName, dateOfBirth);
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

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" + '}';
    }
    
    void details(){
        
    }
     
    void addGrade (String subjectName, double value, Date date) {
         
    }
    
    void addGrade (Grade grade){
        
    }
    
    void displayGrades(){
        
    }
    
    void displayGrades( String subjectName){
        
    }
    
    void deleteGrade(String subjectName, double value, Date date){
        
    }
    
    void deleteGrade(Grade grade){
        
    }
    
    void deleteGrades(String subjectName){
        
    }
    
    void dleeteGrades(){
        
    }
    
}
