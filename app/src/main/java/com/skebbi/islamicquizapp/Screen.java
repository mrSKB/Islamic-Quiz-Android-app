package com.skebbi.islamicquizapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.google.android.material.card.MaterialCardView;

/**
 * Created by Muhammad Abdulrahman Sarkin Kebbi  on 23-07-2021.
 */
public class
Screen extends AppCompatActivity {
    Animation topAnim,bottonAnim;
    Uri urinotification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        Button  Allinonequestions1=(Button)findViewById(R.id.Home1);
        Button Quran=(Button)findViewById(R.id.Quran);
        Button Hadith1=(Button)findViewById(R.id.Hadith1);
        Button History1=(Button)findViewById(R.id.History1);
        Button didyouknow1=(Button)findViewById(R.id.did1);
        Button ContactUs1=(Button)findViewById(R.id.ContactUs1);



        ImageView  Allinonequestions= (ImageView) findViewById(R.id.Home);
        ImageView Quran1= (ImageView) findViewById(R.id.Quran1);
        ImageView Hadith= (ImageView) findViewById(R.id.Hadith);
        ImageView History= (ImageView) findViewById(R.id.History);
        ImageView didyouknow= (ImageView) findViewById(R.id.did);
        ImageView ContactUs= (ImageView) findViewById(R.id.ContactUs);


        topAnim = AnimationUtils.loadAnimation(this, R.anim.botton_animation);
        bottonAnim = AnimationUtils.loadAnimation(this,R.anim.botton_animation);

        final EditText nametext=(EditText)findViewById(R.id.editName);
        nametext.setAnimation(bottonAnim);


//This is a restart button with a  click Listener that take the user back to the main Dashboard so the user can start a new Quiz.
        didyouknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Didyouknow.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        didyouknow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Didyouknow.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        ContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Developer.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        ContactUs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotification();
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Developer.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });


        Allinonequestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        Allinonequestions1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });




        Quran1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Quran.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        Quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Quran.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });


        Hadith1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Hadith.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        Hadith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Hadith.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });





        History1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),History.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });


        History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),History.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });}
        private void addNotification() {
            try {
                urinotification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), urinotification);
                r.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
            NotificationCompat.Builder builder =
                    new NotificationCompat.Builder(this)
                            .setSmallIcon(R.drawable.daco)
                            .setContentTitle("Contact Our Developers Team ")
                            .setSound(urinotification)
                            .setContentText("Developed By Devub Team,Abuja Nigeria +2349065211228.");

            Intent notificationIntent = new Intent(this, Developer.class);
            PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                    PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(contentIntent);

            // Add as notification
            NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            manager.notify(0, builder.build());
    }


}

