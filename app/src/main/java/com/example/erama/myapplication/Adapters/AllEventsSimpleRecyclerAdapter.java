package com.example.erama.myapplication.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.erama.myapplication.Events.Basketball;
import com.example.erama.myapplication.Events.Event;
import com.example.erama.myapplication.Events.Football;
import com.example.erama.myapplication.Events.GeneralEvents.WingChun;
import com.example.erama.myapplication.R;

import java.util.List;

/**
 * Created by erama on 5/25/17.
 */

public class AllEventsSimpleRecyclerAdapter extends RecyclerView.Adapter<AllEventsSimpleRecyclerAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView lblTitle;
        public TextView lblDate;
        public TextView lblPlace;
        public ImageView img_event;
        public CardView card_view;


        public ViewHolder(View view) {
            super(view);

            card_view = (CardView)view.findViewById(R.id.cwMy_event);
            lblTitle = (TextView)view.findViewById(R.id.lblEventTitle);
            lblPlace = (TextView)view.findViewById(R.id.lblPlace);
            lblDate = (TextView) view.findViewById(R.id.lblDate);
            img_event = (ImageView)view.findViewById(R.id.imgEvent);

        }
    }

    List<Event> list_event;
    public AllEventsSimpleRecyclerAdapter(List<Event> list_event) {

        this.list_event = list_event;
    }


    @Override
    public AllEventsSimpleRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_all_events, parent, false);

        ViewHolder view_holder = new ViewHolder(v);
        return view_holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.lblTitle.setText(list_event.get(position).getTitle());
        holder.lblPlace.setText(list_event.get(position).getPlace());
        holder.lblDate.setText(list_event.get(position).getDate());
        if(list_event.get(position).getClass().getSimpleName().equals(WingChun.class.getSimpleName())){
            holder.img_event.setImageResource(R.drawable.wchun);
        }
        else if(list_event.get(position).getClass().getSimpleName().equals(Basketball.class.getSimpleName())){
            holder.img_event.setImageResource(R.drawable.basketball);
        }
        else if(list_event.get(position).getClass().getSimpleName().equals(Football.class.getSimpleName())){
            holder.img_event.setImageResource(R.drawable.foorball);
        }
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
