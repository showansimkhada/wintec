package com.kirankarki.assgnment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void weight(View view)
    {
        // on click
        Intent i = new Intent(this, Weight.class);
        startActivity(i);
    }

    public void distance(View view)
    {
        // on click
        Intent i = new Intent(this, Distance.class);
        startActivity(i);
    }

    public void quit(View view)
    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
