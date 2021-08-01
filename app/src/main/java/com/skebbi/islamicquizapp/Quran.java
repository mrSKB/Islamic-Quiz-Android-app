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
public class Quran extends AppCompatActivity {

        TextView tv;
        Button submitbutton, quitbutton;
        RadioGroup radio_g;
        RadioButton rb1,rb2,rb3,rb4;

//        List of Questions in the Quran Activity each questions will be display one after the other.
        String questions[] = {
                "How many sura are in the Holy Quran?",
                "How many verses are in the Holy Quran?",
                "How many dots are in the Holy Quran?",
                "How many over bar (zaber) are in the Holy Quran?",
                "How many under bar (zaer) are in the Holy Quran?",
                "How many Raque are in the Holy Quran?",
                "How many stop (Waqf) are in the Holy Quran?",
                "How many Thashdeed are in the Holy Quran?",
                "How many letters are in the Holy Quran?",
                "How many pash are in the Holy Quran?",
                "How many Madd are in the Holy Quran?",
                "How many words are in the Holy Quran?",
                "How many parts are in the Holy Quran?",
                "How many time Besmillah-rahmanir-rahim is repeated?",
                "How many sura start with Besmillah-rahmanir-rahim ?",
                "How many time the word Quran is repeated in the Hoy Quran?",
                "Which is the longest sura in the Holy Quran?",
                "Which is the best drink mentioned in the Holy Quran?",
                "The best eatable thing mentioned in the Holy Quran?",
                "Which is the shortest sura in Holy Quran?",
                "Which sura is called thr Heart of the  Holy Quran?",
                "Which sura is on the name of tribe of  Holy Prophet?",
                "Which many sura are Makkahi and how many are Madni?",
                "Which sura is called Musabbahat?",
                "Which sura has the number of its verses equal to the number of Masumeen?",
                "How many sura start with word 'Inna'?",
                "How many sura's name is only one letter?",
                "Which sura has the same nummber of verses as the same number of the Holy Quran?",
                "How many sura start with Al-Hamdullelah?",
                "Which sura of the Holy Quran is called the mother of Quran?",
                "How many words are in the smallest sura of the  Holy Quran?",
                "How many words are in the longest sura of the  Holy Quran?",
                "Which is the smallest animal mentioned in the  Holy Quran?",
                "Which is the biggest animal mentioned in the  Holy Quran?",
                "Which is the best month mentioned in the  Holy Quran?",
                "Which is the best Night mentioned in the  Holy Quran?",
                "Which letter used for the last time in the  Holy Quran?",
                "Which letter used for the most time in the  Holy Quran? (Bonus)",
                "The most disliked thing by Allah though Halal is?",
                "The longest verses of the Holy Quran is Which sura?",
                "In which sura the name of Allah is repeated five time?",
                "which sura are named Azaiam?",
                "which sura is on the name of the Holy War?",
                "which sura is on the name of one metal?",
                "which sura does not start with Bismellah?",
                "which sura is called 'Aroos-ul-Quran?",
                "which sura is considered as 1/3 of the Holy Quran?",
                "The name of how many sura are with out dot?",
                "in which sura Besmellah came twice?",
                "How many sura start with Initials (Mukette'at)?",
                "Which sura was revealed twice ?",
                "In which sura the back biter are condemned?",
                "In which sura the name of Allah is repeated in every verse?",
                "In which sura the letter'Fa' did not come?",
                "which sura are called Muzetain?",
                "which are the sura if their name are reversed remain the same?",
                "which is that sura if its first letter is removed become the name of the city of saudi Arab?",
                "which sura start with Word 'Tabara Kallazi?",
                "Macci sura were revealed in how many years?",
                "Madani sura were revealed in how many years?",
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
                "What is not one of the five pillars of Islam?",
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
        String answers[] = {"114","6666","1015030","93243","39586","1000","5098","19253","323671","4808","1771","77,430","30","114","113",
                "70","suratul Al-Baqarah","Milk","Honey","Qausar","Yaseen","Quresh","Macci 86,Madni 28",
                "Esra,Hadeed,Hsar,juma,Taghabun & Aala","saf,14 verses","4 sura,Fatha,Nuh,Qadr,Qausar",
                "3 sura-Qaf,sad & Noon","Taqveer,114 verses","5,Hamd,Inaam,Kahf,saba & Fatr","suratul Hamd","42","25500",
                "Mosquito","Elephant","Ramzan","Night of Qadar","Zaa","Alaph","Divorce",
                "suratul Al-Baqarah No.282","suratul al-Haj","suratul Sajdah,Fusselat,Najum & Alaq","suratul Ahzaab","suratul Hadeed",
                "suratul Tauba","suratul Rehman","suratul Tauheed","suratul Hamd,Raad,Toor,Room,Masad","suratul Naml","29 sura",
                "suratul Hamd","suratul Humzah","suratul Mujadala","suratul Hamd","Falk and Nas","suratul Lael & Tabbat","suratul sajdah",
                "suratul Mulk & Furkan","13 years","10 years","suratul Adiat","37","suratul Tauheed",
                "suratul Dahr","suratul Qauser","suratul Hijr V-26","suratul Nesa","suratul Nesa","suratul Room","suratul Taha","suratul Nesa","suratul Infall","suratul Hadeed","Give alms to the poor","Imam","Halal","All of these","Ramadan",
                "Medicine","Mecca","All of these","California","Turks","Struggle","622"};

    //        This is the list of options on every question for each questions at String question above
        String opt[] = {
                "531","114","116","122",
                "9821","6664","116","6666",
                "1015030","1005030","1015130","66966",
                "193243","1093243","15130","93243",
                "139326","395861","39586","93243",
                "1000","1021","31002","91000",
                "1567","1545","5000","5098",
                "19253","1875","5112","50909",
                "19200","1343471","323671","5323671",
                "4808","4801","3239","531123",
                "4821","4801","31771","1771",
                "48,212","76212","77,430","17,171",
                "41","60","30","171",
                "411","612","309","114",
                "311","712","319","113",
                "31","70","39","13",
                "suratul Al-Mumenoon","suratul Al-Maeda","suratul Al-E-imran","suratul Al-Baqarah",
                "Water","Milk","Rain water","Honey",
                "Water","Milk","Rain water","Honey",
                "An-Nas","Al-Lkhlas","Qausar","Al-Maun",
                "Al-Baqarah","Al-Lkhlas","Yaseen","Al-Maun",
                "Al-Baqarah","Al-Lkhlas","Yaseen","Quresh",
                "Macci 86","Macci 86,Madni 28","Macci 16,Madni 48","Macci 6,Madni 28",
                "Esra,Hadeed,Hsar,juma,","Hadeed,Taghabun & Aala","juma,Taghabun & Aala","Esra,Hadeed,Hsar,juma,Taghabun & Aala",
                "saf,18 verses","Al-Lkhlas","Yaseen,523 verses","saf,14 verses",
                "2 sura,Fatha,Nuh","3 sura,Fatha,Nuh,Qadr","4 sura,Fatha,Nuh,Qadr,Qausar","3 sura,Nuh,Qadr,Qausar",
                "1 sura,Fatha","2 sura-Qaf,sad","3 sura,Fatha,Nuh,Qausar","3 sura-Qaf,sad & Noon",
                "Taqveer,114 verses","Al-Baqarah,144 verses","Al-Baqarah","Taqveer,116 verses",
                "Inaam only","3 sura,Hamd,Inaam & Fatr","Al-Baqarah","5,Hamd,Inaam,Kahf,saba & Fatr",
                "suratul Inaam only","suratul Hamd","suratul Al-Baqarah","suratul Kahf,saba & Fatr",
                "49","51","19","42",
                "4121","5864","25500","4212",
                "Bee","Ant","Rat","Mosquito",
                "Ram","Lion","Elephant","Mosquito",
                "january","Ramzam","December","Ramzan",
                "Night of Qadar","Night of the new year","All","the Night of Ramzan",
                "Al-Hamdullelah","Zaa","inna","Non",
                "Alaph","Alaph","Alaph","Alaph",
                "Fight","Divorce","lying","Non",
                "suratul Al-Baqarah No.121","suratul Al-Baqarah No.28","suratul Al-Baqarah No.212","suratul Al-Baqarah No.282",
                "suratul al-Haj","suratul Noon","suratul Al-Baqarah","Non",
                "suratul al-Haj","suratul Noon","suratul Al-Baqarah","suratul Sajdah,Fusselat,Najum & Alaq",
                "suratul Ahzaab","suratul Noon","suratul Al-Baqarah","suratul Fusselat",
                "suratul Ahzaab","suratul Sajdah","suratul Alaq","suratul Hadeed",
                "suratul Nas","suratul Tauba","suratul Qaf","suratul Hadeed",
                "suratul Najum","suratul Fusselat","suratul Qaf","suratul Rehman",
                "suratul An-Nisa","suratul Fusselat","suratul Tauheed","suratul Rehman",
                "suratul An-Nisa","suratul Fusselat","suratul Hamd,Raad,Toor only","suratul Hamd,Raad,Toor,Room,Masad",
                "suratul Al-Tawba","suratul Al-Araf","suratul Naml","suratul Masad",
                "20 sura","23 sura","39 sura","29 sura",
                "suratul Hamd","suratul Noon","suratul Al-Baqarah","Non",
                "suratul al-Haj","suratul Tauba","suratul Humzah","Non",
                "suratul Fusselat","suratul Mujadala","suratul Humzah","Non",
                "suratul Fusselat","suratul Hadeed","suratul Humzah","suratul Hamd",
                "sura Fusselat","Hadeed and Nas","Humzah and Tauba","Falk and Nas",
                "suratul Fusselat & Furkan","suratul Lael & Tabbat","suratul Humzah and Tauba","suratul Falk and Nas",
                "suratul An-Nisa","suratul sajdah","suratul Tauheed","suratul Rehman",
                "suratul Hamd","suratul sajdah","suratul Tauheed","suratul Mulk & Furkan",
                "11 years","3 years","16 years","13 years",
                "11 years","10 years","16 years","13 years",
                "suratul Hamd","suratul Noon","suratul Al-Baqarah","suratul Adiat",
                "71","13","31","37",
                "suratul Hamd","suratul Tauheed","suratul Al-Baqarah","suratul Adiat",
                "suratul Hamd","suratul Tauheed","suratul Al-Baqarah","suratul Dahr",
                "suratul Qauser","suratul Tauba","suratul Al-Baqarah","suratul Dahr",
                "suratul Qauser-V31","suratul Tauba-V12","suratul Al-Baqarah-V23","suratul Hijr V-26",
                "suratul Fusselat","suratul Hadeed","suratul Nesa","suratul Hamd",
                "suratul Nesa","suratul Hadeed","suratul Hamd","suratul Hamd",
                "suratul Nesa","suratul Hadeed","suratul Hamd","suratul Room",
                "suratul An-Nisa","suratul Taha","suratul Adiat","Non",
                "suratul An-Nisa","suratul Nesa","suratul Adiat","Non",
                "suratul Infall","suratul Nesa","suratul Qauser","Non",
                "suratul Dahr","suratul Nesa","suratul Hadeed","suratul Hadeed",
                "Pray five times daily","Profess Allah as the only God","Make a pilgrimage to Mecca","Give alms to the poor",
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
                        Intent in = new Intent(getApplicationContext(),ResultQ.class);
                        startActivity(in);
                    }
                    radio_g.clearCheck();
                }
            });
//This is a Quit button with a  click Listener that take the user to the result Activity and display the result to the user.
            quitbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(getApplicationContext(),ResultQ.class);
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