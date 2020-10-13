package com.example.scorekeeperproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * In American football there are four ways to score:
     * 1. Touchdown - worth 6 points
     * 2. Point Conversion / Two Point Conversion - worth one or two points, respectively
     * 3. Field goal - worth 3 points
     * 4. Safety - worth 2 points
     *
     * Each half of the game begins with each team having 3 timeouts total.
     *
     * For the purpose of this project, I will focus on the San Francisco 49ers (GO NINERS!)
     * and the North Carolina Panthers
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int timeOutTeamA = 3;
    int timeOutTeamB = 3;
    /**
     * Displays the given score for SF Niners.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the team score by 6 for SF Niners.
     */
    public void touchdownA(View v) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the team score by 1 for SF Niners.
     */
    public void pointConversionA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the team score by 3 for SF Niners.
     */
    public void fieldGoalA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the team score by 2 for SF Niners.
     */
    public void safetyA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the team score by 6 for NC Panthers.
     */
    public void touchdownB(View v) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the team score by 1 for NC Panthers.
     */
    public void pointConversionB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the team score by 3 for NC Panthers.
     */
    public void fieldGoalB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the team score by 2 for NC Panthers.
     */
    public void safetyB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Reset the score for both teams back to zero.
     * Reset the number of time outs back to three.
     */
    public void resetGame(View v) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        timeOutTeamA = timeOutTeamB = 3;
        displayTimeOutA(timeOutTeamA);
        displayTimeOutB(timeOutTeamB);
    }
    /**
     * Displays the remaining time outs for SF Niners.
     */
    public void displayTimeOutA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.timeOutsA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the remaining time outs for NC Panthers.
     */
    public void displayTimeOutB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.timeOutsB);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Reset the number of time outs available for both teams back to 3.
     */
    public void resetTimeOuts(View v) {
        timeOutTeamA = timeOutTeamB = 3;
        displayTimeOutA(timeOutTeamA);
        displayTimeOutB(timeOutTeamB);
    }
    /**
     * Displays the remaining time outs for SF Niners.
     */
    public void timeOutA(View v) {
        if (timeOutTeamA != 0)
        {
            timeOutTeamA = timeOutTeamA - 1;
            displayTimeOutA(timeOutTeamA);
        }
        else {
                timeOutTeamA = 0;
                displayTimeOutA(timeOutTeamA);
        }
    }
    /**
     * Displays the remaining time outs for NC Panthers.
     */
    public void timeOutB(View v) {
        if (timeOutTeamB != 0)
        {
            timeOutTeamB = timeOutTeamB - 1;
            displayTimeOutB(timeOutTeamB);
        }
        else {
            timeOutTeamB = 0;
            displayTimeOutB(timeOutTeamB);
        }
    }
}