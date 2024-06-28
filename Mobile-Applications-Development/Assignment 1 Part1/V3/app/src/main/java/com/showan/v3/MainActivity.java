package com.showan.v3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout Layout = new RelativeLayout(this);
        //Changing the layout colour
        Layout.setBackgroundColor(Color.GREEN);

        //Button
        Button redButton = new Button(this);
        //Adding text inside the button
        redButton.setText("Click Me!");
        redButton.setBackgroundColor(Color.RED);

        //Input
        EditText userName = new EditText(this);

        //Create id
        redButton.setId(1);
        userName.setId(2);

        //Creating the rules for arranging button in app
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams (
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Creating the rules for arranging the user Name
        RelativeLayout.LayoutParams userNameDetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //Adding the user Name above the button
        userNameDetails.addRule(RelativeLayout.ABOVE, redButton.getId());
        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userNameDetails.setMargins(0,0,0,50);

        //
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200, r.getDisplayMetrics());
        userName.setWidth(px);

        //Arranging the rule for button
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //Adding button to the layout
        Layout.addView(redButton, buttonDetails);
        Layout.addView(userName, userNameDetails);

        //Setting the content view in the app
        setContentView(Layout);
    }
}
