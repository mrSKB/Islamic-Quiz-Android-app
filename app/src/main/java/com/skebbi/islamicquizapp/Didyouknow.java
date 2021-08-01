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
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

/**
 * Created by Muhammad Abdulrahman Sarkin Kebbi  on 23-07-2021.
 */
public class Didyouknow extends AppCompatActivity {
        TextView tv;
        Button btnNext, quitbutton;
          Uri urinotification;
        String questions[] = {
                "Islam is the 2nd largest religion in the world, with 1.6 billion people declaring their faith in Muhammad and Allah.",
                "the name “Muhammad” is the most common name in the world...",
                "The Quran will complain of people who didn’t recite it on Judgment Day",
                "The Quran will intercede for people who recited it on Judgment Day",
                "Ramadan is the Spring of the Holy Quran",
                "Reading 1 verse in Ramadan is equal to reading the entire Quran in other months",
                "Whoever reads one letter of the Quran gets 10 Rewards.Surat Al-Ikhlas is considered 1/3 of the Quran",
                "Surat Al Nissa speaks about laws of marriage",
                "Surat Al-Dahr was revealed in respect to Ahlul Bayt (P)",
                "Quran was revealed over 23 years: 13 in Mecca and 10 in Madina!",
                "The best month is Ramadan while,The best night is the Night of Power in Ramadan (Laylat al Qadr)",
                "Milk is the best drink mentioned in the Quran while, Honey is the best food mentioned in the Quran",
                "Al-Baqarah is the longest surah in the Quran while Al-Kawthar is the shortest surah in the Quran",
                "Bismillah Al-Rahman Al-Raheem is repeated 114 times in the Quran.",
                "The Holy Quran has 114 surahs",
                "Islam and Islamic law have consistently condemned terrorism",
                "'Islam' means 'submission', implying surrendering to God's will",
                "Muslims only worship Allah. They do not pray to Prophet Muhammad(SWA).",
                "English translations of the Quran head the American best-seller list...",
                "'Muslim' actually means 'anyone or anything that surrenders itself to the will of God.'",
                "Algebra, from the Arabic word al-jabr, originated in the Islamic world.",
                "Daughters are actually considered a blessing in the Islamic faith",
                "The Quran actually makes mention of Jesus in several verses",
                "Most Muslims are not Arabs",
                "Both alcohol and pork are forbidden in Islam.",
                "Sunnis make up 87%–90% of the worldwide Muslim population. Shiite Muslims make up about 10%.",
                "There are 25 countries in which more than 95% of the population is Muslim.",
                "Islamic advances in the use of paper are the primary reason we read books rather than scrolls today.",
                "Arabic numerals, the numbers the Western world uses today, were developed by the Muslims.",
                "Quran (Koran) means “recitation” in Arabic.",
                "Mecca actually means 'the place of the drinking cup'",
                "Muslims were the first to mass-produce paper on an intercontinental scale",
                "The Holy Qur'an has no flaws or contradictions. The original Arabic scriptures have never been changed or tampered with.",
                "During the Islamic Golden Age, scientists and inventors made some great innovations. Because of this, scientists were paid as much as pro athletes make today.",
                "Allah has 99 names, with each one having a different meaning.",
                "Indonesia has the most Muslims in one country, followed by Pakistan, India and Bangladesh.",
                "Allah is the Arabic word for God. In Arabic, the pronoun used to refer to Allah doesn’t imply any gender",
                "Prophet Muhammad (SWA) is known as the father of the religion.",
                "Islam is a complete way of life that governs all facets of life:moral, spiritual, social, political, economical, intellectual, etc.\n",
                "Prophet Muhammad (SWA) married his 40-year-old wife when he was 25 years old.",
                "Interestingly, the inside of the Kaaba is empty.",
                "Islam is not a race, it is a religion.",
                "Mary, Jesus’ mom, is mentioned more often in the Qur’an than in the New Testament. She’s also the only woman mentioned by name in the Qur’an.",
                "15% of all Muslims are Arab.",
                "Zaid bin Harith (RA) accompanied Rasulullah (SAW) when he went Taif",
                "Some verses in the Koran refer to man being equal to woman. Mathematically, the number of times the word appears in the Koran is 24. The number of times the word woman appears in the Koran is also 24.",
                "The roof top of our Prophet's (SalAllahu alayhi wasalam) masjid in Madina is designed to be strong enough to carry addtional floors in the future.",
                "It was only in 1932 the Kiswah (cloth of the Ka'bah) was wholly made by Saudis (citizens of Saudi Arabia).",
                "Early Oxbridge students studied books written by muslims on mathematics, medicine, chemistry, optics and astronomy.",
                "Albania is the only European country whose population is over 90% Muslim. It is on the Adriatic Sea, and borders Greece and Yugoslavia...",
                "At least one of Prophet Muhammad’s wives was African. Her name was Maria the Copt. Two of the Prophet’s wives were Jewish...their names were Raihanah and Safiyah...",
                "Prominent Kuffar like Abu Jahl would secretly listen to the verses of the Holy Quran because they were fascinated by it.",
                "Muslims do not worship the Kaaba; the Kaaba is simply a focal point for prayer ordered by Allah Subhanaho Wa Taala..",
                "According to the Qur'an, the Kaaba was first built by the Ibrahim Alaihi Salaam and and his son Ismail Alaihi Salaam.",
                "It is obligatory on every Muslim to love Rasulullah (Sallallaahu Alaihi wasallam). The sign of love for him is to adapt his way of life and always remember him.",
                "The Ummah of Sayyiduna Rasulullah (sallal laahu alaihi wasallam), are more than that of all the Ummahs of all the other Ambiya put together.",
                "The Majority of muslims do not live in the middle East. The most populous muslim country is Indonesia, the 4th largest country in the world with approximately 184 million muslims",
                "Adam Alayhis salam was approximately 30 Ziraa tall. Ziraa is a measurement and one Ziraa is approximately half a metre.",
                "The first Hafiz of Quran was Uthman bin Affan (RA, offcourse after RasoolAllah Sallallahu Alaihi Wa Sallam.",
                "Prophet Muhammad (SWA)' father's name was ABDULLAH and his mother's name was AAMINAH.",
                "Original name of the holy city of Madinah was \"YATHRIB\"",
                "Abdullah Ibn Masood RA. was the first Muslim to read the Quran publicly near the Kaaba in Makkah, after the Prophet Muhammad (SWA).",
                "All of Prophet Muhammad (SAW)'s children died before him except for his daughter, Fatimah (RA).",
                "Abu Ayyub Al-Ansari (RA) was blessed by Allah to be the first host of Rasulullah (SAW) in Madeenah.",
                "Zaid RadiAllahu Anhu is the only Sahabi whose name is mentioned in the Quran (Surah Ahzaab)",
                "During WWII, the Grand Mosque of Paris gave the Jews Muslim IDs to help hide them from the Nazis.",
                "Islam and Islamic law have consistently condemned terrorism",
                "'Islam' means 'submission', implying surrendering to God's will",
                "Muslims only worship Allah. They do not pray to Prophet Muhammad.",
                "English translations of the Quran head the American best-seller list...",
                "'Muslim' actually means 'anyone or anything that surrenders itself to the will of God.'",
                "Algebra, from the Arabic word al-jabr, originated in the Islamic world.",
                "Daughters are actually considered a blessing in the Islamic faith",
                "The Quran actually makes mention of Jesus in several verses",
                "Most Muslims are not Arabs",
                "Both alcohol and pork are forbidden in Islam.",
                "Sunnis make up 87%–90% of the worldwide Muslim population. Shiite Muslims make up about 10%.",
                "There are 25 countries in which more than 95% of the population is Muslim.",
                "Islamic advances in the use of paper are the primary reason we read books rather than scrolls today.",
                "Arabic numerals, the numbers the Western world uses today, were developed by the Muslims.",
                "Quran (Koran) means “recitation” in Arabic.",
                "Mecca actually means 'the place of the drinking cup'",
                "Muslims were the first to mass-produce paper on an intercontinental scale",

        };
        int flag=0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_didyouknow);

            final TextView score = (TextView)findViewById(R.id.textView4);
            TextView textView=(TextView)findViewById(R.id.DispName);
            Intent intent = getIntent();
            String name= intent.getStringExtra("myname");

            if (name.trim().equals(""))
                textView.setText("Assalamu'aliku");
            else
                textView.setText("Slm " + name);

            btnNext=(Button)findViewById(R.id.button3);
            quitbutton=(Button)findViewById(R.id.buttonquit);
            tv=(TextView) findViewById(R.id.tvque);

            int rando =(int) (Math.random());
            tv.setText(questions[flag]);
            flag++;


            btnNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //int color = mBackgroundColor.getColor();
                    //mLayout.setBackgroundColor(color);
                    int rando =(int) (Math.random());
                    tv.setText(questions[flag]);
                    flag++;
                    if(flag<questions.length)
                    {
                        tv.setText(questions[flag]);

                    }
                    else
                    {

                        Intent in = new Intent(getApplicationContext(),Screen.class);
                        startActivity(in);
                    }

                }
            });
                    String questionst = questions.toString();
                    flag++;



            quitbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addNotification();
                    Intent intent=new Intent(getApplicationContext(),Screen.class);
                    startActivity(intent);
                }
            });
        }
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
                        .setContentTitle("Try The Hadith Question")
                        .setSound(urinotification)
                        .setContentText("With Over 2000 Questions To Answer.");

        Intent notificationIntent = new Intent(this, Hadith.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}



