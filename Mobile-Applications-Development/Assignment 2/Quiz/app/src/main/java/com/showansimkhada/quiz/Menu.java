package com.showansimkhada.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public void onBackPressed() {
        // disabling the back button pressed
    }

    public void onPlayClick(View view)
    {
        // loading the class
        Intent select_profile = new Intent(this, Select_profile.class);
        startActivity(select_profile);
    }

    public void onSettingsClick(View view)
    {
        // loading the settings
        Intent settings = new Intent(this, Settings.class);
        startActivity(settings);
    }

    public void onExitClick(View view)
    {
        // kill the app
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}
