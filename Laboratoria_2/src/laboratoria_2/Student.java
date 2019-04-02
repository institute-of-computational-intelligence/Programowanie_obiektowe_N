
package laboratoria_2;

import java.util.Date;
import java.text.SimpleDateFormat; 
import java.util.ArrayList;
import java.util.List;
import static java.util.Locale.filter;
import java.util.NoSuchElementException;
import static java.util.stream.Collectors.toList;


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
    
   // public void displayGrades(String subjectName){
    //    grades.forEach((nowyGrad(subjectName)) -> {
      //      nowyGrad.
        //});
    //}
    
    public void deleteGrade(String subjectName, double value, Date date){
        for(Grade grade: grades)
        {
            if((grade.getSubjectName() == null ? subjectName == null : grade.getSubjectName().equals(subjectName)) && 
                    grade.getValue() == value && 
                    grade.getDate() == date){
                grades.remove(grade);
            }
        }
    }
    
    
            
        
        //grades.remove(usunGrada);
        
    
    
    public void deleteGrade(Grade grade){
        
        
        for(Grade gradzik: grades){
            if(gradzik.getSubjectName()==grade.getSubjectName()&&gradzik.getValue()==grade.getValue()&&gradzik.getDate()==grade.getDate()){
                grades.remove(gradzik);
            }
        }
        
        
        
    }
    
    public void deleteGrades(String subjectName){
        
       List<Grade> gradesToRemove = grades.stream()
                .filter(gr -> (gr.getSubjectName() == null ? subjectName == null : gr.getSubjectName().equals(subjectName)))
                .collect(toList());
        for(Grade grade: gradesToRemove)
        {
            grades.remove(grade);
        }
    }      
                
        
       
        
        
       
  
    
    public void deleteGrades(){
        grades = new ArrayList();
    }
}
