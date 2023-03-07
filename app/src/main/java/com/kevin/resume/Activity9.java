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
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_9);

        preferences = getSharedPreferences("name",0);
        preferences = getSharedPreferences("address",0);
        preferences = getSharedPreferences("phone",0);
        preferences = getSharedPreferences("email",0);
        preferences = getSharedPreferences("company",0);
        preferences = getSharedPreferences("experience",0);
        preferences = getSharedPreferences("Job",0);
        preferences = getSharedPreferences("joining",0);
        preferences = getSharedPreferences("school",0);
        preferences = getSharedPreferences("grade1",0);
        preferences = getSharedPreferences("passing1",0);
        preferences = getSharedPreferences("college",0);
        preferences = getSharedPreferences("grade2",0);
        preferences = getSharedPreferences("passing2",0);
        preferences = getSharedPreferences("skill",0);
        preferences = getSharedPreferences("project",0);
        preferences = getSharedPreferences("detail",0);
        editor = preferences.edit();

        txtname = findViewById(id.txtname);
        String name = preferences.getString("name", " ");
        txtaddress = findViewById(id.txtaddress);
        String address = preferences.getString("address"," ");
        txtphone = findViewById(id.txtphone);
        String phone = preferences.getString("phone"," ");
        txtemail = findViewById(id.txtemail);
        String email = preferences.getString("email"," ");
        txtname = findViewById(id.edtcompany);
        String company = preferences.getString("company", " ");
        txtaddress = findViewById(id.txtaddress);
        String experience = preferences.getString("experience"," ");
        txtphone = findViewById(id.txtphone);
        String job = preferences.getString("job"," ");
        txtemail = findViewById(id.txtemail);
        String joining = preferences.getString("joining"," ");
        txtname = findViewById(id.txtname);
        String school = preferences.getString("school", " ");
        txtaddress = findViewById(id.txtaddress);
        String grade1 = preferences.getString("grade1"," ");
        txtphone = findViewById(id.txtphone);
        String passing1 = preferences.getString("passing1"," ");
        txtemail = findViewById(id.txtemail);
        String college = preferences.getString("college"," ");
        txtphone = findViewById(id.txtphone);
        String grade2 = preferences.getString("grade2"," ");
        txtemail = findViewById(id.txtemail);
        String passing2 = preferences.getString("passing2"," ");
        txtname = findViewById(id.txtname);
        String skill = preferences.getString("skill", " ");
        txtaddress = findViewById(id.txtaddress);
        String project = preferences.getString("project"," ");
        txtphone = findViewById(id.txtphone);
        String detail = preferences.getString("detail"," ");

        txtname.setText(name);
        txtaddress.setText("Address : \n\t"+address);
        txtphone.setText("Phone No. : \n\t"+phone);
        txtemail.setText("Email ID : \t"+email);
    }
}