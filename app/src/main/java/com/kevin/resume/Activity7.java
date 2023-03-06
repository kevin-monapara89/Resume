package com.kevin.resume;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity7 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        TextView btnnext6;
        EditText edtproname, edtdetail;

        btnnext6 = findViewById(R.id.btnnext6);
        edtproname = findViewById(R.id.edtproname);
        edtdetail = findViewById(R.id.edtdetail);
        btnnext6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String proname = edtproname.getText().toString();
                String detail = edtdetail.getText().toString();

                if (proname.isEmpty()) {
                    edtproname.setError("Enter school Name!");
                } else {
                    Intent intent = new Intent(Activity7.this, Activity8.class);
                    intent.putExtra("detail", detail);
                    startActivity(intent);
                }
            }
        });
    }
}