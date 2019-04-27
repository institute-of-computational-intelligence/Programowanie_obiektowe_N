package po_n_lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person {
    private int year;
    private int group;
    private int indexId;
    private List<Grade> grades = new ArrayList<Grade>();

    public Student() {}

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexId) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexId = indexId;
    }


    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGroup() {
        return this.group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getIndexId() {
        return this.indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public List<Grade> getGrades() {
        return this.grades;
    }

    @Override
    public String toString() {
        return "{" +
            " year='" + getYear() + "'" +
            ", group='" + getGroup() + "'" +
            ", indexId='" + getIndexId() + "'" +
            ", grades='" + getGrades() + "'" +
            "}";
    }

    public void details() {
        System.out.println(this);
    }

    public void addGrade(String subjectName, double value, Date date) {
        addGrade(new Grade(subjectName, value, date));
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void displayGrades() {
        System.out.println(grades);
    }

    public void displayGrades(String subjectName) {
        
    }
}