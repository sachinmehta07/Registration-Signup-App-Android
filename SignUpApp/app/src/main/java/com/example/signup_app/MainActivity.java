package com.example.signup_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = (EditText) findViewById(R.id.user_name);
        MaterialButton regbtm = (MaterialButton) findViewById(R.id.register_btn);

        regbtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  UserName1 = username.getText().toString();
                Toast.makeText(MainActivity.this,"User Name is " + UserName1 , Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this ,  "Login Successful", Toast.LENGTH_SHORT).show();
            }
        });
    }
}