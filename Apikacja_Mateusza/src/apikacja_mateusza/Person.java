
package apikacja_mateusza;

import java.util.Date;


public class Person {
   private String firstName;
   private String lastName;
   private Date dateOfBirth;
   
   Person(){
   this.firstName= "brak";
   this.lastName= "brak";
   this.dateOfBirth= new Date();
   }
   Person(String _firstName, String _lastName, Date _dateOfBirth){
   this.firstName=_firstName;
   this.lastName=_lastName;
   this.dateOfBirth=_dateOfBirth; 
   };

   public String getFirstName() {return firstName;}
   public String getLastName() {return lastName;}
   public Date getdateOfBirth() {return dateOfBirth;}
   
}
