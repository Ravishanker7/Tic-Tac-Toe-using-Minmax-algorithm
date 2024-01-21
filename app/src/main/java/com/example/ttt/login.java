package com.example.ttt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class login extends AppCompatActivity {

    TextView signup;
    EditText user1,password1;
    Button btn1;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup=findViewById(R.id.lg1);
        user1=findViewById(R.id.username1);
        password1=findViewById(R.id.pass1);
        btn1=findViewById(R.id.btnl1);
        auth=FirebaseAuth.getInstance();


            // Check if user is signed in (non-null) and update UI accordingly.
            FirebaseUser currentUser = auth.getCurrentUser();
            if(currentUser != null){
                startActivity(new Intent(login.this,chooselevel.class));
                finish();
            }
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
                    auth.signInWithEmailAndPassword(email, pass)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        FirebaseUser user = auth.getCurrentUser();
                                        Toast.makeText(login.this, "LOGIN SUCESSFULL", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(login.this, chooselevel.class));
                                        finish();
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Toast.makeText(login.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();

                                    }
                                }
                            });
                }
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(login.this,register.class));
                finish();
            }
        });

    }
}