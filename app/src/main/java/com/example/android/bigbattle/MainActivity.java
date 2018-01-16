package com.example.android.bigbattle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.bigbattle.R;

public class MainActivity extends AppCompatActivity {

    int onemillioniOS = 0;
    int onemillionAndroid = 0;
    int oneProcentiOS = 0;
    int oneProcentAndroid = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForiOS(0);
        displayForAndroid(0);
        displayForProcentageiOS(0 );
        displayForProcentageAndroid(0 );
    }

    public void resetAll(View view) {
        onemillioniOS = 0 ;
        onemillionAndroid = 0 ;
        oneProcentiOS = 0;
        oneProcentAndroid = 0;
        displayForiOS(onemillioniOS);
        displayForAndroid(onemillionAndroid);
        displayForProcentageiOS(oneProcentiOS);
        displayForProcentageAndroid(oneProcentAndroid);
    }

    public void addOneMillionforiOS(View v) {
        onemillioniOS = onemillioniOS + 1;
        displayForiOS(onemillioniOS);
    }

    public void addOneProcentforiOS(View v) {

        oneProcentiOS = oneProcentiOS + 1;
        displayForProcentageiOS(oneProcentiOS);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForProcentageiOS(int score) {
        TextView scoreView = (TextView) findViewById(R.id.iOS);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForiOS(int score) {
        TextView scoreView = (TextView) findViewById(R.id.plusOneMillioniOS);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneMillionforAndroid(View v) {
        onemillionAndroid = onemillionAndroid + 1;
        displayForAndroid(onemillionAndroid);
    }

    public void addOneProcentforAndroid(View v) {

        oneProcentAndroid = oneProcentAndroid + 1;
        displayForProcentageAndroid(oneProcentAndroid);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForProcentageAndroid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.android);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForAndroid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.plusOneMillionAndroid);
        scoreView.setText(String.valueOf(score));
    }

}

