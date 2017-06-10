package com.example.erama.myapplication.Activities.LoginFragments;

import android.content.Intent;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.erama.myapplication.Activities.AddEvent;
import com.example.erama.myapplication.Adapters.AllEventsSimpleRecyclerAdapter;
import com.example.erama.myapplication.Adapters.SimpleRecyclerAdapter;
import com.example.erama.myapplication.Events.Event;
import com.example.erama.myapplication.R;
import com.example.erama.myapplication.Users.UserCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by erama on 5/11/17.
 */

public class Fragment_events extends Fragment{

    private RecyclerView recycler_view;

    public void init(){

        showEvents();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login_events, container, false);

        recycler_view = (RecyclerView)rootView.findViewById(R.id.rwEvents);

        init();

        return rootView;
    }

    public void showEvents(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(Fragment_events.this.getContext());

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);


        AllEventsSimpleRecyclerAdapter adapter_items = new AllEventsSimpleRecyclerAdapter(UserCollection.getEventList());

        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());

        recycler_view.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {

            @Override
            public void onTouchEvent(RecyclerView recycler, MotionEvent event) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }

            @Override
            public boolean onInterceptTouchEvent(RecyclerView recycler, MotionEvent event) {
                return false;
            }
        });

    }

    public void showEventsLineer(){

    }

}
