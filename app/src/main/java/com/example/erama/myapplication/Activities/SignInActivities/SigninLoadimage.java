package com.example.erama.myapplication.Activities.SignInActivities;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.erama.myapplication.Activities.SignIn;
import com.example.erama.myapplication.MainActivity;
import com.example.erama.myapplication.R;

import static com.example.erama.myapplication.R.id.btnFun;

public class SigninLoadimage extends AppCompatActivity {

    private Button btnNext2;

    public void init(){
        btnNext2 = (Button)findViewById(R.id.btnNext2);
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SignIn.getSignedInUser().getProfileImage().setImageResource(R.drawable.person);

                Intent i = new Intent(SigninLoadimage.this, SigninSelectFuns.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin_loadimage);

        init();

    }
}
