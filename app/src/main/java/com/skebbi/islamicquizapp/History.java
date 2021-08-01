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
public class History extends AppCompatActivity {

        TextView tv;
        Button submitbutton, quitbutton;
        RadioGroup radio_g;
        RadioButton rb1,rb2,rb3,rb4;
    //        List of Questions in the History Activity each questions will be display one after the other.
        String questions[] = {
                "What is not one of the five pillars of Islam?",
                "Who is the first prophet?",
                "Who is the youngest prophet in Islam?",
                "Who was the 3rd prophets in Islam?",
                "Who wrote Quran?",
                "What was the first hadith?",
                "Who was the first caliph?",
                "How many days are in the Islamic lunar month?",
                "How many prophets are mentioned in the Quran?",
                "To which prophet did Allah order to build an ark?",
                "To which prophet did Allah directly speak to?",
                "Who has been sent as a mercy to the worlds?",
                "Where was the Prophet Muhammad born?",
                "Where did the Prophet Muhammad die?",
                "What are the angels made from?",
                "What is the prayer (or religious) leader in a mosque called?",
                "What is something that is lawful and permitted in Islam called?",
                "The Qur’an acknowledges which prophet(s) from Judaism and Christianity?",
                "What is the holy month of fasting for Muslims called?",
                "Which area(s) of science did the Muslims contribute to the world?",
                "Which of the following cities is not a sacred city for Muslims?",
                "Which of the following sects are considered “Islamic”?",
                "Which state in the United States has the most Muslim residents?",
                "Who were the founders of the Ottoman Empire?",
                "What does Jihad mean?",
                "What is the calendar which Muslims use?",
                "The migration of Muhammad(SAW) and his followers to Medina, called the hijrah,Took place in which year?",
                "Which Sahabi died in the hand of Prophet?",
                "Who is the only woman mentioned in the Quran?",
                "What is the name of firon wife?",
                "Who suggested name Ahmed for the Holy Prophet?",
                "Which Sahaba killed his father?",
                "Who was the poet of Prophet Muhammad?",
                "How many companions did Prophet Muhammad (PBUH)have?",
                "Which country has the most Muslims?",
                "Who was Muhammad's favorite wife?",
        };
    //        This is the list of answer for each questions at String question above
        String answers[] = {"Give alms to the poor","Prophet Adam","Jacob","Prophet Idris","Abu Bakr Siddiq","Muwatta Imam Malik","Abū Bakr","29 or 30 days","25","Prophet Noah (PBUH)",
                "Prophet Moses (PBUH)","Prophet Muhammad (PBUH)","Mecca, Arabia","Medina, Arabia","From light",
                "Imam","Halal","All of these","Ramadan","Medicine","Mecca","All of these","California",
                "Turks","Struggle","Hijrah","622","Muṣʽab ibn ʽUmair","Maryam"
                ,"Asiya bint Muzahim","Bibi Aamna","Abu Ubaidah","Ḥassān ibn Thābit","10 Companions","Indonesia","Aisha"};
    //        This is the list of options on every question for each questions at String question above
        String opt[] = {
                "Pray five times daily","Profess Allah as the only God","Make a pilgrimage to Mecca","Give alms to the poor",
                "Prophet Idris","Prophet Nuh","Prophet Hud","Prophet Adam",
                "Prophet Moses (PBUH)","Prophet Nuh","Prophet Hud","Prophet Jacob",
                "Prophet Idris","Prophet Nuh","Prophet Hud","Prophet Adam",
                "Prophet Muhammad (PBUH)","Prophet Moses (PBUH)","Prophet Hud (PBUH)","Abu Bakr Siddiq",
                "Prophet Muhammad (PBUH)","Malik ibn Anas","Muwatta Imam Malik","Abu Bakr Siddiq",
                "Abū Bakr","Malik ibn Anas","Abu Hurairah","Zubayr ibn al‑Awam",
                "29 or 30 days","28 or 30 days","29 or 31 days","30 or 31 days",
                "15","24","31","25",
                "Prophet Abraham (PBUH)","Prophet David (PBUH)","Prophet Noah (PBUH)","Prophet Moses (PBUH)",
                "Prophet Moses (PBUH)","Prophet David (PBUH)","Prophet David (PBUH)","Prophet Abraham (PBUH)",
                "Prophet Abraham (PBUH)","Prophet usman (PBUH)","Prophet Hud (PBUH)","Prophet Muhammad (PBUH)",
                "Mecca,United Arab","Egypt","Afghanistan","Mecca, Arabia",
                "Pakistan","Sahrawi Republic","Medina, Arabia","Qatar",
                "From soil","From light","From Water","From Air",
                "Shaykh","Caliph","Imam","Mufti",
                "Hajj","Halal","Kosher","Jihad",
                "Abraham","Adam","Jesus","All of these",
                "Eid","Rajab","Ramadan","Muharram",
                "Algebra","Chemistry","Medicine","All of these",
                "Nigeria","Mecca","Cairo","Medina",
                "Shi’a","Kharijites","Sunni","All of these",
                "California","Michigan","New York","Texas",
                "Arabs","Russians","Turks","Mongols",
                "Holy war","Struggle","Cleanse","Gain freedom",
                "Hijrah","Persian Calendar","Gregorian Calendar","Roman Calendar",
                "587","612","622","266",
                "Kitab al‑Zuhd","Abu Hanifa","Ahmad ibn Hanbal ","Muṣʽab ibn ʽUmair",
                "Aisha","Maryam","Zainab","Farida",
                "Aisha","Maryam","Zainab","Asiya bint Muzahim",
                "Angel Gibrael","Bibi Aamna","Zainab","Asiya bint Muzahim",
                "Abu Ubaidah","Sa'd ibn Abi Waqqas","Khalid ibn al‑Walid","Amr ibn al‑As",
                "Ka'b ibn Zuhayr","Sa'd ibn Abi Waqqas","Ḥassān ibn Thābit","Imru' al‑Qais",
                "11 Companions","9 Companions","15 Companions","10 Companions",
                "Saudi Arabia","Indonesia","Somalia","Nigeria",
                "Maria al-Qibtiyya","Khadija","Maryam","Aisha",

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
                        Intent in = new Intent(getApplicationContext(),ResultHistory.class);
                        startActivity(in);
                    }
                    radio_g.clearCheck();
                }
            });
//This is a Quit button with a  click Listener that take the user to the result Activity and display the result to the user.
            quitbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),ResultHistory.class);
                    startActivity(intent);
                }
            });
        }
    //This method display a Custom toast to the user,when the user pick  Correct answer
    public  void  CorrectToast(){
        final MediaPlayer mediaPlayer  =MediaPlayer.create(this,R.raw.dingsound);
        mediaPlayer.start();
        Toast toast =new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        View custom_view=getLayoutInflater().inflate(R.layout.custom_toast,null);
        toast.setView(custom_view);
        toast.show();
    }
    //This method display a Custom toast to the user,when the user pick  wrong answer
    public  void  WrongToast(){
        Vibrator vibrator =(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(400);
        Toast wrongtoast =new Toast(getApplicationContext());
        wrongtoast.setDuration(Toast.LENGTH_LONG);
        View custom_view=getLayoutInflater().inflate(R.layout.custom_wrong,null);
        wrongtoast.setView(custom_view);
        wrongtoast.show();
    }
    }