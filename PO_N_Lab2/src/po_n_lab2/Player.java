package po_n_lab2;

import java.util.Date;

public abstract class Player extends Person {
    protected String position;
    protected String club;
    protected int scoredGoals;

    public Player() {
        super();
    }

    public Player(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth);
        this.position = position;
        this.club = club;
        this.scoredGoals = scoredGoals;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getScoredGoals() {
        return this.scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    @Override
    public String toString() {
        return "{" +
            " position='" + getPosition() + "'" +
            ", club='" + getClub() + "'" +
            ", scoredGoals='" + getScoredGoals() + "'" +
            "}";
    }

    @Override
    public void details() {
        System.out.println(this);
    }

    public void scoreGoal() {
        scoredGoals++;
    }
}