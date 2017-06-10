package com.example.erama.myapplication.Events.GeneralEvents;

import com.example.erama.myapplication.Events.Event;

/**
 * Created by erama on 5/25/17.
 */

public class WingChun extends Event{

    public String player1;
    public String player2;

    public WingChun(String title, String date, String place, String player1, String player2){
        super(title, date, place);
        this.player1 = player1;
        this.player2 = player2;
    }

    //getter and setter methods
    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }


}
