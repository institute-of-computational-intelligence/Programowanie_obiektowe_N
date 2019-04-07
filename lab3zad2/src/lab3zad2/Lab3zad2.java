/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3zad2;

/**
 *
 * @author Student
 */
public class Lab3zad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Apartment ap1 = new Apartment(1, 40, 3, true, 1);
    Apartment ap2 = new Apartment(2, 60, 5, true, 1);
    Apartment ap3 = new Apartment(3, 50, 4, false, 2);
    Building building = new Building("Armii Krajowej 36");
    building.createAparment(ap1);
    building.createAparment(ap2);
    building.createAparment(ap3);
    building.destroyApartment(2);
    building.details();
    
    }
    
}
