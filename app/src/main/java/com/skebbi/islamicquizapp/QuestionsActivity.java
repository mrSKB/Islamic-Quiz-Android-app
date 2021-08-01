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
public class QuestionsActivity extends AppCompatActivity {
                TextView tv;
                Button submitbutton, quitbutton;
                RadioGroup radio_g;
                RadioButton rb1,rb2,rb3,rb4;
        //        List of Questions in the All in one Question Activity each questions will be display one after the other.
                String questions[] = {
                        "In Islam, the supreme central focus and authority is?",
                        "What is the Arabic word for “book”?",
                        "How many names does Allah have?",
                        "what is the arabic word for prophet?",
                        "When do Muslims observe fasting (Sawm) for a month?",
                        "Where was the Holy Prophet Muhammad PBUH born?",
                        "Which surah ends with the name of two prophets?",
                        "How many times does a Muslim offer Obligatory Prayers (Salaah) in a day?",
                        "Which direction do Muslims face while offering prayers (Salaah)?",
                        "Which one of the Pillars is considered as the most important Pillar",
                        "Is it permitted to drink water while Fasting (Sawm)?",
                        "What does the religion of Islam preach?",
                        "What are the names of the two Angels that question the people in the grave?",
                        "Which prophet was born miraculously without the intervention of a man?",
                        "Which prophet has been mentioned in the Quran as a friend of Allah?",
                        "Who is the last Messenger of Allah?",
                        "What is the best day of the week, and the best month of the year??",
                        "What is the most populous Muslim country in the world?",
                        "The word “Islam” means?",
                        "What is the Shari’ah?",
                        "What is not one of the five pillars of Islam?",
                        "Whic sura is related to Hazrat Ali?",
                        "How many sura are in the 30th Chapter?",
                        "Which sura every verse end with with letter 'Dai'?",
                        "Which sura is revealed in respect of Ahllelbayet?",
                        "Which sura every verse end with letter 'Ra'?",
                        "In Which sura the creation of Human  being is mentioned?",
                        "In Which sura the regulations of prisoner of war is mentioned?",
                        "Which sura is having the laws about marriage?",
                        "Which sura if its name is reversed becomes the name of a bird?",
                        "In Which sura the story of the worship of cow of Bani Esra'iel is mentioned?",
                        "In Which sura the law of inheritance is mentioned?",
                        "In Which sura the Hegira of the Holy Prophet is mentioned?",
                        "In Which sura the 27 Attributes of Allah mentioned?",
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
                        "The migration of Muhammad(SAW) and his followers to Medina, called the hijrah,Took place in which year?",
                };
        //        This is the list of answer for each questions at String question above
                String answers[] = {"Allah","Kitab","99 names","nabiin","During the month of Ramadhan","Makkah (Saudi Arabia)","sura Yusuf"
                        ,"Five times","Kaaba (Makkah)","Belief (Shahadah)","No, it is not permitted to eat or drink anything while fasting",
                "Islam preaches the oneness of God, and that there is no God except Allah","Munkar and Nakir","Prophet Jesus (PBUH) son of Mary",
                "Prophet Abraham (PBUH)","Prophet Muhammad (PBUH)"
                        ,"Friday and Ramadan","Indonesia","Surrender to God","A form of Muslim law","Give alms to the poor","sura Adiat","37","sura Tauheed",
                        "sura Dahr","Qauser","sura Hijr V-26","sura Nesa","sura Nesa","sura Room","sura Taha","sura Nesa","sura Infall","sura Hadeed"
                        ,"Imam","Halal","All of these","Ramadan","Medicine","Mecca","All of these"
                        ,"California","Turks","Struggle","622"};
        //        This is the list of options on every question for each questions at String question above
                String opt[] = {
                        "Caliph","Allah","Muhammad","Imam",
                        "Khallas","Hala","Kitab","shukran",
                        "100 names","97 names","99 names","91 names",
                        "mushkil","sabaaH alkhayr","äafwan","nabiin",
                        "During the month of Rajjab","During the month of Ramadhan","During the month of Dul-Hijjah","During the month of Sha’ban",
                        "Baitul Muqaddas (Al-Aqsa Mosque Palestine)","Karbala (Iraq)","Dubai (UAE)","Makkah (Saudi Arabia)",
                        "Al-Fatiha (surah)","An-Nisa (surah)","Al-Baqarah (surah)","sura Yusuf",
                        "Four times","Six times","Five times","Eight times",
                        "Baitul Muqaddas (Al-Aqsa Mosque Palestine)","The Al-Fateh Mosque (Bahrain)","Kaaba (Makkah)","Sheikh Zayed Grand Mosque (Abu Dhabi)",
                        "Prayers (Salaah)","Fasting (Sawm)","Pilgrimage (Hajj)","Belief (Shahadah)",
                        "It is permitted to drink little water while fasting","It is permitted to eat dates while fasting","No, it is not permitted to eat or drink anything while fasting","It is permitted to drink juice while fasting",
                        "Islam preaches Idolatry","Islam preaches that there are many Gods","Islam preaches the oneness of God, and that there is no God except Allah","Jibrael and Mikael",
                        "Munkar and Nakir","Israfil and Mika'il","Islam does not preach anything","Israfil, and Azrael",
                        "Prophet Abraham","Prophet Moses","Prophet Noah","Prophet Jesus (PBUH) son of Mary",
                        "Prophet Abraham (PBUH)","Prophet Jesus (PBUH)","Prophet Noah","Prophet Moses (PBUH)",
                        "Prophet Jesus (PBUH)","Prophet Noah","Prophet Jesus (PBUH)","Prophet Muhammad (PBUH)",
                        "Monday and Dhu al-Hijjah","Friday and Ramadan","Tuesday and Muharram","Friday and Sha'aban",
                        "Saudi Arabia","Indonesia","Pakistan","Nigeria",
                        "Those who follow Muhammad","Surrender to God","Recitations","Sons of Allah  ",
                        "A religious school","A native dance","A style of calligraphy","A form of Muslim law",
                        "Pray five times daily","Profess Allah as the only God","Make a pilgrimage to Mecca","Give alms to the poor",
                        "sura Hamd","sura Noon","sura Al-Baqarah","sura Adiat",
                        "71","13","31","37",
                        "sura Hamd","sura Tauheed","sura Al-Baqarah","sura Adiat",
                        "sura Hamd","sura Tauheed","sura Al-Baqarah","sura Dahr",
                        "sura Qauser","sura Tauba","sura Al-Baqarah","sura Dahr",
                        "sura Qauser-V31","sura Tauba-V12","sura Al-Baqarah-V23","sura Hijr V-26",
                        "sura Fusselat","sura Hadeed","sura Nesa","sura Hamd",
                        "sura Nesa","sura Hadeed","sura Hamd","sura Hamd",
                        "sura Nesa","sura Hadeed","sura Hamd","sura Room",
                        "sura An-Nisa","sura Taha","sura Adiat","Non",
                        "sura An-Nisa","sura Nesa","sura Adiat","Non",
                        "sura Infall","sura Nesa","sura Qauser","Non",
                        "sura Dahr","sura Nesa","sura Hadeed","sura Hadeed",
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
                        "587","612","622","266",

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
                        //This is an IF STATEMENT that the check if the user a enter a name if the user enter a name it will be display in the Layout if the user has not enter a name it will display Assalamu'aliku.
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
           //     Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();


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
                                                Intent in = new Intent(getApplicationContext(),ResultActivity.class);
                                                startActivity(in);
                                        }
                                        radio_g.clearCheck();
                                }
                        });
//This is a Quit button with a  click Listener that take the user to the result Activity and display the result to the user.
                        quitbutton.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                        Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
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