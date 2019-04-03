package javalab2;
import java.util.Date;

/**
 *
 * @author Student
 */
public class HandballPlayer extends Player{

    public HandballPlayer() {
    }

    public HandballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }
    
    @Override
    public void ScoreGoal(){
         System.out.println("Footbalplayer scored goals:"+scoredGoals); 
    }
}
