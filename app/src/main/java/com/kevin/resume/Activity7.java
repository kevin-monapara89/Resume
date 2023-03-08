package com.kevin.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {
    TextView btnnext6;
    EditText edtproname, edtdetail;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        preferences = getSharedPreferences("data",0);
        editor = preferences.edit();

        btnnext6 = findViewById(R.id.btnnext6);
        edtproname = findViewById(R.id.edtproname);
        edtdetail = findViewById(R.id.edtdetail);
        btnnext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String project = edtproname.getText().toString();
                editor.putString("project",project);
                String detail = edtdetail.getText().toString();
                editor.putString("detail",detail);
                editor.commit();

                if (project.isEmpty()) {
                    edtproname.setError("Enter Project Name!");
                } else if (detail.isEmpty()) {
                    edtdetail.setError("Enter Detail!");
                } else {
                    Intent intent = new Intent(Activity7.this, Activity8.class);
                    startActivity(intent);
                }
            }
        });
    }
}