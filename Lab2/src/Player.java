
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public abstract class Player extends Person{
    String position;
    String club;
    int scoredGoals;

    public Player() {
    }

    public Player(String position, String club, int scoredGoals, String firstName, String lastName, Date dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.position = position;
        this.club = club;
        this.scoredGoals = scoredGoals;
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
    public String toString(){
        return super.toString() + " " + position + " " + club + " " + scoredGoals;
    }
    
    public void details(){
        System.out.println(this);
    }
    
    public void ScoreGoal(){
        
    }
}
