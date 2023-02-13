package com.example.signup_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView newuser = (TextView) findViewById(R.id.newuser);
        Intent newuser_reg;
        newuser_reg = new Intent(SecondActivity.this,MainActivity.class);

                newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(newuser_reg);
            }
        });

    }
}