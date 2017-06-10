package com.example.erama.myapplication.Activities.SignInActivities;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erama.myapplication.Activities.SignIn;
import com.example.erama.myapplication.Events.GeneralEvents.Ball;
import com.example.erama.myapplication.Events.GeneralEvents.Fight;
import com.example.erama.myapplication.MainActivity;
import com.example.erama.myapplication.R;
import com.example.erama.myapplication.Users.UserCollection;

import java.util.ArrayList;

public class SigninSelectFuns extends AppCompatActivity {

    private static ArrayList<String> selectedFuns;
    private Button btnFun;

    private static TextView lblFirst;
    private static TextView lblSecond;
    private static TextView lblThird;
    private ImageView imgFight;
    private ImageView imgBall;

    public void init(){

        lblFirst = (TextView)findViewById(R.id.lblFirst);
        lblSecond = (TextView)findViewById(R.id.lblSecond);
        lblThird = (TextView)findViewById(R.id.lblThird);

        if(SignIn.getSignedInUser().getListFavoriteEvents().size() == 3) {
            lblFirst.setText(SignIn.getSignedInUser().getListFavoriteEvents().get(0));
            lblSecond.setText(SignIn.getSignedInUser().getListFavoriteEvents().get(1));
            lblThird.setText(SignIn.getSignedInUser().getListFavoriteEvents().get(2));
        }
        else if(SignIn.getSignedInUser().getListFavoriteEvents().size() == 2){
            lblFirst.setText(SignIn.getSignedInUser().getListFavoriteEvents().get(0));
            lblSecond.setText(SignIn.getSignedInUser().getListFavoriteEvents().get(1));
        }
        else if (SignIn.getSignedInUser().getListFavoriteEvents().size() == 1){
            lblFirst.setText(SignIn.getSignedInUser().getListFavoriteEvents().get(0));
        }

        btnFun = (Button)findViewById(R.id.btnFun);
        btnFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                UserCollection.getListUsers().add(SignIn.getSignedInUser());
                SignIn.setSignedInUser(null);

                AlertDialog.Builder message = new AlertDialog.Builder(SigninSelectFuns.this);
                message.setMessage("Have Fun !").create();
                message.show();

                Intent intent0 = new Intent(SigninSelectFuns.this, MainActivity.class);
                startActivity(intent0);

            }
        });

        imgFight = (ImageView)findViewById(R.id.imageFight);
        imgFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SigninSelectFuns.this, Fight.class);
                startActivity(intent1);
            }
        });

        imgBall= (ImageView)findViewById(R.id.imageBall);
        imgBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SigninSelectFuns.this, Ball.class);
                startActivity(intent2);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_select_funs);

        init();
    }

    public static TextView getLblFirst() {
        return lblFirst;
    }

    public static TextView getLblSecond() {
        return lblSecond;
    }

    public static TextView getLblThird() {
        return lblThird;
    }

    public static void setLblFirst(TextView lblFirst) {
        SigninSelectFuns.lblFirst = lblFirst;
    }

    public static void setLblSecond(String lblSecond) {
        SigninSelectFuns.lblSecond.setText(lblSecond);
    }

    public static void setLblThird(String lblThird) {
        SigninSelectFuns.lblThird.setText(lblThird);
    }

    public static ArrayList<String> getSelectedFuns() {
        return selectedFuns;
    }
}
