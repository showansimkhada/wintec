package com.kirankarki.assgnment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Distance extends AppCompatActivity {

    TextView editText_valueDistance;
    TextView textView_type_distance;
    TextView textView_convert_to;
    TextView textView_result_distance;

    double value;
    double result;
    String[] type = {"KILOMETER", "MILE"};
    String[] convert = {"TO MILE", "TO KILOMETER"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        editText_valueDistance = (TextView)findViewById(R.id.editText_valueDistance);
        textView_type_distance = (TextView) findViewById(R.id.textView_type_distance);
        textView_convert_to = (TextView)findViewById(R.id.textView_convert_to);
        textView_result_distance = (TextView)findViewById(R.id.textView_result_distance);

        textView_type_distance.setText(type[0]);
        textView_convert_to.setText(convert[0]);
    }

    public void changeType(View view)
    {
        if(textView_type_distance.getText() == type[0])
        {
            textView_type_distance.setText(type[1]);
            textView_convert_to.setText(convert[1]);
        }
        else
        {
            textView_type_distance.setText(type[0]);
            textView_convert_to.setText(convert[0]);
        }
    }

    public void onClickConvert(View view)
    {
        value = Double.parseDouble(editText_valueDistance.getText().toString());
        if (value == 0)
        {
            return;
        }
        if (textView_convert_to.getText() == convert[0])
        {
            result = value * 0.62137119;
            textView_result_distance.setText(String.valueOf(result));
        }
        else
        {
            result = value / 0.62137119;
            textView_result_distance.setText(String.valueOf(result));
        }
    }

}
