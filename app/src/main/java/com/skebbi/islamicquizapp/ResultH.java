package com.skebbi.islamicquizapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Muhammad Abdulrahman Sarkin Kebbi  on 23-07-2021.
 */
public class ResultH extends AppCompatActivity {
        TextView tv, tv2, tv3;
        Button btnRestart;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);

            tv = (TextView)findViewById(R.id.tvres);
            tv2 = (TextView)findViewById(R.id.tvres2);
            tv3 = (TextView)findViewById(R.id.tvres3);
            btnRestart = (Button) findViewById(R.id.btnRestart);

            StringBuffer sb = new StringBuffer();
            sb.append("Correct answers: " + Hadith.correct + "\n");
            StringBuffer sb2 = new StringBuffer();
            sb2.append("Wrong Answers: " + Hadith.wrong + "\n");
            StringBuffer sb3 = new StringBuffer();
            sb3.append("Coins Rewarded: " + Hadith.correct + 3);
            tv.setText(sb);
            tv2.setText(sb2);
            tv3.setText(sb3);

            Hadith.correct=0;
            Hadith.wrong=0;
//This is a restart button with a  click Listener that take the user back to the main Dashboard so the user can start a new Quiz.
            btnRestart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(getApplicationContext(),Screen.class);
                    startActivity(in);
                }
            });
        }

    }
