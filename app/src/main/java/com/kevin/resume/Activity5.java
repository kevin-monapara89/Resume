package com.kevin.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {
    TextView btnnext4;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        preferences = getSharedPreferences("data",0);
        editor = preferences.edit();

        btnnext4 = findViewById(R.id.btnnext4);
        btnnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(Activity5.this, Activity6.class);
                    startActivity(intent);
            }
        });
    }
}