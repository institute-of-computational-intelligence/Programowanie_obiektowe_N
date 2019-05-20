package entities;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "Students")
public class Student implements java.io.Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "StudentId")
    private long id;
 
    @Column(name = "FirstName")
    private String firstName;
 
    @Column(name = "LastName")
    private String lastName;
 
    @Column(name = "Email")
    private String email;
 
    @Column(name = "Phone")
    private String phone;
 
    @ManyToOne
    @JoinColumn(name = "DepartmentId")
    private Department department;
 
    public Student() { }
 
    public Student(String firstName, String lastName, String email, String phone, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.department = department;
    }
    @Override
    public String toString(){
    return String.format("Student | First name : %s, Last name: %s, Phone: %s, department name: %s", firstName, lastName, phone, department.getName());
    }
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
