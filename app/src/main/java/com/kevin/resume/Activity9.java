package com.kevin.resume;

import static com.kevin.resume.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity9 extends AppCompatActivity {

    TextView txtaddress, txtphone, txtemail;

    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_9);

        preferences = getSharedPreferences("address",0);
        preferences = getSharedPreferences("phone",0);
        preferences = getSharedPreferences("email",0);

        txtaddress = findViewById(R.id.txtaddress);
        txtphone = findViewById(R.id.txtphone);
        txtemail = findViewById(R.id.txtemail);

        String address = preferences.getString("address","");
        String phone = preferences.getString("phone"," ");
        String email = preferences.getString("email", " ");

        txtaddress.setText(address);
        txtphone.setText(phone);
        txtemail.setText(email);

    }
}