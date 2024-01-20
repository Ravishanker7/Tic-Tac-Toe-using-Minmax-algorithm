package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    TextView signup;
    EditText user1,password1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup=findViewById(R.id.lg1);
        user1=findViewById(R.id.username1);
        password1=findViewById(R.id.pass1);
        btn1=findViewById(R.id.btnl1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email,pass;
                email=user1.getText().toString();
                pass=password1.getText().toString();
                if(email.isEmpty()){
                    Toast.makeText(login.this, "ENTER THE EMAIL", Toast.LENGTH_SHORT).show();
                }
                if(pass.isEmpty()){
                    Toast.makeText(login.this, "ENTER THE PASSWORD", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(login.this,chooselevel.class));
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,register.class));
            }
        });

    }
}