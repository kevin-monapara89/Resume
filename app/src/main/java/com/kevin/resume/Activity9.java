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

    TextView txtaddress, txtphone, txtemail, txtname, txtjob, txtsch, txtgrade1, txtcol, txtgrade2;
    TextView txtcompany, txtexp, txtproject, txtdetail, txtskill, txtjoin, txtpy1, txtpy2;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_9);

        preferences = getSharedPreferences("data",0);

        txtname = findViewById(R.id.txtname);
        String name = preferences.getString("name", " ");
        txtaddress = findViewById(R.id.txtaddress);
        String address = preferences.getString("address", " ");
        txtphone = findViewById(R.id.txtphone);
        String phone = preferences.getString("phone", " ");
        txtemail = findViewById(R.id.txtemail);
        String email = preferences.getString("email", " ");
        txtcompany = findViewById(R.id.txtcompany);
        String company = preferences.getString("company", " ");
        txtexp = findViewById(R.id.txtexp);
        String experience = preferences.getString("experience", " ");
        txtjob = findViewById(R.id.txtjob);
        String job = preferences.getString("job", " ");
        txtjoin = findViewById(R.id.txtjoin);
        String joining = preferences.getString("joining", " ");
        txtsch = findViewById(R.id.txtsch);
        String school = preferences.getString("school", " ");
        txtgrade1 = findViewById(R.id.txtgrade1);
        String grade1 = preferences.getString("grade1", " ");
        txtpy1 = findViewById(R.id.txtpy1);
        String passing1 = preferences.getString("passing1", " ");
        txtcol = findViewById(R.id.txtcol);
        String college = preferences.getString("college", " ");
        txtgrade2 = findViewById(R.id.txtgrade2);
        String grade2 = preferences.getString("grade2", " ");
        txtpy2 = findViewById(R.id.txtpy2);
        String passing2 = preferences.getString("passing2", " ");
        txtskill = findViewById(R.id.txtskill);
        String skill = preferences.getString("skill", " ");
        txtproject = findViewById(R.id.txtproject);
        String project = preferences.getString("project", " ");
        txtdetail = findViewById(R.id.txtdetail);
        String detail = preferences.getString("detail", " ");

        txtname.setText(name);
        txtaddress.setText("Address : \n\t" + address);
        txtphone.setText("Phone No. : \t" + phone);
        txtemail.setText("Email ID : \t\t" + email);
        txtjob.setText(job);
        txtsch.setText(school);
        txtgrade1.setText(grade1);
        txtcol.setText(college);
        txtgrade2.setText(grade2);
        txtcompany.setText(company);
        txtexp.setText(experience);
        txtproject.setText(project);
        txtdetail.setText(detail);
        txtskill.setText(skill);
        txtjoin.setText(joining);
        txtpy1.setText(passing1);
        txtpy2.setText(passing2);
    }
}