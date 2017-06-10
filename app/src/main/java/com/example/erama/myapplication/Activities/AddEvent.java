package com.example.erama.myapplication.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.example.erama.myapplication.Events.Basketball;
import com.example.erama.myapplication.Events.Football;
import com.example.erama.myapplication.Events.GeneralEvents.WingChun;
import com.example.erama.myapplication.R;
import com.example.erama.myapplication.Users.UserCollection;

import java.util.ArrayList;

public class AddEvent extends AppCompatActivity {

    private Spinner spFuns;
    private ArrayAdapter adapterFuns;
    private Button btnLetsEAddEvent;

    public void init(){

        String[] arr = new String[UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().get(i);
        }
        adapterFuns = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, arr);
        spFuns.setAdapter(adapterFuns);

        btnLetsEAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spFuns.getSelectedItem().equals("Basketball"))
                    UserCollection.findUser(UserCollection.getCurrentUser()).getListEvents().add(new Basketball("Basketball","10/10/1900","Hacettepe Üni basketbol sahası"));
                else if(spFuns.getSelectedItem().equals("Football"))
                    UserCollection.findUser(UserCollection.getCurrentUser()).getListEvents().add(new Basketball("Football","11/11/1911","Hacettepe Üni Futbol sahası"));
                else if(spFuns.getSelectedItem().toString().equals("Wing Chun"))
                    UserCollection.findUser(UserCollection.getCurrentUser()).getListEvents().add(new WingChun("Wing Chun","11/11/1911","Hacettepe Üni Futbol sahası","ahmet","yunus"));

                startActivity(new Intent(AddEvent.this, Login.class));
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        spFuns = (Spinner)findViewById(R.id.spFuns);
        btnLetsEAddEvent = (Button)findViewById(R.id.btnLetsAddEvent);

        init();

    }
}
