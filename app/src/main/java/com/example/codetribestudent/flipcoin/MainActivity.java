package com.example.codetribestudent.flipcoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView imgV;
    Random rand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgV=(ImageView) findViewById(R.id.Coin_flip);

    }

    public void FlipCoin(View view)
    {
            rand =new Random();

            int coinSide=rand.nextInt(2);

            if(coinSide==0){
                imgV.setImageResource(R.drawable.coin_head);
                Toast.makeText(this,"You have flipped a head ",Toast.LENGTH_LONG).show();
            }else{
                imgV.setImageResource(R.drawable.coin_tail);
                Toast.makeText(this,"You have flipped a tail ",Toast.LENGTH_LONG).show();
            }

            RotateAnimation rotate=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.5f);
            rotate.setDuration(1000);
            imgV.startAnimation(rotate);
    }

}
