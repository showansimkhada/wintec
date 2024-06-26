package com.showan.a2v4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Apples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apples);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, Samsung.class);
        final EditText appleInput = (EditText)findViewById(R.id.appleInput);
        String userMessage = appleInput.getText().toString();
        i.putExtra("appleMessage", userMessage);
        startActivity(i);
    }
}
