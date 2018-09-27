package com.example.trinity.loginandregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.trinity.loginandregistration.Activities.AddSubjectForExam;

public class TestCreation extends AppCompatActivity {
Button addex,submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_creation);
        addex=(Button)findViewById(R.id.b2);
        addex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TestCreation.this, AddSubjectForExam.class);
                startActivity(i);
            }
        });
    }
}
