
package laboratoria_2;

import java.util.Date;


public class FootballPlayer extends Player {

    public FootballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }
    
    @Override
    public void ScoreGoal(){
        scoredGoals++;
    }
}
