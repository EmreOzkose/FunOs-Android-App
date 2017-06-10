package com.example.erama.myapplication.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erama.myapplication.Events.Event;
import com.example.erama.myapplication.Events.GeneralEvents.WingChun;
import com.example.erama.myapplication.R;

import java.util.List;

/**
 * Created by erama on 5/25/17.
 */

public class WingChunSimpleRecyclerAdapter extends RecyclerView.Adapter<WingChunSimpleRecyclerAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txt_current_person;
        public TextView txt_opponent_person;
        public ImageView img_current_person;
        public ImageView img_opponent_person;
        public CardView card_view;


        public ViewHolder(View view) {
            super(view);

            card_view = (CardView)view.findViewById(R.id.cwMy_event);
            txt_current_person = (TextView)view.findViewById(R.id.lblCurrentPerson);
            txt_opponent_person = (TextView)view.findViewById(R.id.lblOpponentPerson);
            img_current_person = (ImageView)view.findViewById(R.id.imgCurrentPerson);
            img_opponent_person = (ImageView)view.findViewById(R.id.imgOpponentPerson);

        }
    }

    List<WingChun> list_event;
    public WingChunSimpleRecyclerAdapter(List<WingChun> list_event) {

        this.list_event = list_event;
    }


    @Override
    public WingChunSimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_wing_chun, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.txt_current_person.setText(list_event.get(position).getPlayer1());
        holder.txt_opponent_person.setText(list_event.get(position).getPlayer1());

    }

    @Override
    public int getItemCount() {
        return list_event.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
