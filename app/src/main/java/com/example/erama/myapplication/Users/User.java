package com.example.erama.myapplication.Users;

import com.example.erama.myapplication.Events.Event;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static android.R.id.list;

/**
 * Created by erama on 4/30/17.
 */

public class User {
    private String name;
    private String userName;
    private String password;
    private String email;
    private int userID;
    private Date birthDay;
    private Date lastLogin;
    private static int settingUserID = 0;
    private ArrayList<String> ListFriend;
    private int level;
    private int favoriteEventSize;
    private ArrayList<String> ListFavoriteEvents;
    private ArrayList<Event> ListEvents;

    public enum Gender{MALE, FEMALE};
    private Gender userGender;

    public User(String name, String userName, String password, String email, String birthDay ,String gender){
        this.setName(name);
        this.setUserName(userName);
        this.setUserID(getSettingUserID());
        this.setEmail(email);
        this.setPassword(password);
        this.userGender = stringToGender(gender);
        setSettingUserID(getSettingUserID()+1);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setBirthDay(df.parse(birthDay));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        setListFriend(new ArrayList<String>());
        this.favoriteEventSize = 3;
        setListFavoriteEvents(new ArrayList<String>());
        this.setListEvents(new ArrayList<Event>());
    }

    public void addEvent(String eventName){
        if (getListFavoriteEvents().size() <= favoriteEventSize){
            //process
        }
        else{
            System.out.println("more event you must do! level is too easy!");
        }
    }

    public Gender stringToGender(String gender){
        if (gender.equals("FEMALE"))
            return Gender.FEMALE;
        else
            return Gender.MALE;

    }

    //getter and setter methods
    public ArrayList<Event> getListEvents() {
        return ListEvents;
    }

    public void setListEvents(ArrayList<Event> listEvents) {
        ListEvents = listEvents;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Gender getUserGender() {
        return userGender;
    }

    public void setUserGender(Gender userGender) {
        this.userGender = userGender;
    }

    public static int getSettingUserID() {
        return settingUserID;
    }

    public static void setSettingUserID(int settingUserID) {
        User.settingUserID = settingUserID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getListFriend() {
        return ListFriend;
    }

    public void setListFriend(ArrayList<String> listFriend) {
        this.ListFriend = listFriend;
    }

    public ArrayList<String> getListFavoriteEvents() {
        return ListFavoriteEvents;
    }

    public void setListFavoriteEvents(ArrayList<String> listFavoriteEvents){this.ListFavoriteEvents = listFavoriteEvents;}
}