package com.kevin.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    TextView btnnext1;
    EditText edtname, edtaddress, edtemail, edtphone;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        preferences = getSharedPreferences("name",0);
        preferences = getSharedPreferences("address",0);
        preferences = getSharedPreferences("phone",0);
        preferences = getSharedPreferences("email",0);
        editor = preferences.edit();

        btnnext1 = findViewById(R.id.btnnext1);
        edtname = findViewById(R.id.edtname);
        edtaddress = findViewById(R.id.edtaddress);
        edtemail = findViewById(R.id.edtemail);
        edtphone = findViewById(R.id.edtphone);

        btnnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtname.getText().toString();
                editor.putString("name",name);
                String address = edtaddress.getText().toString();
                editor.putString("address",address);
                String email = edtemail.getText().toString();
                editor.putString("email",email);
                String phone = edtphone.getText().toString();
                editor.putString("phone",phone);
                editor.commit();

                if (name.isEmpty()) {
                    edtname.setError("Enter Name!");
                } else if (address.isEmpty()) {
                    edtaddress.setError("Enter address!");
                } else if (email.isEmpty()) {
                    edtemail.setError("Enter Email!");
                } else if (phone.isEmpty()) {
                    edtphone.setError("Enter Phone Number!");
                } else {
                    Intent intent = new Intent(Activity2.this, Activity3.class);
                    startActivity(intent);
                }
            }
        });
    }
}