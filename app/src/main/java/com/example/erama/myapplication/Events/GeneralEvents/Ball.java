package com.example.erama.myapplication.Events.GeneralEvents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.erama.myapplication.Activities.SignIn;
import com.example.erama.myapplication.Activities.SignInActivities.SigninSelectFuns;
import com.example.erama.myapplication.R;

public class Ball extends AppCompatActivity {

    private ImageView imgBasketball;
    private ImageView imgFootball;
    private ImageView imgTennis;
    private ImageView imgAmericanFootball;
    private ImageView imgGolf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);

        init();

    }

    public void init(){
        imgBasketball = (ImageView)findViewById(R.id.imageBasketball);
        imgBasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Basketball");
                Intent intent0 = new Intent(Ball.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });

        imgFootball = (ImageView)findViewById(R.id.imageFootball);
        imgFootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Football");
                Intent intent0 = new Intent(Ball.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });

        imgTennis = (ImageView)findViewById(R.id.imageTennis);
        imgTennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Tennis");
                Intent intent0 = new Intent(Ball.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });

        imgAmericanFootball = (ImageView)findViewById(R.id.imageAmericanFootball);
        imgAmericanFootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("American Football");
                Intent intent0 = new Intent(Ball.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });

        imgGolf = (ImageView)findViewById(R.id.imageGolf);
        imgGolf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn.getSignedInUser().getListFavoriteEvents().add("Golf");
                Intent intent0 = new Intent(Ball.this, SigninSelectFuns.class);
                startActivity(intent0);
            }
        });

    }

}
