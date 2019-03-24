
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class HandballPlayer extends Player{

    public HandballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(position, club, scoredGoals, firstName, lastName, dateOfBirth);
    }
    
    @Override
    public void ScoreGoal(){
        System.out.println("Handball player score goal.");
    }
}
