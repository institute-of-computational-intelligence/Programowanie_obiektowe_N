
package javaapplication2;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Date;


public class JavaApplication2 {

 
    public static void main(String[] args) throws ParseException {
 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 Person person1 = new Person("Adam", "Miś", sdf.parse("21/12/1990"));
 Person person2 = new Student("Michał", "Kot", sdf.parse("15/01/1970"), 3, 5, 12345);
 Person person3 = new FootballPlayer("Mateusz", "Żbik", sdf.parse("11/08/1986"), "striker", "FC
Barcelona", 10);
        
  *     
      
    }
    
}





