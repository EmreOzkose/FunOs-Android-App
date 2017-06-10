package com.example.erama.myapplication.Users;

import com.example.erama.myapplication.Events.Basketball;
import com.example.erama.myapplication.Events.Event;
import com.example.erama.myapplication.Events.Football;
import com.example.erama.myapplication.Events.GeneralEvents.WingChun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by erama on 5/2/17.
 */

public class UserCollection {

    private static String currentUser;

    public static List<Event> eventList = new ArrayList<Event>();
    public static List<WingChun> wingChunList = new ArrayList<WingChun>();
    public static List<Football> FootballList = new ArrayList<Football>();
    public static List<Basketball> BasketballList = new ArrayList<Basketball>();

    private static List<User> listUsers = new ArrayList<User>();

    public static List<User> getListUsers() {
        return listUsers;
    }

    public static void setListUsers(List<User> listUser) {
        listUsers = listUser;
    }

    public static User findUser(String userName){
        for (User u : listUsers){
            if(u.getUserName().equals(userName))
                return u;
        }
        return null;
    }

    public static String getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(String currentUser) {
        UserCollection.currentUser = currentUser;
    }

    public static List<Event> getEventList() {
        return eventList;
    }

    public static void setEventList(List<Event> eventList) {
        UserCollection.eventList = eventList;
    }

    public static List<WingChun> getWingChunList() {
        return wingChunList;
    }

    public static void setWingChunList(List<WingChun> wingChunList) {
        UserCollection.wingChunList = wingChunList;
    }

    public static List<Football> getFootballList() {
        return FootballList;
    }

    public static void setFootballList(List<Football> footballList) {
        FootballList = footballList;
    }

    public static List<Basketball> getBasketballList() {
        return BasketballList;
    }

    public static void setBasketballList(List<Basketball> basketballList) {
        BasketballList = basketballList;
    }

}
