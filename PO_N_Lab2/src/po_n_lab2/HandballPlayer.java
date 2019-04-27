package po_n_lab2;

import java.util.Date;

public class HandballPlayer extends Player {
    public HandballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }

    @Override
    public void scoreGoal() {
        super.scoreGoal();
        System.out.println("Handball player scored goal.");
    }
}