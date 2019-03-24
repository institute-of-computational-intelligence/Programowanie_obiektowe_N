package lab2;

import java.util.Date;

public class FootballPlayer extends Player {

    public FootballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }

    public void ScoreGOal(){
        System.out.println("Football Player scored a goal! XD");
    }
    
}
