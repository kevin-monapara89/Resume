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

                String reading = reading1.getText().toString();
                editor.putString("reading",reading);
                String dancing  = danceing1.getText().toString();
                editor.putString("dancing",dancing);
                String singing = singing1.getText().toString();
                editor.putString("singing",singing);
                String sport = sport1.getText().toString();
                editor.putString("sport",sport);
                String traveling = sport1.getText().toString();
                editor.putString("traveling",traveling);
                String photography = photography1.getText().toString();
                editor.putString("sport",photography);
                editor.commit();

                String s = " ";
                if (reading1.isChecked()) {
                    s += "Reading \n";
                }
                if (danceing1.isChecked()) {
                    s += "Dancing \n";
                }
                if (singing1.isChecked()) {
                    s += "Singing \n";
                }
                if (sport1.isChecked()) {
                    s += "Sport \n";
                }
                if (traveling1.isChecked()) {
                    s += "Traveling \n";
                }
                if (photography1.isChecked()) {
                    s += "Photography \n";
                }

                Intent intent = new Intent(Activity5.this, Activity6.class);
                startActivity(intent);
            }
        });
    }
}