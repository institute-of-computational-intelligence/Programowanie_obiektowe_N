
package lab2;

import java.util.Date;

public class Player extends Person {
    
    protected String position;
    protected String club;
    protected int scoredGoals;

    public Player() {
    }

    public Player(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth);
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
        return "Player{" + "position=" + position + ", club=" + club + ", scoredGoals=" + scoredGoals + '}';
    }
    
    @Override
    public void details(){
        System.out.println(toString());
    }
    
    void ScoreGoal(){
        scoredGoals++;
    }
}
