package com.example.erama.myapplication.Events;

/**
 * Created by erama on 5/2/17.
 */

public class Basketball extends Event {

    private int numberOfPlayers;

    public Basketball(String title, String date, String place){
        super(title,date,place);
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
