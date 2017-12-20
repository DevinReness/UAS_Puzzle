package com.example.devin.puzzle;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {
    TextView p1,p2;

    ImageView vi_11,vi_12,vi_13,vi_14,vi_21,vi_22,vi_23,vi_24,vi_31,vi_32,vi_33,vi_34;

    Integer[] cardArray = {101,102,103,104,105,106,201,202,203,204,205,206};

    int image101,image102,image103,image104,image105,image106,
    image201,image202,image203,image204,image205,image206;

    int card1,card2;
    int clickC1,clickC2;
    int cardNumber = 1;
    int turn = 1;
    int point1 = 0, point2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = (TextView)findViewById(R.id.p1);
        p2 = (TextView)findViewById(R.id.p2);

        vi_11 = (ImageView) findViewById(R.id.vi_11);
        vi_12 = (ImageView) findViewById(R.id.vi_12);
        vi_13 = (ImageView) findViewById(R.id.vi_13);
        vi_14 = (ImageView) findViewById(R.id.vi_14);
        vi_21 = (ImageView) findViewById(R.id.vi_21);
        vi_22 = (ImageView) findViewById(R.id.vi_22);
        vi_23 = (ImageView) findViewById(R.id.vi_23);
        vi_24 = (ImageView) findViewById(R.id.vi_24);
        vi_31 = (ImageView) findViewById(R.id.vi_31);
        vi_32 = (ImageView) findViewById(R.id.vi_32);
        vi_33 = (ImageView) findViewById(R.id.vi_33);
        vi_34 = (ImageView) findViewById(R.id.vi_34);

        vi_11.setTag("0");
        vi_12.setTag("1");
        vi_13.setTag("2");
        vi_14.setTag("3");
        vi_21.setTag("4");
        vi_22.setTag("5");
        vi_23.setTag("6");
        vi_24.setTag("7");
        vi_31.setTag("8");
        vi_32.setTag("9");
        vi_33.setTag("10");
        vi_34.setTag("11");

        //load card image
        frontOfCardR();

        //suffels card image
        Collections.shuffle(Arrays.asList(cardArray));

        //menganti warna player 2
        p2.setTextColor(Color.GRAY);

        vi_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_11,theCard);
            }
        });
        vi_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_12,theCard);
            }
        });
        vi_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_13,theCard);
            }
        });
        vi_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_14,theCard);
            }
        });
        vi_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_21,theCard);
            }
        });
        vi_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_22,theCard);
            }
        });
        vi_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_23,theCard);
            }
        });
        vi_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_24,theCard);
            }
        });
        vi_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_31,theCard);
            }
        });
        vi_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_32,theCard);
            }
        });
        vi_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_33,theCard);
            }
        });
        vi_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String)v.getTag());
                doStuff(vi_34,theCard);
            }
        });

    }
    private void doStuff (ImageView vi,int card){
        //set the corage image to the image view
        if(cardArray[card] == 101){
            vi.setImageResource(image101);
        }else if(cardArray[card] == 102){
            vi.setImageResource(image102);
        }else if(cardArray[card] == 103){
            vi.setImageResource(image103);
        }else if(cardArray[card] == 104){
            vi.setImageResource(image104);
        }else if(cardArray[card] == 105){
            vi.setImageResource(image105);
        }else if(cardArray[card] == 106){
            vi.setImageResource(image106);
        }else if(cardArray[card] == 201){
            vi.setImageResource(image201);
        }else if(cardArray[card] == 202){
            vi.setImageResource(image202);
        }else if(cardArray[card] == 203){
            vi.setImageResource(image203);
        }else if(cardArray[card] == 204){
            vi.setImageResource(image204);
        }else if(cardArray[card] == 205){
            vi.setImageResource(image205);
        }else if(cardArray[card] == 206){
            vi.setImageResource(image206);
        }

        if(cardNumber == 1){
            card1 = cardArray[card];
            if(card1 > 200){
                card1 = card1 - 100;
            }
            cardNumber = 2;
            clickC1 = card;

            vi.setEnabled(false);
        } else {
            if (cardNumber == 2) {
                card2 = cardArray[card];
                if (card2 > 200) {
                    card2 = card2 - 100;
                }
                cardNumber = 1;
                clickC2 = card;

                vi_11.setEnabled(false);
                vi_12.setEnabled(false);
                vi_13.setEnabled(false);
                vi_14.setEnabled(false);
                vi_21.setEnabled(false);
                vi_22.setEnabled(false);
                vi_23.setEnabled(false);
                vi_34.setEnabled(false);
                vi_31.setEnabled(false);
                vi_32.setEnabled(false);
                vi_33.setEnabled(false);
                vi_34.setEnabled(false);

                android.os.Handler handler = new android.os.Handler();{
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            calculate();
                        }
                    },1000);
                }

            }
        }
    }
    private void calculate (){
        if(card1 == card2){
            if(clickC1 == 0){
                vi_11.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 1){
                vi_12.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 2){
                vi_13.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 3){
                vi_14.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 4){
                vi_21.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 5){
                vi_22.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 6){
                vi_23.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 7){
                vi_24.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 8){
                vi_31.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 9){
                vi_32.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 10){
                vi_33.setVisibility(View.INVISIBLE);
            } else if(clickC1 == 11){
                vi_34.setVisibility(View.INVISIBLE);
            }

            if(clickC2 == 0){
                vi_11.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 1){
                vi_12.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 2){
                vi_13.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 3){
                vi_14.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 4){
                vi_21.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 5){
                vi_22.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 6){
                vi_23.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 7){
                vi_24.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 8){
                vi_31.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 9){
                vi_32.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 10){
                vi_33.setVisibility(View.INVISIBLE);
            } else if(clickC2 == 11){
                vi_34.setVisibility(View.INVISIBLE);
            }

            if(turn == 1){
                point1++;
                p1.setText("P1 : "+point1);
            }else if(turn == 2){
                point2++;
                p2.setText("P2 : "+point2);
            }
        }else {
            vi_11.setImageResource(R.drawable.mark);
            vi_12.setImageResource(R.drawable.mark);
            vi_13.setImageResource(R.drawable.mark);
            vi_14.setImageResource(R.drawable.mark);
            vi_21.setImageResource(R.drawable.mark);
            vi_22.setImageResource(R.drawable.mark);
            vi_23.setImageResource(R.drawable.mark);
            vi_24.setImageResource(R.drawable.mark);
            vi_31.setImageResource(R.drawable.mark);
            vi_32.setImageResource(R.drawable.mark);
            vi_33.setImageResource(R.drawable.mark);
            vi_34.setImageResource(R.drawable.mark);

            if(turn == 1){
                turn = 2;
                p1.setTextColor(Color.GRAY);
                p2.setTextColor(Color.BLACK);
            } else if(turn == 2){
                turn = 1;
                p2.setTextColor(Color.GRAY);
                p1.setTextColor(Color.BLACK);
            }
        }

        vi_11.setEnabled(true);
        vi_12.setEnabled(true);
        vi_13.setEnabled(true);
        vi_14.setEnabled(true);
        vi_21.setEnabled(true);
        vi_22.setEnabled(true);
        vi_23.setEnabled(true);
        vi_24.setEnabled(true);
        vi_31.setEnabled(true);
        vi_32.setEnabled(true);
        vi_33.setEnabled(true);
        vi_34.setEnabled(true);

        chekEnd();
    }
    private void chekEnd(){
        if( vi_11.getVisibility() == View.INVISIBLE &&
                vi_12.getVisibility() == View.INVISIBLE &&
                vi_13.getVisibility() == View.INVISIBLE &&
                vi_14.getVisibility() == View.INVISIBLE &&
                vi_21.getVisibility() == View.INVISIBLE &&
                vi_22.getVisibility() == View.INVISIBLE &&
                vi_23.getVisibility() == View.INVISIBLE &&
                vi_24.getVisibility() == View.INVISIBLE &&
                vi_31.getVisibility() == View.INVISIBLE &&
                vi_32.getVisibility() == View.INVISIBLE &&
                vi_33.getVisibility() == View.INVISIBLE &&
                vi_34.getVisibility() == View.INVISIBLE ){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage(" GAME OVER!\n P1 : "+point1+"\n P2 : "+point2)
                    .setCancelable(false).setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    finish();;
                }
            });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
    private void frontOfCardR (){

        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;
    }
}

