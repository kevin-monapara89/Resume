package com.kevin.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    TextView btnnext3;
    EditText edtsch, edtgrade, edtpy1, edtcol, edtdegree, edtpy2;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        preferences = getSharedPreferences("data",0);
        editor = preferences.edit();

        btnnext3 = findViewById(R.id.btnnext3);
        edtsch = findViewById(R.id.edtsch);
        edtgrade = findViewById(R.id.edtgrade);
        edtpy1 = findViewById(R.id.edtpy1);
        edtcol = findViewById(R.id.edtcol);
        edtdegree = findViewById(R.id.edtdegree);
        edtpy2 = findViewById(R.id.edtpy2);
        btnnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String school = edtsch.getText().toString();
                editor.putString("school",school);
                String grade = edtgrade.getText().toString();
                editor.putString("grade1",grade);
                String passing1 = edtpy1.getText().toString();
                editor.putString("passing1",passing1);
                String college = edtcol.getText().toString();
                editor.putString("college",college);
                String degree = edtgrade.getText().toString();
                editor.putString("degree",degree);
                String passing2 = edtpy1.getText().toString();
                editor.putString("passing2",passing2);
                editor.commit();

                if (school.isEmpty()) {
                    edtsch.setError("Enter school Name!");
                } else if (grade.isEmpty()) {
                    edtgrade.setError("Enter Grade!");
                } else if (passing1.isEmpty()) {
                    edtpy1.setError("Enter Passing Year!");
                } else if (college.isEmpty()) {
                    edtcol.setError("Enter College Name!");
                } else if (degree.isEmpty()) {
                    edtdegree.setError("Enter Grade!");
                }else if (passing2.isEmpty()) {
                    edtpy2.setError("Enter Passing Year!");
                }
                else {
                    Intent intent = new Intent(Activity4.this, Activity5.class);
                    startActivity(intent);
                }
            }
        });
    }
}