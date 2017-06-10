package com.example.erama.myapplication.Events.GeneralEvents;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erama.myapplication.Activities.SignIn;
import com.example.erama.myapplication.Activities.SignInActivities.SigninSelectFuns;
import com.example.erama.myapplication.MainActivity;
import com.example.erama.myapplication.R;

public class Fight extends AppCompatActivity {

    private ImageView imgWingChun;
    private ImageView imgKaliEskrima;
    private ImageView imgKarate;
    private ImageView imgTekvando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        init();

    }

    public void init(){
        imgWingChun = (ImageView)findViewById(R.id.imageWingChun);
        imgWingChun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Wing Chun");
                Intent intent0 = new Intent(Fight.this, SigninSelectFuns.class);
                startActivity(intent0);

            }
        });

        imgKaliEskrima = (ImageView)findViewById(R.id.imageKaliEskrima);
        imgKaliEskrima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Kali Eskrima");
                Intent intent0 = new Intent(Fight.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });

        imgKarate = (ImageView)findViewById(R.id.imageKarete);
        imgKarate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Karate");
                Intent intent0 = new Intent(Fight.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });

        imgTekvando = (ImageView)findViewById(R.id.imageTekvando);
        imgTekvando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Tekvando");
                Intent intent0 = new Intent(Fight.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });
    }

}
