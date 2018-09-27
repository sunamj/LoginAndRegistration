package com.example.trinity.loginandregistration.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.trinity.loginandregistration.R;
import com.example.trinity.loginandregistration.TestCreation;

public class TestActivity extends AppCompatActivity {
Button createtest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        createtest=(Button)findViewById(R.id.btncreate);
        createtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TestActivity.this, TestCreation.class);
                startActivity(i);
            }
        });
    }
}
