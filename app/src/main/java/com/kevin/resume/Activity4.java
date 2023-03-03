package com.kevin.resume;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        TextView btnnext3;
        EditText edtsch, edtgrade1, edtpy1, edtcol, edtgrade2, edtpy2;

        btnnext3 = findViewById(R.id.btnnext3);
        edtsch = findViewById(R.id.edtsch);
        edtgrade1 = findViewById(R.id.edtgrade1);
        edtpy1 = findViewById(R.id.edtpy1);
        edtcol = findViewById(R.id.edtcol);
        edtgrade2 = findViewById(R.id.edtgrade2);
        edtpy2 = findViewById(R.id.edtpy2);
        btnnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String school = edtsch.getText().toString();
                String grade1 = edtgrade1.getText().toString();
                String passing = edtpy1.getText().toString();
                String college = edtcol.getText().toString();
                String grade2 = edtgrade2.getText().toString();
                String passing2 = edtpy2.getText().toString();

                if (school.isEmpty()) {
                    edtsch.setError("Enter Company Name!");
                } else if (grade1.isEmpty()) {
                    edtgrade1.setError("Enter Experiance!");
                } else if (passing.isEmpty()) {
                    edtpy1.setError("Enter Job Type!");
                } else if (college.isEmpty()) {
                    edtcol.setError("Enter Possition!");
                } else if (grade2.isEmpty()) {
                    edtgrade2.setError("Enter Possition!");
                }else if (passing2.isEmpty()) {
                    edtpy2.setError("Enter Possition!");
                }
                else {
                    Intent intent = new Intent(Activity4.this, Activity5.class);
                    intent.putExtra("school", school);
                    startActivity(intent);
                }
            }
        });
    }
}