package po_n_lab2;

import java.util.Date;

public class FootballPlayer extends Player {
    public FootballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }

    @Override
    public void scoreGoal() {
        super.scoreGoal();
        System.out.println("Football player scored goal.");
    }
}