package com.example.erama.myapplication.Activities.LoginFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.erama.myapplication.Activities.AddEvent;
import com.example.erama.myapplication.Events.Event;
import com.example.erama.myapplication.R;
import com.example.erama.myapplication.Users.UserCollection;

/**
 * Created by erama on 5/11/17.
 */

public class Fragment_my_events extends Fragment{

    private View rootView;
    private LinearLayout llEvents;

    public void init(){
        showEvents();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_login_my_events, container, false);

        llEvents = (LinearLayout)rootView.findViewById(R.id.llEvents);

        init();



        return rootView;
    }

    public void showEvents(){

        for (int i = 1; i < 10; i++) {
            Button btnTag = new Button(Fragment_my_events.this.getContext());
            btnTag.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            btnTag.setText("Button " + i);
            int givenID = 3000 + i;
            btnTag.setId(givenID);
            llEvents.addView(btnTag);
        }


        for(Event e : UserCollection.findUser(UserCollection.getCurrentUser()).getListEvents()){


        }

    }
}
