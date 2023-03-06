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

    TextView txtaddress, txtphone, txtemail, txtname;
    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_9);

        preferences = getSharedPreferences("name",0);
        preferences = getSharedPreferences("address",0);
        preferences = getSharedPreferences("phone",0);
        preferences = getSharedPreferences("email",0);

        txtname = findViewById(id.txtname);
        String name = preferences.getString("name", " ");
        txtaddress = findViewById(id.txtaddress);
        String address = preferences.getString("address"," ");
        txtphone = findViewById(id.txtphone);
        String phone = preferences.getString("phone"," ");
        txtemail = findViewById(id.txtemail);
        String email = preferences.getString("email"," ");

        txtname.setText(name);
        txtaddress.setText("Address : \n\t"+address);
        txtphone.setText("Phone No. : \n\t"+phone);
        txtemail.setText("Email ID : \t"+email);
    }
}