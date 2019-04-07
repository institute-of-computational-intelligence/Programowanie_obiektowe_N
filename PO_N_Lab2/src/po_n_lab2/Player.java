/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab2;

import java.util.Date;

/**
 *
 * @author Notebook
 */
public abstract class Player extends Person {

    protected String position;
    protected String club;
    protected int scoredGoals;

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

    public Player() {
        super();
        this.scoredGoals = 0;
        this.club = "none";
        this.position = "none";
    }

    public Player(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth);
        this.position = position;
        this.scoredGoals = scoredGoals;
        this.club = club;
    }

    @Override
    public String toString() {
        return String.format(" %s Position: %s, Scored goals: %d, Club: %s", super.toString(), position, scoredGoals, club);
    }

    @Override
    public void details() {
        System.out.println(this);
    }

    public void ScoreGoal() {
        scoredGoals++;
    }
}
