
package javaapplication2;


public class Player {
    
    protected String position;
    protected String club;
    protected int scoredGoals;

    public Player(String position, String club, int scoredGoals) {
        this.position = position;
        this.club = club;
        this.scoredGoals = scoredGoals;
    }
    
     public Player() {
        this.position = "brak";
        this.club = "brak";
        this.scoredGoals = 0;
    }

    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }

    public int getScoredGoals() {
        return scoredGoals;
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
    public String toString() {
        return "Player{" + "position=" + position + ", club=" + club + ", scoredGoals=" + scoredGoals + '}';
    }
        
     public void details()
    {
        System.out.println(position + " " + club + " " + scoredGoals + " ");
               
    }
     
     public  void ScoreGoal()
     {
         System.out.println("ScoredGoals" + scoredGoals);
     }
    
}
