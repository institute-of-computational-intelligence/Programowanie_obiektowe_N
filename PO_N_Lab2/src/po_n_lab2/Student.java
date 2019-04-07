/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Notebook
 */
public class Student extends Person {

    private int year;
    private int group;
    private int indexId;
    private List<Grade> grades;

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

    public Student() {
        super();
        this.year = 0;
        this.group = 0;
        this.indexId = 0;
        this.grades = new ArrayList<Grade>();
    }

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexId) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.indexId = indexId;
        this.grades = new ArrayList<Grade>();
    }

    @Override
    public String toString() {
        String str = String.format("%s Year: %d, group: %d, indexId: %d \r\n Grades:", super.toString(), year, group, indexId);
        for (Grade grade : grades) {
            str += grade + "\r\n";
        }
        return str;
    }

    @Override
    public void details() {
        System.out.println(this);
    }

    public void addGrade(String subjectName, double value, Date date) {
        Grade grade = new Grade(subjectName, value, date);
        grades.add(grade);
    }

    public void addGrade(Grade grade) {
        addGrade(grade.getSubjectName(), grade.getValue(), grade.getDate());
    }

    public void displayGrades() {
        String str = "Grades: \r\n";
        for (Grade grade : this.grades) {
            str += grade + "\r\n";
        }
        System.out.println(str);
    }

    public void displayGrades(String subjectName) {
        Grade grade = null;
        for (Grade gr : this.grades) {
            if (gr.getSubjectName() == subjectName) {
                grade = gr;
            }
        }
        if (grade != null) {
            grade.details();
        } else {
            System.out.println("There is no grade with given subject.");
        }
    }

    public void deleteGrade(String subjectName, double value, Date date) {
        Grade grade = null;
        for (Grade gr : this.grades) {
            if (gr.getSubjectName() == subjectName && gr.getValue() == value && gr.getDate().toString() == date.toString()) {
                grade = gr;
            }
        }

        if (grade != null) {
            grades.remove(grade);
        }
        System.out.println("There is no such grade.");
    }

    public void deleteGrade(Grade grade) {
        deleteGrade(grade.getSubjectName(), grade.getValue(), grade.getDate());
    }

    public void deleteGrades(String subjectName) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getSubjectName() == subjectName) {
                grades.remove(i);
            }
        }
    }

    public void deleteGrades() {
        grades.clear();
    }
}
