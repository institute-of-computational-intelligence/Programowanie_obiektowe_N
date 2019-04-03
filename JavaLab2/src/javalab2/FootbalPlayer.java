package javalab2;
import java.util.Date;

/**
 *
 * @author Student
 */
public class FootbalPlayer extends Player{

    public FootbalPlayer() {
    }

    public FootbalPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }
    
    @Override
    public void ScoreGoal(){
         System.out.println("Footbalplayer scored goals:"+scoredGoals); 
    }
}
