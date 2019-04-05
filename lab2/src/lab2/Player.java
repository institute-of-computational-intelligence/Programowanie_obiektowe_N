/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Date;

/**
 *
 * @author 1
 */
public abstract class Player extends Person{
    protected String position;
    protected String club;
    protected int scoredGoals;

    public Player() {
        super();
        this.position = "-";
        this.club = "-";
        this.scoredGoals = 0;
    }

    public Player(String firstName, String lastName, Date dateofbirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateofbirth);
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
        return  super.toString() +
                "\nPosition: " + position + ", Club: " + club + ", Scored goals: " + scoredGoals ;
    }
    
    void ScoreGoal()    {
        this.scoredGoals ++;
    }
    
    
    
}
