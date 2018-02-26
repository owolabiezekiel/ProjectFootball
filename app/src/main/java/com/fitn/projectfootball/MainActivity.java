package com.fitn.projectfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamBarca = 0;
    int scoreTeamMadrid = 0;
    int barcaFoul = 0;
    int madridFoul = 0;
    int barcaCorner = 0;
    int madridCorner = 0;
    int barcaYellowCard = 0;
    int madridYellowCard = 0;
    int barcaRedCard = 0;
    int madridRedCard = 0;



    public void addBarcaGoal(View v){
        scoreTeamBarca += 1;
        displayBarcaScore(scoreTeamBarca);
    }

    public void addMadridGoal(View v){
        scoreTeamMadrid += 1;
        displayMadridScore(scoreTeamMadrid);
    }

    public void addBarcaFoul(View v){
        barcaFoul += 1;
    }

    public void addMadridFoul(View v){
        madridFoul += 1;
    }

    public void addBarcaCorner(View v){
        barcaCorner += 1;
    }

    public void addMadridCorner(View v){
        madridCorner += 1;
    }

    public void addBarcaYellow(View v){
        barcaYellowCard += 1;
    }

    public void addMadridYellow(View v){
        madridYellowCard += 1;
    }

    public void addBarcaRed(View v){
        barcaRedCard += 1;
    }

    public void addMadridRed(View v){
        madridRedCard += 1;
    }

    public void resetAll(View v){
        scoreTeamBarca = 0;
        scoreTeamMadrid = 0;
        barcaFoul = 0;
        madridFoul = 0;
        barcaCorner = 0;
        madridCorner = 0;
        barcaYellowCard = 0;
        madridYellowCard = 0;
        barcaRedCard = 0;
        madridRedCard = 0;
        displayBarcaScore(scoreTeamBarca);
        displayMadridScore(scoreTeamMadrid);
        showMatchDetails("");
    }

    public void displayBarcaScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barca_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayMadridScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.madrid_score);
        scoreView.setText(String.valueOf(score));
    }

    public void showMatchDetails(String matchDetails) {
        TextView detailsView = (TextView) findViewById(R.id.match_details);
        detailsView.setText(String.valueOf(matchDetails));
    }

    public void displayMatchDetails(View v) {
        String matchDetails = "Match Statistics\n";
        matchDetails += "Score\n" + scoreTeamBarca + " - " + scoreTeamMadrid + "\n";
        matchDetails += "Foul\n" + barcaFoul + " - " + madridFoul + "\n";
        matchDetails += "Corner Kick\n" + barcaCorner + " - " + madridCorner + "\n";
        matchDetails += "Yellow Card\n" + barcaYellowCard + " - " + madridYellowCard + "\n";
        matchDetails += "Red Card\n" + barcaRedCard + " - " + madridRedCard + "\n";
        matchDetails += "Possession: Not Supported In This Version Yet";
        TextView scoreView = (TextView) findViewById(R.id.match_details);
        scoreView.setText(String.valueOf(matchDetails));
    }
}
