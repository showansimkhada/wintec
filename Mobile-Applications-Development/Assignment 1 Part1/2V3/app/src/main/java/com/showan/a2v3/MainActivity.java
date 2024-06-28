package com.showan.a2v3;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

    ViewGroup mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (ViewGroup)findViewById(R.id.mainLayout);

        mainLayout.setOnTouchListener(
                new ConstraintLayout.OnTouchListener(){
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        moveButton();
                        return true;
                    }
                }
        );
    }

    public void moveButton(){
        View button = findViewById(R.id.button);

        mainLayout.setAnimation(button.getAnimation());
    }
}
