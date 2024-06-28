package com.example.dylan.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class workout extends AppCompatActivity {

    public static final String TITLE = "com.example.dylan.myapplication.workout.TITLE";
    public static final String DESCRIPTION = "com.example.dylan.myapplication.workout.DESCRIPTION";
    ViewPager viewPager;

    private int num = 0;

    Button nextButton;
    Button prevButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        String title = getIntent().getStringExtra(TITLE);
        TextView titleTextView = findViewById(R.id.workOutTitle);
        titleTextView.setText(title);
        viewPager = findViewById(R.id.viewPager);

        nextButton = (Button) findViewById(R.id.nextButton);
        prevButton = (Button) findViewById(R.id.prevButton);

        ArrayList<workoutitem> details = getIntent().getParcelableArrayListExtra(DESCRIPTION);
        pageAdapter viewPagerAdapter;
        viewPagerAdapter = new pageAdapter(this, details.get(num));
        viewPager.setAdapter(viewPagerAdapter);
        num++;
    }


    public void onNextClick(View view){
        if(num >= index.Count)
        {
            nextButton.setEnabled(false);
        }
        else
        {
            ArrayList<workoutitem> details = getIntent().getParcelableArrayListExtra(DESCRIPTION);
            pageAdapter viewPagerAdapter;
            viewPagerAdapter = new pageAdapter(this, details.get(num));
            viewPager.setAdapter(viewPagerAdapter);
            num++;
        }
    }

    public void onPrevClick(View view){
        if(num == 0)
        {
//            nextButton.setEnabled(false);
        }
        else
        {
            ArrayList<workoutitem> details = getIntent().getParcelableArrayListExtra(DESCRIPTION);
            pageAdapter viewPagerAdapter;
            viewPagerAdapter = new pageAdapter(this, details.get(num));
            viewPager.setAdapter(viewPagerAdapter);
//            nextButton.setEnabled(true);
            num++;
        }
    }

}
