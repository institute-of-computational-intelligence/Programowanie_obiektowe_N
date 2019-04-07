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
public class HandballPlayer extends Player {

    public HandballPlayer(String firstName, String lastName, Date dateOfBirth, String position, String club, int scoredGoals) {
        super(firstName, lastName, dateOfBirth, position, club, scoredGoals);
    }

    @Override
    public void ScoreGoal() {
        super.ScoreGoal();
        System.out.println("Handball player scored goal.");
    }
}
