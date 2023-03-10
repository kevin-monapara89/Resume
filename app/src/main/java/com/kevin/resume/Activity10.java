package com.kevin.resume;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity10 extends AppCompatActivity {

    TextView txtname1, txtphone1, txtemail1, txtaddress1, txtskdetail1, txtcompany1, txtexp1;
    TextView txtsch1, txtgrade01, txtcol1, txtproname1, txtdetail1, txtjob1, txtjoin1, txtpy1, txtpy2, txtdegree1;

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
        txtcompany1 = findViewById(R.id.company);
        String company = preferences.getString("company", " ");
        txtexp1 = findViewById(R.id.exp);
        String experience = preferences.getString("experience", " ");
        txtjob1 = findViewById(R.id.job);
        String job = preferences.getString("job", " ");
        txtjoin1 = findViewById(R.id.joining);
        String joining = preferences.getString("joining", " ");
        txtsch1 = findViewById(R.id.school);
        String school = preferences.getString("school", " ");
        txtgrade01 = findViewById(R.id.grade);
        String grade1 = preferences.getString("grade1", " ");
        txtpy1 = findViewById(R.id.passing1);
        String passing1 = preferences.getString("passing1", " ");
        txtcol1 = findViewById(R.id.col1ege);
        String college = preferences.getString("college", " ");
        txtdegree1 = findViewById(R.id.degree);
        String degree = preferences.getString("degree", " ");
        txtpy2 = findViewById(R.id.passing2);
        String passing2 = preferences.getString("passing2", " ");
        txtskdetail1 = findViewById(R.id.skdetail);
        String skill = preferences.getString("skill", " ");
        txtproname1 = findViewById(R.id.proname);
        String project = preferences.getString("project", " ");
        txtdetail1 = findViewById(R.id.detail);
        String detail = preferences.getString("detail", " ");

        txtname1.setText(name);
        txtaddress1.setText(address);
        txtphone1.setText(phone);
        txtemail1.setText(email);
        txtcompany1.setText(company);
        txtexp1.setText(experience);
        txtjoin1.setText(joining);
        txtsch1.setText(school);
        txtgrade01.setText(grade1);
        txtpy1.setText(passing1);
        txtcol1.setText(college);
        txtdegree1.setText(degree);
        txtpy2.setText(passing2);
        txtskdetail1.setText(skill);
        txtproname1.setText(project);
        txtdetail1.setText(detail);

    }
}