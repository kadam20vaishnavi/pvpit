package com.sbit.pvpitmockmhtcet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.text.LineBreaker;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView textview,facebook,instagram,linkedin,college,fedept,mechdept,admission;

    MediaPlayer music ;
    int i=0;
    ImageView volumnup,volumndown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        textview=findViewById(R.id.aboutus);
        facebook=findViewById(R.id.facebook);
        instagram=findViewById(R.id.instagram);
        linkedin=findViewById(R.id.linkedin);
        college=findViewById(R.id.college);
        fedept=findViewById(R.id.fedept);
        mechdept=findViewById(R.id.mechdept);
        admission=findViewById(R.id.admissionprocess);

        facebook.setMovementMethod(LinkMovementMethod.getInstance());
        instagram.setMovementMethod(LinkMovementMethod.getInstance());
        linkedin.setMovementMethod(LinkMovementMethod.getInstance());
        college.setMovementMethod(LinkMovementMethod.getInstance());
        fedept.setMovementMethod(LinkMovementMethod.getInstance());
        mechdept.setMovementMethod(LinkMovementMethod.getInstance());
        admission.setMovementMethod(LinkMovementMethod.getInstance());

        volumnup=findViewById(R.id.volumeup);
        volumndown=findViewById(R.id.volumedown);

        volumnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (music!= null) {
                    music.stop();
                    music.release();
                    i=0;
                    music= null;
                }
                volumnup.setVisibility(View.GONE);
                volumndown.setVisibility(View.VISIBLE);
            }
        });

        volumndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                music = MediaPlayer.create(AboutUs.this, R.raw.aboutpvpit);
                if(i==0) {
                    music.start();
                    i=1;
                    volumnup.setVisibility(View.VISIBLE);
                    volumndown.setVisibility(View.GONE);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textview.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);

        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        if(i==1){
            music.stop();
            i=0;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(i==1){
            music.stop();
            i=0;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(i==1){
            music.stop();
            i=0;
        }
    }
}