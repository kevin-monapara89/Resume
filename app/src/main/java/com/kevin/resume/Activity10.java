package com.kevin.resume;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity10 extends AppCompatActivity {

    TextView txtname1, txtphone1, txtemail1, txtaddress1, txtskdetail1, txtcompany1, txtexp1;
    TextView txtsch1, txtgrade01, txtcol1, txtproname1, txtdetail1;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        preferences = getSharedPreferences("data", 0);

        txtname1 = findViewById(R.id.name);
        String name = preferences.getString("name", " ");
        txtaddress1 = findViewById(R.id.address);
        String address = preferences.getString("address", " ");
        txtphone1 = findViewById(R.id.phone);
        String phone = preferences.getString("phone", " ");
        txtemail1 = findViewById(R.id.email);
        String email = preferences.getString("email", " ");


        txtname1.setText(name);
        txtaddress1.setText(address);
        txtphone1.setText(phone);
        txtemail1.setText(email);
    }
}