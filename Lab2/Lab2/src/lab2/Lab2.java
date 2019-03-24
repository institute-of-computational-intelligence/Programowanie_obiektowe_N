package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Lab2 {

    public static void main(String[] args) throws ParseException{
 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 Person person1 = new Person("Adam", "Miś", sdf.parse("21/12/1990"));
 Person person2 = new Student("Michał", "Kot", sdf.parse("15/01/1970"), 3, 5, 12345);
 Person person3 = new FootballPlayer("Mateusz", "Żbik", sdf.parse("11/08/1986"), "striker", "FC Barcelona", 10);
 person1.details();
 person2.details();
 person3.details();
 Student student = new Student("Krzysztof", "Jeż", sdf.parse("29/12/1989"), 2, 5, 54321);
 Player footballer = new HandballPlayer("Piotr", "Kos", sdf.parse("14/09/1984"), "striker", "FC Politechnika", 2);
 student.details();
 footballer.details();
 ((Player) person3).ScoreGoal();
 footballer.ScoreGoal();
 footballer.ScoreGoal();
 person3.details();
 footballer.details();
 System.out.println("+=++++++++++++++++++++++++++++++++++++++++++++++");
 ((Student) person2).addGrade("PO", 5.0D, sdf.parse("20/02/2011"));
 ((Student) person2).addGrade("Bazy Danych", 5.0D, sdf.parse("22/04/2012"));
 person2.details();
 Grade grade = new Grade("Bazy Danych", 5.0D, sdf.parse("01/05/2011"));
 student.addGrade(grade);
 student.addGrade("AWWW", 5.0D, sdf.parse("11/04/2013"));
 student.addGrade("AWWW", 4.5D, sdf.parse("05/07/2009"));
 student.details();
 student.deleteGrade("AWWW", 4.5D, sdf.parse("07/10/2011"));
 student.details();
 student.deleteGrades("AWWW");
 student.details();
 student.addGrade("AWWW", 5.0D, sdf.parse("18/01/2017"));
 student.deleteGrades();
 student.details();
    }
}
