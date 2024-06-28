package com.example.dylan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import java.util.ArrayList;

public class index extends AppCompatActivity {

    public static int Count;

    Button armbutton;
    Button legbutton;
    Button chestbutton;
    Button backbutton;
    public static int detailssize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

       armbutton = findViewById(R.id.armButton);
       legbutton = findViewById(R.id.legButton);
       chestbutton = findViewById(R.id.chestButton);
       backbutton = findViewById(R.id.backmbutton);

    }
    public void onClick(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    @Override
    public void onBackPressed() {
        // do something on back.
        return;
    }

    public void onArmsClick(View view)
    {
        Intent intent = new Intent(index.this, workout.class);

        ArrayList<workoutitem> details = new ArrayList<>();
        details.add(new workoutitem(R.drawable.dumbbellext, R.drawable.dumbbellext1));
        details.add(new workoutitem(R.drawable.closegripd, R.drawable.closegripw));
        details.add(new workoutitem(R.drawable.concentrailcurld, R.drawable.concentrailcurlw));
        details.add(new workoutitem(R.drawable.curld, R.drawable.curlw));
        details.add(new workoutitem(R.drawable.hammercurld, R.drawable.hammercurlw));
        details.add(new workoutitem(R.drawable.triceppressd, R.drawable.triceppressw));

      intent.putParcelableArrayListExtra(workout.DESCRIPTION, details);
      intent.putExtra(workout.TITLE, "Arm workouts");
      Count =  details.size();

      startActivity(intent); // startActivity allow you to move
    }

    public void onLegClick(View view)
    {
        Intent intent = new Intent(index.this,
                workout.class);


        ArrayList<workoutitem> details = new ArrayList<>();
        details.add(new workoutitem(R.drawable.calfcurdd, R.drawable.calfcurlw));
        details.add(new workoutitem(R.drawable.calfraised, R.drawable.calfraisew));
        details.add(new workoutitem(R.drawable.legextensionsd, R.drawable.legextentionw));
        details.add(new workoutitem(R.drawable.legpresss, R.drawable.legpressw));
        details.add(new workoutitem(R.drawable.squatd, R.drawable.squatw));
        details.add(new workoutitem(R.drawable.deadliftw, R.drawable.deadliftw));

        intent.putParcelableArrayListExtra(workout.DESCRIPTION, details);
        intent.putExtra(workout.TITLE, "Leg workouts");
        Count = details.size();

        startActivity(intent); // startActivity allow you to move
    }
    public void onBackClick(View view)
    {
        Intent intent = new Intent(index.this,
                workout.class);


        ArrayList<workoutitem> details = new ArrayList<>();
        details.add(new workoutitem(R.drawable.bendrowd, R.drawable.bendrowd));
        details.add(new workoutitem(R.drawable.dumbrowd, R.drawable.dumbroww));
        details.add(new workoutitem(R.drawable.reverselatd, R.drawable.reverselatw));
        details.add(new workoutitem(R.drawable.seatrowd, R.drawable.seatroww));
        details.add(new workoutitem(R.drawable.shrugd, R.drawable.shrugw));
        details.add(new workoutitem(R.drawable.vbard, R.drawable.vbarw));

        intent.putParcelableArrayListExtra(workout.DESCRIPTION, details);
        intent.putExtra(workout.TITLE, "Back workouts");
        Count = details.size();

        startActivity(intent); // startActivity allow you to move
    }

    public void onChestClick(View view)
    {
        Intent intent = new Intent(index.this,
                workout.class);


        ArrayList<workoutitem> details = new ArrayList<>();
        details.add(new workoutitem(R.drawable.benchd, R.drawable.benchw));
        details.add(new workoutitem(R.drawable.declinedumbpressd, R.drawable.declinedumbpressw));
        details.add(new workoutitem(R.drawable.declinepressd, R.drawable.declinepressw));
        details.add(new workoutitem(R.drawable.dipd, R.drawable.dipw));
        details.add(new workoutitem(R.drawable.inclineflyd, R.drawable.inclineflyw));
        details.add(new workoutitem(R.drawable.inclinepressd, R.drawable.inclinepressw));

        intent.putParcelableArrayListExtra(workout.DESCRIPTION, details);
        intent.putExtra(workout.TITLE, "Chest workouts");
        Count = details.size();

        startActivity(intent); // startActivity allow you to move
    }
}
