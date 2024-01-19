package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int w1=3,w2=3,w3=3,w4=3,w5=3,w6=3,w7=3,w8=3,w9=3;
    String checkplayer="X";
    private int count=0,xcount=0,ocount=0;
    Button reset;
    TextView xscoree,oscoree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.img1);
        btn2=findViewById(R.id.img2);
        btn3=findViewById(R.id.img3);
        btn4=findViewById(R.id.img4);
        btn5=findViewById(R.id.img5);
        btn6=findViewById(R.id.img6);
        btn7=findViewById(R.id.img7);
        btn8=findViewById(R.id.img8);
        btn9=findViewById(R.id.img9);

        reset=findViewById(R.id.rst1);

        xscoree=findViewById(R.id.xscore);
        oscoree=findViewById(R.id.oscore);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xcount=0;
                ocount=0;
            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w1>2) {
                    if (checkplayer.equals("X")) {
                        btn1.setImageResource(R.drawable.xcopy);
                        count++;
                        w1 = 1;
                    } else {
                        btn1.setImageResource(R.drawable.ocopy);
                        count++;
                        w1 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w2>2) {
                    if (checkplayer.equals("X")) {
                        btn2.setImageResource(R.drawable.xcopy);
                        count++;
                        w2 = 1;
                    } else {
                        btn2.setImageResource(R.drawable.ocopy);
                        count++;
                        w2 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w3>2) {
                    if (checkplayer.equals("X")) {
                        btn3.setImageResource(R.drawable.xcopy);
                        count++;
                        w3 = 1;
                    } else {
                        btn3.setImageResource(R.drawable.ocopy);
                        count++;
                        w3 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w4>2) {
                    if (checkplayer.equals("X")) {
                        btn4.setImageResource(R.drawable.xcopy);
                        count++;
                        w4 = 1;
                    } else {
                        btn4.setImageResource(R.drawable.ocopy);
                        count++;
                        w4 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w5>2) {
                    if (checkplayer.equals("X")) {
                        btn5.setImageResource(R.drawable.xcopy);
                        count++;
                        w5 = 1;
                    } else {
                        btn5.setImageResource(R.drawable.ocopy);
                        count++;
                        w5 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w6>2) {
                    if (checkplayer.equals("X")) {
                        btn6.setImageResource(R.drawable.xcopy);
                        count++;
                        w6 = 1;
                    } else {
                        btn6.setImageResource(R.drawable.ocopy);
                        count++;
                        w6 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w7>2) {
                    if (checkplayer.equals("X")) {
                        btn7.setImageResource(R.drawable.xcopy);
                        count++;
                        w7 = 1;
                    } else {
                        btn7.setImageResource(R.drawable.ocopy);
                        count++;
                        w7 = 0;

                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w8>2) {
                    if (checkplayer.equals("X")) {
                        btn8.setImageResource(R.drawable.xcopy);
                        count++;
                        w8 = 1;
                    } else {
                        btn8.setImageResource(R.drawable.ocopy);
                        count++;
                        w8 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w9>2) {
                    if (checkplayer.equals("X")) {
                        btn9.setImageResource(R.drawable.xcopy);
                        count++;
                        w9 = 1;
                    } else {
                        btn9.setImageResource(R.drawable.ocopy);
                        count++;
                        w9 = 0;
                    }
                }
                changeplayer();
                checkwinner();
            }
        });

    }
    private void changeplayer() {
        if(checkplayer.equals("X")){
            checkplayer="O";
        }else{
            checkplayer="X";
        }
    }
    private void reset(){
        btn1.setImageDrawable(null);
        btn2.setImageDrawable(null);
        btn3.setImageDrawable(null);
        btn4.setImageDrawable(null);
        btn5.setImageDrawable(null);
        btn6.setImageDrawable(null);
        btn7.setImageDrawable(null);
        btn8.setImageDrawable(null);
        btn9.setImageDrawable(null);
        w1=3;
        w2=3;
        w3=3;
        w4=3;
        w5=3;
        w6=3;
        w7=3;
        w8=3;
        w9=3;
        count=0;
    }
    private void checkwinner() {
        if(w1==1 && w2==1 && w3==1 || w4==1 && w5==1 && w6==1 || w7==1 && w8==1 && w9==1 ||
                w1==1 && w4==1 && w7==1 || w2==1 && w5==1 && w8==1 || w3==1 && w6==1 && w9==1 ||
                w1==1 && w5==1 && w9==1 || w3==1 && w5==1 && w7==1 ){
            Toast.makeText(this, "X WIN", Toast.LENGTH_SHORT).show();
            xcount++;
            xscoree.setText(String.valueOf(xcount));
            oscoree.setText(String.valueOf(ocount));
            reset();
        }
        if(w1==0 && w2==0 && w3==0 || w4==0 && w5==0 && w6==0 || w7==0 && w8==0 && w9==0 ||
                w1==0 && w4==0 && w7==0 || w2==0 && w5==0 && w8==0 || w3==0 && w6==0 && w9==0 ||
                w1==0 && w5==0 && w9==0 || w3==0 && w5==0 && w7==0 ){
            Toast.makeText(this, "O WIN", Toast.LENGTH_SHORT).show();
            ocount++;
            xscoree.setText(String.valueOf(xcount));
            oscoree.setText(String.valueOf(ocount));
            reset();
        }
        if(count>=9){
            Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show();
            reset();
        }
    }
}