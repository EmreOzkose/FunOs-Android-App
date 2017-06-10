package com.example.erama.myapplication.Activities.LoginFragments;

import android.app.AlertDialog;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.erama.myapplication.Activities.Login;
import com.example.erama.myapplication.Activities.SignInActivities.SigninSelectFuns;
import com.example.erama.myapplication.MainActivity;
import com.example.erama.myapplication.R;
import com.example.erama.myapplication.Users.UserCollection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import static com.example.erama.myapplication.R.id.container;
import static com.example.erama.myapplication.R.id.gridLayout;

/**
 * Created by erama on 5/11/17.
 */

public class Fragment_profile extends Fragment{

    private TextView lblName;
    private TextView lblUserName;
    private TextView lblBirthDay;
    private TextView lblEmail;
    private TextView lblGender;
    private GridLayout grdProfileFuns;
    public DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public void init(){
        lblName.setText(UserCollection.findUser(UserCollection.getCurrentUser()).getName());
        lblUserName.setText(UserCollection.findUser(UserCollection.getCurrentUser()).getUserName());
        //lblBirthDay.setText(df.format(UserCollection.findUser(UserCollection.getCurrentUser()).getBirthDay()));
        lblEmail.setText(UserCollection.findUser(UserCollection.getCurrentUser()).getEmail());
        lblGender.setText(UserCollection.findUser(UserCollection.getCurrentUser()).getUserGender().toString());

        int total = UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().size();
        int column = 5;
        int row = total / column;
        grdProfileFuns.setColumnCount(column);
        grdProfileFuns.setRowCount(row + 1);
        for(int i =0, c = 0, r = 0; i < total; i++, c++)
        {
            if(c == column)
            {
                c = 0;
                r++;
            }
            ImageView oImageView = new ImageView(grdProfileFuns.getContext());
            if(UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().get(i).equals("Basketball"))
                oImageView.setImageResource(R.drawable.basketball);
            else if(UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().get(i).equals("Golf"))
                oImageView.setImageResource(R.drawable.golf);
            else if(UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().get(i).equals("American Football"))
                oImageView.setImageResource(R.drawable.american_football);
            else if(UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().get(i).equals("Football"))
                oImageView.setImageResource(R.drawable.foorball);
            else if(UserCollection.findUser(UserCollection.getCurrentUser()).getListFavoriteEvents().get(i).equals("Wing Chun"))
                oImageView.setImageResource(R.drawable.wchun);
            else
                oImageView.setImageResource(R.drawable.person);

            GridLayout.LayoutParams param =new GridLayout.LayoutParams();
            param.height = 100;
            param.width = 100;
            param.rightMargin = 5;
            param.topMargin = 5;
            param.setGravity(Gravity.LEFT);
            param.columnSpec = GridLayout.spec(c);
            param.rowSpec = GridLayout.spec(r);
            oImageView.setLayoutParams (param);
            grdProfileFuns.addView(oImageView);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login_profile, container, false);

        lblName = (TextView) rootView.findViewById(R.id.lblProfileName);
        lblUserName = (TextView)rootView.findViewById(R.id.lblProfileUserName);
        lblBirthDay = (TextView)rootView.findViewById(R.id.lblProfileBirthDay);
        lblEmail = (TextView)rootView.findViewById(R.id.lblProfileEmail);
        lblGender = (TextView)rootView.findViewById(R.id.lblGender);
        grdProfileFuns = (GridLayout)rootView.findViewById(R.id.grdProfileFUns);
        init();

        return rootView;
    }
}
