
package lab_2;

import java.sql.Date;

public class Player extends Person{
    
    String position;
    String club;
    int scoredGolas;

    public Player() {
        this.position = "null";
        this.club = "null";
        this.scoredGolas = 0;
    }

    public Player(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGolas) {
        super (firstName, lastName, dateOfBirth);
        this.position = position;
        this.club = club;
        this.scoredGolas = scoredGolas;
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

    public int getScoredGolas() {
        return scoredGolas;
    }

    public void setScoredGolas(int scoredGolas) {
        this.scoredGolas = scoredGolas;
    }

    @Override
    public String toString() {
        return "Player{" + '}';
    }
    
    void details()
    {
        System.out.println();
    }

    void ScoreGoal()
    {
        
    }

    
}
