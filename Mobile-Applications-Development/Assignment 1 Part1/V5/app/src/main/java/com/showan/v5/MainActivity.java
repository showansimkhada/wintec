package com.showan.v5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating reference to the button
        Button button = (Button)findViewById(R.id.button);
        TextView textView = new TextView(this);
        button.setOnClickListener(
               new Button.OnClickListener() {
                   public void onClick(View v) {
                       TextView textView = (TextView)findViewById(R.id.textView);
                       textView.setText("Tapped");
                   }
               }
        );
        button.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View V){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setText("Long Click");
                        return false;
                    }
                }
        );
    }
}
