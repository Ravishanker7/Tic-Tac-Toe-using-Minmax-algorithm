package com.example.ttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;

public class multiplayer extends AppCompatActivity {

    private ImageView btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    private int count = 0, xcount = 0, ocount = 0;
    private Button resetButton, homee;
    private TextView xscoree, oscoree;
    private String winner;
    private int bestmove;
    private int move;
    private int[] board = {2,2,2,2,2,2,2,2,2};

    //since there are 9 grids
    //if avialable is 0 than place x
    //if available is 1 than place 0
    //else 2 is equal to NULL
    int[] available = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    //now we have to check the winning positions of the game


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        btn1 = findViewById(R.id.img1);
        btn2 = findViewById(R.id.img2);
        btn3 = findViewById(R.id.img3);
        btn4 = findViewById(R.id.img4);
        btn5 = findViewById(R.id.img5);
        btn6 = findViewById(R.id.img6);
        btn7 = findViewById(R.id.img7);
        btn8 = findViewById(R.id.img8);
        btn9 = findViewById(R.id.img9);

        resetButton = findViewById(R.id.rst1);


        xscoree = findViewById(R.id.xscore);
        oscoree = findViewById(R.id.oscore);

        homee = findViewById(R.id.home1);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the reset method
                xcount = 0;
                ocount = 0;
                xscoree.setText(String.valueOf(xcount));
                oscoree.setText(String.valueOf(ocount));
                reset();
            }
        });

        homee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(multiplayer.this, chooselevel.class));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[0] == 2) {
                    board[0] = 0;
                    btn1.setImageResource(R.drawable.xcopy);
                    checkwinner();
                    aimvoe(board);
                    count++;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[1] == 2) {
                    board[1] = 0;
                    btn2.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[2] == 2) {
                    board[2] = 0;
                    btn3.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[3] == 2) {
                    board[3] = 0;
                    btn4.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[4] == 2) {
                    board[4] = 0;
                    btn5.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[5] == 2) {
                    board[5] = 0;
                    btn6.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[6] == 2) {
                    board[6] = 0;
                    btn7.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[7] == 2) {
                    board[7] = 0;
                    btn8.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (board[8] == 2) {
                    board[8] = 0;
                    btn9.setImageResource(R.drawable.xcopy);
                    count++;
                    checkwinner();
                    aimvoe(board);
                }
            }
        });
    }
    private void delay(int n){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(n==0) {
                    btn1.setImageResource(R.drawable.ocopy);
                }
                if(n==1){
                    btn2.setImageResource(R.drawable.ocopy);
                }
                if(n==2){
                    btn3.setImageResource(R.drawable.ocopy);
                }
                if(n==4){
                    btn5.setImageResource(R.drawable.ocopy);
                }
                if(n==5){
                    btn6.setImageResource(R.drawable.ocopy);
                }
                if(n==6){
                    btn7.setImageResource(R.drawable.ocopy);
                }
                if(n==7){
                    btn8.setImageResource(R.drawable.ocopy);
                }
                if(n==8){
                    btn9.setImageResource(R.drawable.ocopy);
                }
                if(n==1){
                    btn2.setImageResource(R.drawable.ocopy);
                }
            }
        },200);
    }
    public void aimvoe(int board[]){
        bestmove=findBestMove(board);
        if(bestmove==0){
            if(board[0]==2){
                delay(0);
                board[0]=1;
                checkwinner();
                count++;
            }
        }
        if(bestmove==1){
            if(board[1]==2){
                delay(1);
                board[1]=1;
                checkwinner();
                count++;
            }
        }
        if(bestmove==2){
            if(board[2]==2){
                delay(2);
                board[2]=1;
                checkwinner();
                count++;
            }
        }
        if(bestmove==3){
            if(board[3]==2){
                delay(3);
                board[3]=1;
                checkwinner();
                count++;
            }
        }
        if(bestmove==4){
            if(board[4]==2){
                delay(4);
                board[4]=1;
                checkwinner();
                count++;
            }
        }
        if(bestmove==5){
            if(board[5]==2){
                delay(5);
                board[5]=1;
                checkwinner();
                count++;
            }
        }
        if(bestmove==6){
            if(board[6]==2){
                delay(6);
                board[6]=1;
                checkwinner();
                count++;
            }
        }
        if(bestmove==7){
            if(board[7]==2){
                delay(7);
                board[7]=1;
                checkwinner();
                count++;
            }
        }if(bestmove==8){
            if(board[8]==2){
                delay(8);
                board[8]=1;
                checkwinner();
                count++;
            }
        }
        if(count>=9){
            Toast.makeText(this, "DRAW", Toast.LENGTH_SHORT).show();
            reset();
        }
    }
    private void delayy(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                oscoree.setText(String.valueOf(ocount));
                xscoree.setText(String.valueOf(xcount));
                reset();
            }
        },1000);
    }
        private void checkwinner () {
            if (board[0] == board[1] && board[1] == board[2] && board[0] != 2) {
                if (board[0] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[0] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
            }
            if (board[3] == board[4] && board[4] == board[5] && board[3] != 2) {
                if (board[3] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[3] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
            }
            if (board[6] == board[7] && board[7] == board[8] && board[6] != 2) {
                if (board[6] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[6] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
            }
            if (board[0] == board[3] && board[3] == board[6] && board[0] != 2) {
                if (board[6] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[6] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
            }
            if (board[1] == board[4] && board[4] == board[7] && board[1] != 2) {
                if (board[1] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[1] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
            }
            if (board[2] == board[5] && board[5] == board[8] && board[2] != 2) {
                if (board[2] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[2] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
            }
            if (board[0] == board[4] && board[4] == board[8] && board[0] != 2) {
                if (board[0] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[0] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
            }
            if (board[2] == board[4] && board[4] == board[6] && board[2] != 2) {
                if (board[2] == 1) {
                    Toast.makeText(this, "O WON", Toast.LENGTH_SHORT).show();
                    ocount++;
                    delayy();
                } else if (board[2] == 0) {
                    Toast.makeText(this, "X WON", Toast.LENGTH_SHORT).show();
                    xcount++;
                    delayy();
                }
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
        board=new int[]{2,2,2,2,2,2,2,2,2};
        count=0;
    }
    public int findBestMove(int[] board) {
        int bestVal = Integer.MIN_VALUE;

        move=0;
        // Traverse all cells, evaluate minimax function for all empty cells
        for (int i = 0; i < 9; i++) {
            // Check if cell is empty
            if (board[i] == 2) {
                // Make the move
                board[i] = 1;

                // Compute evaluation function for this move
                int moveVal = minimax(board, 0, false);

                // Undo the move
                board[i] = 2;

                // Update the best move if needed
                if (moveVal > bestVal) {
                    move=i;
                    bestVal = moveVal;
                }
            }
        }
        return move;
    }

    private static int minimax(int[] board, int depth, boolean isMaximizing) {
        int score = evaluate(board);

        // If the game is over, return the score
        if (score != 0) {
            return score;
        }

        // If there are no more moves, it's a draw
        if (isBoardFull(board)) {
            return 0;
        }

        // If it's the maximizing player's turn
        if (isMaximizing) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 9; i++) {
                if (board[i] == 2) {
                    board[i] = 1;
                    best = Math.max(best, minimax(board, depth + 1, false));
                    board[i] = 2;
                }
            }
            return best;
        } else {
            // If it's the minimizing player's turn
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 9; i++) {
                if (board[i] == 2) {
                    board[i] = 0;
                    best = Math.min(best, minimax(board, depth + 1, true));
                    board[i] = 2;
                }
            }
            return best;
        }
    }

    private static int evaluate(int[] board) {
        // Check rows, columns, and diagonals for a win
        if(board[0]==board[1] && board[1]==board[2]){
            if(board[0]==1){
                return 10;
            }else if(board[0]==0){
                return -10;
            }
        }
        if(board[3]==board[4] && board[4]==board[5]){
            if(board[3]==1){
                return 10;
            }else if(board[3]==0){
                return -10;
            }
        }
        if(board[6]==board[7] && board[7]==board[8]){
            if(board[6]==1){
                return 10;
            }else if(board[6]==0){
                return -10;
            }
        }
        if(board[0]==board[3] && board[3]==board[6]){
            if(board[6]==1){
                return 10;
            }else if(board[6]==0){
                return -10;
            }
        }
        if(board[1]==board[4] && board[4]==board[7]){
            if(board[1]==1){
                return 10;
            }else if(board[1]==0){
                return -10;
            }
        }
        if(board[2]==board[5] && board[5]==board[8]){
            if(board[2]==1){
                return 10;
            }else if(board[2]==0){
                return -10;
            }
        }
        if(board[0]==board[4] && board[4]==board[8]){
            if(board[0]==1){
                return 10;
            }else if(board[0]==0){
                return -10;
            }
        }
        if(board[2]==board[4] && board[4]==board[6]){
            if(board[2]==1){
                return 10;
            }else if(board[2]==0){
                return -10;
            }
        }

        // No winner
        return 0;
    }

    private static boolean isBoardFull(int[] board) {
        for (int i = 0; i < 9; i++) {
            if (board[i] == 2) {
                return false; // There is an empty cell
            }
        }
        return true; // The board is full
    }

}