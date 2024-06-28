package com.showan.v7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements top_frag.TopFragment {

    @Override
    public void changeText(String top, String bottom) {
        bottom_frag bf = (bottom_frag) getSupportFragmentManager().findFragmentById(R.id.fragBottom);
        bf.setText(top, bottom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
