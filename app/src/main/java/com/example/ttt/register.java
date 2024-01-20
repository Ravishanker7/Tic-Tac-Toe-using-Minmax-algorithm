package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {

    EditText semail,spass;
    TextView stxt;
    Button sbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        semail=findViewById(R.id.suser);
        spass=findViewById(R.id.spass);
        sbtn=findViewById(R.id.sbtn1);
        stxt=findViewById(R.id.stxt1);

        sbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1,pass1;
                email1=semail.getText().toString();
                pass1=spass.getText().toString();
                if(email1.isEmpty()){
                    Toast.makeText(register.this, "ENTER THE EMAIL", Toast.LENGTH_SHORT).show();
                }
                if(pass1.isEmpty()){
                    Toast.makeText(register.this, "ENTER THE PASSWORD", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(register.this,chooselevel.class));
                }
            }
        });

    }
}