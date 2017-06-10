package com.example.erama.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.erama.myapplication.Activities.Login;
import com.example.erama.myapplication.Activities.SignIn;
import com.example.erama.myapplication.Events.Basketball;
import com.example.erama.myapplication.Events.Event;
import com.example.erama.myapplication.Events.Football;
import com.example.erama.myapplication.Events.GeneralEvents.WingChun;
import com.example.erama.myapplication.Users.User;
import com.example.erama.myapplication.Users.UserCollection;

import static android.R.id.message;
import static com.example.erama.myapplication.R.id.txtName;


public class MainActivity extends AppCompatActivity {

    private Button btnSıgnIn;
    private Button btnLogin;
    private EditText txtUserName;
    private EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserCollection.getListUsers().add(new User("Yunus Emre Ozkose","yun12","123","yozkose3@hotmail.com","12/12/1997","MALE"));

        UserCollection.getListUsers().get(0).getListFavoriteEvents().add("Basketball");
        UserCollection.getListUsers().get(0).getListFavoriteEvents().add("Golf");
        UserCollection.getListUsers().get(0).getListFavoriteEvents().add("Wing Chun");

        UserCollection.getEventList().add(new WingChun("WingChun1","10/10/1900","Hacettepe","yunusemre","enesfurkan"));
        UserCollection.getEventList().add(new Football("Football1","10/10/1900","Hacettepe Futbol"));
        UserCollection.getEventList().add(new WingChun("WingChun2","11/11/1900","Beytepe","ahmet","ali"));
        UserCollection.getEventList().add(new WingChun("WingChun3","04/05/1980","BBM","kerime","emin"));
        UserCollection.getEventList().add(new WingChun("WingChun4","12/03/1906","BI LAB","yılmaz","caglayan"));
        UserCollection.getEventList().add(new Basketball("Basketball1","10/10/1900","Hacettepe Basketbol"));


        Log.i("Bilgi","merhaba");



        init();

    }

    public void init(){
        txtUserName = (EditText)findViewById(R.id.txtUserName);
        txtUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    txtUserName.setText("");
            }
        });

        txtPassword = (EditText)findViewById(R.id.txtPassword);
        txtPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    txtPassword.setText("");
            }
        });

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveLoginInActivity();
            }
        });

        btnSıgnIn = (Button)findViewById(R.id.btnSıgnIn);
        btnSıgnIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveSignInActivity();
            }
        });

    }

    public void moveSignInActivity(){
        Intent i = new Intent(MainActivity.this, SignIn.class);
        startActivity(i);
    }

    public void moveLoginInActivity(){
        Boolean controlExist = false;
        for (User u : UserCollection.getListUsers()){
            if (u.getUserName().equals(txtUserName.getText().toString())) {
                controlExist = true;
                break;
            }
        }

        AlertDialog.Builder message = new AlertDialog.Builder(MainActivity.this);

        if (true){//controlExist){
            if(true){//UserCollection.findUser(txtUserName.getText().toString()).getPassword().equals(txtPassword.getText().toString())) {
                message.setMessage("Successful Login !").create();
                message.show();

                UserCollection.setCurrentUser("yun12");//txtUserName.getText().toString());

                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
            else{
                message.setMessage("Wrong password!").create();
                message.show();
            }
        }
        else{
            message.setMessage("Wrong user name!").create();
            message.show();
        }


    }

}
