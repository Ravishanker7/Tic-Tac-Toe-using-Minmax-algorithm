package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooselevel extends AppCompatActivity {

    private Button singleplayer,multiplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooselevel);

        singleplayer=findViewById(R.id.splay1);
        multiplayer=findViewById(R.id.multip1);
        singleplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(chooselevel.this,MainActivity.class));
                finish();
            }
        });
    }
}