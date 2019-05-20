/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab5a;

import entities.Department;
import entities.Student;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import repo.IRepository;
import repo.NewHibernateUtil;
import repo.Repository;

/**
 *
 * @author Rafal
 */
public class PO_N_Lab5A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        System.out.println("===============CREATE TABLES FROM CLASS=====================");
        Configuration config = new Configuration();
        config.addAnnotatedClass(entities.Department.class);
        config.addAnnotatedClass(entities.Student.class);
        config.configure();
        new SchemaExport(config).create(true, true);
        System.out.println("");
        System.out.println("");
        System.out.println("=============== DML =====================");
        IRepository<Department> departmentRepo = new Repository<>(Department.class);
        Department wimiiDeparement = new Department("WIMII", "Armii Krajowej 21", "Prof. Malgorzata Klimek");
        departmentRepo.AddOrUpdate(wimiiDeparement);
        departmentRepo.Get().forEach(department -> {
            System.out.println(department);
        });
        wimiiDeparement.setAddress("Wolności 21");
        departmentRepo.AddOrUpdate(wimiiDeparement);
        departmentRepo.Get().forEach(department -> {
            System.out.println(department);
        });
        IRepository<Student> studentRepo = new Repository<>(Student.class);
        Student s1 = new Student("Anna", "Nowak", "anna.nowak@something.something", "123321123", wimiiDeparement);
        studentRepo.AddOrUpdate(s1);
        studentRepo.Get().forEach(stud -> {
            System.out.println(stud);
        });

        s1.setLastName("Kowalska");
        s1.setEmail("anna.kowalska@something.something");
        studentRepo.AddOrUpdate(s1);
        studentRepo.Get().forEach(stud -> {
            System.out.println(stud);
        });
        studentRepo.Delete(s1);
        departmentRepo.Delete(wimiiDeparement);
        NewHibernateUtil.shutdown();
    }

}
