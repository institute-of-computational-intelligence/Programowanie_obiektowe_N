package javalab2;
import java.util.Date;

/**
 *
 * @author Student
 */
public class Player extends Person{
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

    public int getScoredGoals() {
        return scoredGoals;
    }

    public String getClub() {
        return club;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }
    
    @Override
    public String toString(){
        return this.getClass()+" "+this.firstName+" "+this.lastName;
    }
    
    @Override
    public void details(){
        System.out.println(this.toString());
    }
    
    public void ScoreGoal(){
        System.out.println("player scored goals:"+scoredGoals); 
    }
    
}
