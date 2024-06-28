package com.showansimkhada.quiz;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int time = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // making the main activity layout as the splash screen with the help of handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu = new Intent(MainActivity.this, Menu.class);
                startActivity(menu);
                finish();
            }
        },time);
    }

}
