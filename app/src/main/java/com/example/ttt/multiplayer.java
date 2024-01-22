package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class multiplayer extends AppCompatActivity {

    private ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private int w1=3,w2=3,w3=3,w4=3,w5=3,w6=3,w7=3,w8=3,w9=3;
    private String checkplayer="X";
    private int count=0,xcount=0,ocount=0;
    private Button resetButton,homee;
    private TextView xscoree,oscoree;
    private String winner;

    //since there are 9 grids
    //if avialable is 0 than place x
    //if available is 1 than place 0
    //else 2 is equal to NULL
    int[] available={2,2,2,2,2,2,2,2,2};
    //now we have to check the winning positions of the game
    int[][] winningpositions={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        btn1=findViewById(R.id.img1);
        btn2=findViewById(R.id.img2);
        btn3=findViewById(R.id.img3);
        btn4=findViewById(R.id.img4);
        btn5=findViewById(R.id.img5);
        btn6=findViewById(R.id.img6);
        btn7=findViewById(R.id.img7);
        btn8=findViewById(R.id.img8);
        btn9=findViewById(R.id.img9);

        resetButton=findViewById(R.id.rst1);


        xscoree=findViewById(R.id.xscore);
        oscoree=findViewById(R.id.oscore);

        homee=findViewById(R.id.home1);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the reset method
                xcount = 0;
                ocount = 0;
                xscoree.setText(String.valueOf(xcount));
                oscoree.setText(String.valueOf(ocount));
            }
        });

        homee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(multiplayer.this,chooselevel.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                changeplayer();
                checkwinner();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(changeplayer()) {
                    available[0] = 0;
                }else{
                    available[0]=1;
                }
            }
        });
    }
    private boolean changeplayer(){
        if(checkplayer.equals("X")){
            checkplayer="O";
            return true;
        }else{
            checkplayer="X";
            return false;
        }
    }
    private void checkwinner(){
        for(int[] winningpositions:winningpositions){
            if(available[winningpositions[0]]==available[winningpositions[1]]
                    && available[winningpositions[1]]==available[winningpositions[2]] &&
                    available[winningpositions[0]]!=2){
                if(available[winningpositions[0]]==0){
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "0 WON", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
    
}