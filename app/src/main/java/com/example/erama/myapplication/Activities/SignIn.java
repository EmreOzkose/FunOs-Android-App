package com.example.erama.myapplication.Activities;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.erama.myapplication.Activities.SignInActivities.SigninLoadimage;
import com.example.erama.myapplication.MainActivity;
import com.example.erama.myapplication.R;
import com.example.erama.myapplication.Users.User;
import com.example.erama.myapplication.Users.UserCollection;

import static com.example.erama.myapplication.R.id.spDays;
import static com.example.erama.myapplication.R.id.spMonths;
import static com.example.erama.myapplication.R.id.spYears;

public class SignIn extends AppCompatActivity {

    private static User signedInUser;

    private Button btnNext1;
    private EditText txtName;
    private EditText txtUserName;
    private EditText txtPassword;
    private EditText txtEmail;
    private String txtBirthDay = "01/01/1900";
    private String day, month, year;
    private Spinner spYear, spMonth, spDay;
    private RadioButton rbMale, rbFemale;
    private String genderSelection;
    private ArrayAdapter<Integer> arrayAdapter1, arrayAdapter2, arrayAdapter3;

    private Integer [] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
    private Integer [] months = {1,2,3,4,5,6,7,8,9,10,11,12};
    private Integer [] years = {1980,1981,1982,1983,1984,1985,1986,1987,1988,1989};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        init();
    }

    public void init(){
        txtName = (EditText)findViewById(R.id.txtName);
        txtUserName = (EditText)findViewById(R.id.txtUserName);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        txtEmail = (EditText)findViewById(R.id.txtEmail);

        spDay = (Spinner)findViewById(R.id.spDays);
        spDay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                day = spDay.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spMonth = (Spinner)findViewById(R.id.spMonths);
        spMonth.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                month = spMonth.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spYear = (Spinner)findViewById(R.id.spYears);
        spYear.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                year = spYear.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        txtBirthDay = String.format("{}/{}/{}", day, month, year);

        btnNext1 = (Button)findViewById(R.id.btnJoinUs);
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                signedInUser = new User(txtName.getText().toString(), txtUserName.getText().toString(), txtPassword.getText().toString(), txtEmail.getText().toString(),txtBirthDay,genderSelection);

                Intent i = new Intent(SignIn.this, SigninLoadimage.class);
                startActivity(i);
            }
        });

        arrayAdapter1 = new ArrayAdapter<Integer>(this, android.R.layout.simple_dropdown_item_1line,days);
        spDay = (Spinner)findViewById(spDays);
        spDay.setAdapter(arrayAdapter1);

        arrayAdapter2 = new ArrayAdapter<Integer>(this, android.R.layout.simple_dropdown_item_1line,months);
        spMonth = (Spinner)findViewById(spMonths);
        spMonth.setAdapter(arrayAdapter2);

        arrayAdapter3 = new ArrayAdapter<Integer>(this, android.R.layout.simple_dropdown_item_1line, years);
        spYear = (Spinner)findViewById(spYears);
        spYear.setAdapter(arrayAdapter3);

        rbMale = (RadioButton)findViewById(R.id.rbMale);
        rbMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbFemale.setSelected(false);
                genderSelection = "MALE";
            }
        });

        rbFemale = (RadioButton)findViewById(R.id.rbFemale);
        rbFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rbMale.setSelected(false);
                genderSelection = "FEMALE";
            }
        });

    }

    public static User getSignedInUser() {
        return signedInUser;
    }

    public static void setSignedInUser(User signedInUser) {
        SignIn.signedInUser = signedInUser;
    }
}
