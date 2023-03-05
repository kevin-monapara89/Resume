package com.kevin.resume;

import static com.kevin.resume.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Activity9 extends AppCompatActivity {

    TextView txtaddress, txtphone, txtemail;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_9);

        txtaddress = findViewById(id.txtaddress);
        txtphone = findViewById(id.txtphone);
        txtemail = findViewById(id.txtemail);

        Intent intent = getIntent();
        String address = intent.getStringExtra("address");
        txtaddress.setText("Address : \n\t"+txtaddress);
        String phone2 = intent.getStringExtra("phone");
        txtphone.setText("Phone No : \n\t"+txtphone);
        String email2 = intent.getStringExtra("email");
        txtemail.setText("Email Id : \t"+txtemail);
    }
}