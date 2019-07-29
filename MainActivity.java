package com.example.android.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.cricketscore.R;

public class MainActivity extends AppCompatActivity {
    int teamscoreA = 0;
    int teamscoreB = 0;
    int wicketteamA= 0;
    int wicketteamb= 0;
    int oversteamB = 0;
    int oversteamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int scoreA = teamscoreA;
        int scoreB = teamscoreB;
        int wicketA = wicketteamA;
        int wicketB = wicketteamb;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
        displayForWicketA(wicketA);
        displayForWicketB(wicketB);
        displayForOversA(oversteamA);
        displayForOversB(oversteamB);
    }

    public void TeamAOneRun(View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49) {
            teamscoreA = teamscoreA + 1;
            displayForTeamA(teamscoreA);
        }
        }

    public void TeamATwoRun(View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49){
            teamscoreA = teamscoreA + 2;
            displayForTeamA(teamscoreA);
        }
        }

    public void TeamAThreeRun(View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49) {
            teamscoreA = teamscoreA + 3;
            displayForTeamA(teamscoreA);
        }
        }

    public void TeamAFourRun (View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49) {
            teamscoreA = teamscoreA + 4;
            displayForTeamA(teamscoreA);
        }
        }

    public void TeamASixRun(View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49)

        {
        teamscoreA = teamscoreA + 3;
        displayForTeamA(teamscoreA);
    }}

    public void TeamAWide (View view)
    {

        if (wicketteamA < 10 && oversteamA <= 49)

        {
        teamscoreA = teamscoreA + 1;
        displayForTeamA(teamscoreA);
    }}

    public void TeamANoball (View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49)

        {
        teamscoreA = teamscoreA + 1;
        displayForTeamA(teamscoreA);
    }}

    public void TeamAWicket (View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49)

        {
            wicketteamA = wicketteamA + 1;
            displayForWicketA(wicketteamA);
        }
    }
    public void TeamABalls (View view)
    {
        if (wicketteamA < 10 && oversteamA <= 49)

        {
            oversteamA = oversteamA + 1;
            displayForOversA(oversteamA);
        }}

    public void TeamAReset (View view)
    {
        teamscoreA = 0;
        oversteamA = 0;
        wicketteamA = 0;
        displayForTeamA(teamscoreA);
        displayForOversA(oversteamA);
        displayForWicketA(wicketteamA);
    }
        public void TeamBOneRun(View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        teamscoreB = teamscoreB + 1;
        displayForTeamB(teamscoreB);
    }}

    public void TeamBTwoRun(View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        teamscoreB = teamscoreB + 2;
        displayForTeamB(teamscoreB);
    }}

    public void TeamBThreeRun(View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        teamscoreB = teamscoreB + 3;
        displayForTeamB(teamscoreB);
    }}

    public void TeamBFourRun (View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        teamscoreB = teamscoreB + 4;
        displayForTeamB(teamscoreB);
    }}

    public void TeamBSixRun(View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        teamscoreB = teamscoreB + 6;
        displayForTeamB(teamscoreB);
    }}

    public void TeamBWide (View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        teamscoreB = teamscoreB + 1;
        displayForTeamB(teamscoreB);
    }}

    public void TeamBNoball (View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        teamscoreB = teamscoreB + 1;
        displayForTeamB(teamscoreB);
    }}

    public void TeamBWicket (View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
        wicketteamb = wicketteamb + 1;
            displayForWicketB(wicketteamb);
    }}
    public void TeamBBalls (View view)
    {
        if (wicketteamb < 10 && oversteamB <= 49)

        {
            oversteamB = oversteamB + 1;
            displayForOversB(oversteamB);
        }}
    public void TeamBReset (View view)
    {
        teamscoreB = 0;
        oversteamB = 0;
        wicketteamb = 0;
        displayForTeamB(teamscoreB);
        displayForOversB(oversteamB);
        displayForWicketB(wicketteamb);
        }


    /**

     * Displays the given score for Team A.

     */

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_runs);

        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_runs);

        scoreView.setText(String.valueOf(score));

    }
    public void displayForWicketA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);

        scoreView.setText(String.valueOf(score));

    }
    public void displayForWicketB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);

        scoreView.setText(String.valueOf(score));

    }

    public void displayForOversA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_overs);

        scoreView.setText(String.valueOf(score));

    }

    public void displayForOversB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_overs);

        scoreView.setText(String.valueOf(score));

    }
}
