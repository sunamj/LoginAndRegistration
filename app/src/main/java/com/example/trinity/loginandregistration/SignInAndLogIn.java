package com.example.trinity.loginandregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignInAndLogIn extends AppCompatActivity {
    Button login,signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_and_log_in);
        login=(Button)findViewById(R.id.btnLogIn);
        signUp=(Button)findViewById(R.id.btnSignUp);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignInAndLogIn.this,LoginActivity.class);
                startActivity(i);
            }
        });
        //hide the title bar
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SignInAndLogIn.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
