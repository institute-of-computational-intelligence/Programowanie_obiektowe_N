package entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Departments")
public class Department implements java.io.Serializable {

    @Id
    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "DeanName")
    private String deanName;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Student> students;

    public Department() {
    }

    public Department(String name, String address, String deanName) {
        this.name = name;
        this.address = address;
        this.deanName = deanName;
        this.students = new HashSet<Student>(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeanName() {
        return deanName;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> Students) {
        this.students = Students;
    }

    @Override
    public String toString() {
        return String.format("Department | name: %s, address: %s, dean name: %s", name, address, deanName);
    }
}
