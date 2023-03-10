package com.kevin.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {
    TextView btnnext5;
    EditText edtskill;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        preferences = getSharedPreferences("data",0);
        editor = preferences.edit();

        btnnext5 = findViewById(R.id.btnnext5);
        edtskill = findViewById(R.id.edtskill);

        btnnext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skill = edtskill.getText().toString();
                editor.putString("skill",skill);

                if (skill.isEmpty()) {
                    edtskill.setError("Enter Skills!");
                } else {
                        Intent intent = new Intent(Activity6.this, Activity7.class);
                        startActivity(intent);
                }
            }
        });
    }
}