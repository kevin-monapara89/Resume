package com.kevin.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {
    TextView btnnext4;
    CheckBox reading1, danceing1, singing1, sport1, traveling1, photography1;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        preferences = getSharedPreferences("data", 0);
        editor = preferences.edit();

            reading1 = findViewById(R.id.reading);
            danceing1 = findViewById(R.id.danceing);
            singing1 = findViewById(R.id.singing);
            sport1 = findViewById(R.id.sport);
            traveling1 = findViewById(R.id.traveling);
            photography1 = findViewById(R.id.photography);

        btnnext4 = findViewById(R.id.btnnext4);
        btnnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String hobby = " ";
                if (reading1.isChecked()) {
                    hobby += "Reading \n";
                }
                if (danceing1.isChecked()) {
                    hobby += "Dancing \n";
                }
                if (singing1.isChecked()) {
                    hobby += "Singing \n";
                }
                if (sport1.isChecked()) {
                    hobby += "Sport \n";
                }
                if (traveling1.isChecked()) {
                    hobby += "Traveling \n";
                }
                if (photography1.isChecked()) {
                    hobby += "Photography \n";
                }

                hobby = reading1.getText().toString();
                editor.commit();

                Intent intent = new Intent(Activity5.this, Activity6.class);
                startActivity(intent);
            }
        });
    }
}