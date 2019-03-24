package lab2;

import java.util.Date;

public class Player extends Person {
    protected String position;
    protected String club;
    protected int scoredGoals;

    public Player() {
        this.position = " - ";
        this.club = " - ";
        this.scoredGoals = 0;
    }

    public Player(String firstName, String lastName, Date dateOfBitrh, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBitrh);
        this.position = position;
        this.club = club;
        this.scoredGoals = scoredGoals;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    @Override
    public String toString() {
        return "Player{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBitrh=" + dateOfBitrh + "position=" + position + ", club=" + club + ", scoredGoals=" + scoredGoals + '}';
    }

    void ScoreGoal() {
        this.scoredGoals +=1;
    }
    
    
    
}
