
package lab2;


public class Player {
    
    protected String position;
    protected String club;
    protected int scoredGoals;
    
    public Player(){}

    public Player(String position, String club, int scoredGoals) {
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
    
    void details(){
        System.out.println(this);
    }
    
    void ScoreGoal(){}
}
