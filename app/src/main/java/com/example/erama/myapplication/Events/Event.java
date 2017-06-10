package com.example.erama.myapplication.Events;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by erama on 4/30/17.
 */

public class Event {

    private String title;
    private String date;
    private String place;

    public Event(String title, String date, String place){
        this.title = title;
        this.place = place;
        this.date = date;

    }

    //Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
