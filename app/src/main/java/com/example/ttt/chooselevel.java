package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class chooselevel extends AppCompatActivity {

    private Button singleplayer,multiplayer,logoutt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooselevel);

        singleplayer=findViewById(R.id.splay1);
        multiplayer=findViewById(R.id.multip1);
        logoutt=findViewById(R.id.logout);
        singleplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooselevel.this,MainActivity.class));
                finish();
            }
        });

        multiplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooselevel.this,multiplayer.class));
            }
        });

        logoutt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(chooselevel.this,login.class));
            }
        });
    }
}