
package apikacja_mateusza;

import static java.util.Collections.list;
import java.util.List;


public class Student {
   private int year;
   private int group;
   private int indexld;
   private List<Grade> grades;
   
   Student(){
   this.year= '0';
   this.group= '0';
   this.indexld='0' ;
   this.grades= getGrades();
   
   }
   
}
