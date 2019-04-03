import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class Student extends Person
{
    private int year;
    private int group;
    private int indexId;
    private List<Grade>grades;

    public Student(String firstName, String lastName, Date dateOfBirth, int year, int group, int indexId) {
        super(firstName, lastName, dateOfBirth);

        this.year = year;
        this.group = group;
        this.indexId = indexId;
        grades = new ArrayList<Grade>();
    }

    public Student() {
        super();
        this.year = 0;
        this.group = 0;
        this.indexId = 0;
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

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                ", group=" + group +
                ", indexId=" + indexId +
                ", grades=" + grades +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + sdf.format(dateOfBirth) +
                '}';
    }
    public void details()
    {
        System.out.println(this);
    }

    public void addGrade(String subjectName, double value, Date date)
    {
        grades.add(new Grade(subjectName, value, date));
    }
    public void addGrade(Grade grade)
    {
        grades.add(grade);
    }

    public void displayGrades()
    {
        System.out.println(grades.toString());
    }

    public void displayGrades(String subjectName)
    {
        List<Grade>gradesToDisplay = grades.stream()
                .filter(c->c.getSubjectName() == subjectName)
                .collect(Collectors.toList());
        System.out.println(gradesToDisplay.toString());
    }

    public void deleteGrade(String subjectName, double value, Date date)
    {
        List<Grade> gradeToDelate = grades.stream()
                .filter(c->c.getSubjectName()==subjectName && c.getValue() == value && c.getDate() == date)
                .collect(Collectors.toList());
        grades.remove(gradeToDelate);

    }
    public void deleteGrade(Grade grade)
    {
        for(int i=0; i<grades.size(); i++)
            if(grades.get(i) == grade) grades.remove(grades.get(i));
    }

    public void deleteGrades(String subjectName)
    {
        List<Grade> gradesToDelate = grades.stream()
                .filter(c->c.getSubjectName()==subjectName).collect(Collectors.toList());

        grades.removeAll(gradesToDelate);
    }

    public void deleteGrades()
    {
        grades.removeAll(grades);
    }

}
