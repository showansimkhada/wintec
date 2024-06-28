package com.showan.a2v4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Samsung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung);

        Bundle appleData = getIntent().getExtras();
        if(appleData == null){
            return;
        }
        String appleMessage = appleData.getString("appleMessage");
        final TextView samsungText = (TextView)findViewById(R.id.samsungText);
        samsungText.setText(appleMessage);
    }
}
