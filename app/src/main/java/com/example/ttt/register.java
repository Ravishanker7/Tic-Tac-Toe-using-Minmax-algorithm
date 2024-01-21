package com.example.ttt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class register extends AppCompatActivity {

    EditText semail,spass;
    TextView stxt;
    Button sbtn;

    private FirebaseAuth authh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        semail=findViewById(R.id.suser);
        spass=findViewById(R.id.spass);
        sbtn=findViewById(R.id.sbtn1);
        stxt=findViewById(R.id.stxt1);
        authh=FirebaseAuth.getInstance();

        FirebaseUser currentUser = authh.getCurrentUser();
        if(currentUser != null){
            startActivity(new Intent(register.this,chooselevel.class));
            finish();
        }
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
                    authh.createUserWithEmailAndPassword(email1, pass1)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        Toast.makeText(register.this, "SIGN UP SUCCESFULL", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(register.this,chooselevel.class));
                                        finish();
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Toast.makeText(register.this, "SIGN UP FAILED", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });

    }
}