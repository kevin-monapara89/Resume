package com.kevin.resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity8 extends AppCompatActivity {

    TextView template1, tempate2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        template1 = findViewById(R.id.template1);
        tempate2 = findViewById(R.id.template2);
        template1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Activity8.this, Activity9.class);
                startActivity(intent);
            }
        });

        tempate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Activity8.this, Activity10.class);
                startActivity(intent);
            }
        });
    }
}