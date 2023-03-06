package com.kevin.resume;

import static com.kevin.resume.R.id.edtjoin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView btnnext2;
    EditText edtcompany, edtexp, edtjob, edtjoin;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        preferences = getSharedPreferences("company",0);
        preferences = getSharedPreferences("experiance",0);
        preferences = getSharedPreferences("Job",0);
        preferences = getSharedPreferences("joining",0);
        editor = preferences.edit();

        btnnext2 = findViewById(R.id.btnnext2);
        edtcompany = findViewById(R.id.edtcompany);
        edtexp = findViewById(R.id.edtexp);
        edtjob = findViewById(R.id.edtjob);
        edtjoin = findViewById(R.id.edtjoin);

        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String company = edtcompany.getText().toString();
                editor.putString("company",company);
                String experience = edtexp.getText().toString();
                editor.putString("experience",experience);
                String job = edtjob.getText().toString();
                editor.putString("job",job);
                String joining = edtjoin.getText().toString();
                editor.putString("joining",joining);
                editor.commit();

                if (company.isEmpty()) {
                    edtcompany.setError("Enter Company Name!");
                } else if (experience.isEmpty()) {
                    edtexp.setError("Enter Experiance!");
                } else if (job.isEmpty()) {
                    edtjob.setError("Enter Job Type!");
                } else if (joining.isEmpty()) {
                    edtjoin.setError("Enter Joining Year!");
                } else {
                    Intent intent = new Intent(Activity3.this, Activity4.class);
                    startActivity(intent);
                }
            }
        });
    }
}