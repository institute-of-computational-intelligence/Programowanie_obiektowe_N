package lab2;

import java.util.Date;

public class HandballPlayer extends Player {

    public HandballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }
    
    public void ScoreGoal(){
                System.out.println("Handball Player scored a goal! yaaay!");
    }
}
