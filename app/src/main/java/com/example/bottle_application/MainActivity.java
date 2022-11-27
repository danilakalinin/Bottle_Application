package com.example.bottle_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView bottle;
    RelativeLayout back;
    Random random;

    int lastPos;
    int rounds;
    boolean flagBottleSpin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        random = new Random();
        back = (RelativeLayout) findViewById(R.id.back);
        bottle = (ImageView) findViewById(R.id.bottle);
        rounds = 5;
    }

    public void spinBottle(View view){
        if(!flagBottleSpin) {

            int kol = random.nextInt(360);
            float x = bottle.getWidth() / 2;
            float y = bottle.getHeight() / 2;

            Animation rotate = new RotateAnimation(lastPos, kol + rounds * 360, x, y);
            rotate.setDuration(6500);
            rotate.setFillAfter(true);
            rotate.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {
                    flagBottleSpin = true;
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    flagBottleSpin = false;
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });


            bottle.startAnimation(rotate);
            lastPos = kol;
        }
    }


    public void clickBack_02(View view) {
        back.setBackgroundResource(R.drawable.background_2);
    }
    public void clickBack_03(View view) {
        back.setBackgroundResource(R.drawable.background_3);
    }
    public void clickBack_04(View view) {
        back.setBackgroundResource(R.drawable.background_4);
    }
    public void clickBack_05(View view) {
        back.setBackgroundResource(R.drawable.background_5);
    }
    public void clickBack_06(View view) {
        back.setBackgroundResource(R.drawable.background_6);
    }

    public void setBottle_2(View view) {
        bottle.setImageResource(R.drawable.bottle_2);
    }
    public void setBottle_3(View view) {
        bottle.setImageResource(R.drawable.bottle_3);
    }
    public void setBottle_4(View view) {
        bottle.setImageResource(R.drawable.bottle_4);
    }
    public void setBottle_5(View view) {
        bottle.setImageResource(R.drawable.bottle_5);
    }
}
