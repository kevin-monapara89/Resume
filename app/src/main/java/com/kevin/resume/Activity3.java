package com.kevin.resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView btnnext2;
        EditText edtcompany, edtexp, edtjob, edtposs;

        btnnext2 = findViewById(R.id.btnnext2);
        edtcompany = findViewById(R.id.edtcompany);
        edtexp = findViewById(R.id.edtexp);
        edtjob = findViewById(R.id.edtjob);
        edtposs = findViewById(R.id.edtposs);

        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String company = edtcompany.getText().toString();
                String experiance = edtexp.getText().toString();
                String job = edtjob.getText().toString();
                String possition = edtposs.getText().toString();

                if (company.isEmpty()) {
                    edtcompany.setError("Enter Company Name!");
                } else if (experiance.isEmpty()) {
                    edtexp.setError("Enter Experiance!");
                } else if (job.isEmpty()) {
                    edtjob.setError("Enter Job Type!");
                } else if (possition.isEmpty()) {
                    edtposs.setError("Enter Possition!");
                } else {
                    Intent intent = new Intent(Activity3.this, Activity4.class);
                    intent.putExtra("company", company);
                    startActivity(intent);
                }
            }
        });
    }
}