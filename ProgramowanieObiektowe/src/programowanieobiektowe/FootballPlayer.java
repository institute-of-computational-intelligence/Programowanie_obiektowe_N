/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programowanieobiektowe;

import java.util.Date;

/**
 *
 * @author Student
 */
public class FootballPlayer extends Player {

    public FootballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }
    
    public void details(){
        System.out.println(this);
    }
}
