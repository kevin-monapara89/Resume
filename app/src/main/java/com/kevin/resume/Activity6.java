package com.kevin.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity6 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        TextView btnnext5;
        EditText edtskill;

        btnnext5 = findViewById(R.id.btnnext5);
        edtskill = findViewById(R.id.edtskill);

        btnnext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skill = edtskill.getText().toString();

                if (skill.isEmpty()) {
                    edtskill.setError("Enter school Name!");
                } else {
                        Intent intent = new Intent(Activity6.this, Activity7.class);
                        intent.putExtra("skill", skill);
                        startActivity(intent);
                }
            }
        });
    }
}