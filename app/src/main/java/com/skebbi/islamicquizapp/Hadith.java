package com.skebbi.islamicquizapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Muhammad Abdulrahman Sarkin Kebbi  on 23-07-2021.
 */
public class Hadith extends AppCompatActivity {

        TextView tv;
        Button submitbutton, quitbutton;
        RadioGroup radio_g;
        RadioButton rb1,rb2,rb3,rb4;
    //        List of Questions in the Hadith Activity each questions will be display one after the other.
        String questions[] = {
                "The word “Islam” means?",
                "What is the Shari’ah?",
                "What is the plural of hadith?",
                "Ahadith were collected on paper by?",
                "What is not one of the five pillars of Islam?",
                "What is the prayer (or religious) leader in a mosque called?",
                "What is something that is lawful and permitted in Islam called?",
                "Where was Zubayr ibn al-Awam born?",
                "Which Sahabi is buried in China?",
                "Which Sahabi died while reading Quran?",
                "Which Sahabi name mentioned in Quran?",
                "The last  Sahabi to die was?",
                "Which Sahabi was killed by his wife?",
                "The Qur’an acknowledges which prophet(s) from Judaism and Christianity?",
                "What is the holy month of fasting for Muslims called?",
                "Which area(s) of science did the Muslims contribute to the world?",
                "Which of the following cities is not a sacred city for Muslims?",
                "Which of the following sects are considered “Islamic”?",
                "Which state in the United States has the most Muslim residents?",
                "Who were the founders of the Ottoman Empire?",
                "What does Jihad mean?",
                "The migration of Muhammad(SAW) and his followers to Medina, called the hijrah,Took place in which year?",
                "Which Sahabi is blind?",
                "Which Sahabi died first?",
                "How many hadith did Aisha RA narrated?",
                "Who was the bravest Sahaba?",
                "How many wives prophet muhammad had?",
        };
    //        This is the list of answer for each questions at String question above
        String answers[] = {"Surrender to Allah","A form of Muslim law","Ahadith","Late generations","Give alms to the poor","Imam","Halal","Mecca, Saudi Arabia","Saʿd ibn Abī Waqqās"
                ,"Khubayb ibn Adiy","Zayd bin Haris","Anas","Malik ibn Nuwayra's","All of these","Ramadan"
                ,"Medicine","Mecca","All of these","California","Turks","Struggle","622 CE","Abdullah Ibn Umm-Maktum"
                ,"Anas bin Malik ibn Nadar al-Khazraji Al-Ansari","2,210 hadiths","Abu Dujana","13 wives"};
    //        This is the list of options on every question for each questions at String question above
        String opt[] = {
                "Those who follow Muhammad","Surrender to Allah","Recitations","Sons of Allah  ",
                "A religious school","A native dance","A style of calligraphy","A form of Muslim law",
                "Lot of  Hadiths","Hadithes","Hadiths","Ahadith",
                "Muhammad ibn Isma'il al-Bukhari","Late generations","prophet muhammad","Prophets",
                "Pray five times daily","Profess Allah as the only God","Make a pilgrimage to Mecca","Give alms to the poor",
                "Shaykh","Caliph","Imam","Mufti",
                "Hajj","Halal","Kosher","Jihad",
                "Yemen","Qatar","Mecca, Saudi Arabia","Afghanistan",
                "Uthman","Abd al‑Rahman ibn 'Awf","Saʿd ibn Abī Waqqās","Abu Bakr",
                "Uthman","Zayd bin Haris","Saʿd ibn Abī Waqqās","Khubayb ibn Adiy",
                "Zayd bin Haris","Zubayr ibn al‑Awam","Abu Bakr","Khubayb ibn Adiy",
                "Anas","Zayd bin Haris","Abu Bakr","Khalid ibn al‑Walid",
                "Khalid ibn al‑Walid","Abu Ubaidah ibn al-Jarrah","Malik ibn Nuwayra's","Khubayb ibn Adiy",
                "Abraham","Adam","Jesus","All of these",
                "Eid","Rajab","Ramadan","Muharram",
                "Algebra","Chemistry","Medicine","All of these",
                "Nigeria","Mecca","Cairo","Medina",
                "Shi’a","Kharijites","Sunni","All of these",
                "California","Michigan","New York","Texas",
                "Arabs","Russians","Turks","Mongols",
                "Holy war","Struggle","Cleanse","Gain freedom",
                "587 CE","612 CE","622 CE","631 CE",
                "Ahmad ibn Hanbal","Zayd ibn Thabit","Abu Musa Ashaari","Abdullah Ibn Umm-Maktum",
                "Ahmad ibn Hanbal","Anas bin Malik ibn Nadar al-Khazraji Al-Ansari","Abu Musa Ashaari","Abdullah Ibn Umm-Maktum",
                "1,210 hadiths","2,310 hadiths","2,210 hadiths","400 hadths",
                "Abu Dujana","Khalid ibn al‑Walid","Khubayb ibn Adiy","Non",
                "11 wives","4 wives","13 wives","12 wives",

        };
        int flag=0;
        public static int marks=0,correct=0,wrong=0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_questions);

            final TextView score = (TextView)findViewById(R.id.textView4);
            TextView textView=(TextView)findViewById(R.id.DispName);
            Intent intent = getIntent();
            String name= intent.getStringExtra("myname");
            //This is an IF STATEMENT that the check if the user a enter a name
            // if the user enter a name it will be display in the Layout
            // if the user has not enter a name it will display Assalamu'aliku.

            if (name.trim().equals(""))
                textView.setText("Assalamu'aliku");
            else
                textView.setText("Slm " + name);

            submitbutton=(Button)findViewById(R.id.button3);
            quitbutton=(Button)findViewById(R.id.buttonquit);
            tv=(TextView) findViewById(R.id.tvque);

            radio_g=(RadioGroup)findViewById(R.id.answersgrp);
            rb1=(RadioButton)findViewById(R.id.radioButton);
            rb2=(RadioButton)findViewById(R.id.radioButton2);
            rb3=(RadioButton)findViewById(R.id.radioButton3);
            rb4=(RadioButton)findViewById(R.id.radioButton4);
            tv.setText(questions[flag]);
            rb1.setText(opt[0]);
            rb2.setText(opt[1]);
            rb3.setText(opt[2]);
            rb4.setText(opt[3]);
            submitbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //int color = mBackgroundColor.getColor();
                    //mLayout.setBackgroundColor(color);

                    if(radio_g.getCheckedRadioButtonId()==-1)
                    {
                        //This is a Toast message  that asked the user to select one choice.
                        Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                    String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                    if(ansText.equals(answers[flag])) {
                        correct++;
                        CorrectToast();
                    }
                    else {
                        wrong++;
                        WrongToast();
                    }

                    flag++;

                    if (score != null)
                        score.setText(""+correct);

                    if(flag<questions.length)
                    {
                        tv.setText(questions[flag]);
                        rb1.setText(opt[flag*4]);
                        rb2.setText(opt[flag*4 +1]);
                        rb3.setText(opt[flag*4 +2]);
                        rb4.setText(opt[flag*4 +3]);
                    }
                    else
                    {
                        marks=correct;
                        Intent in = new Intent(getApplicationContext(),ResultH.class);
                        startActivity(in);
                    }
                    radio_g.clearCheck();
                }
            });
//This is a Quit button with a  click Listener that take the user to the result Activity and display the result to the user.
            quitbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),ResultH.class);
                    startActivity(intent);
                }
            });
        }
    //This method display a Custom toast to the user,when the user pick  Correct answer
    public  void  CorrectToast(){
        final MediaPlayer mediaPlayer  =MediaPlayer.create(this,R.raw.dingsound);
        mediaPlayer.start();
        Toast toast =new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        View custom_view=getLayoutInflater().inflate(R.layout.custom_toast,null);
        toast.setView(custom_view);
        toast.show();
    }
    //This method display a Custom toast to the user,when the user pick  wrong answer
    public  void  WrongToast(){
        Vibrator vibrator =(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(400);
        Toast wrongtoast =new Toast(getApplicationContext());
        wrongtoast.setDuration(Toast.LENGTH_SHORT);
        View custom_view=getLayoutInflater().inflate(R.layout.custom_wrong,null);
        wrongtoast.setView(custom_view);
        wrongtoast.show();
    }
    }