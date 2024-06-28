package com.kirankarki.assgnment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Weight extends AppCompatActivity
{

    TextView editText_value;
    TextView textView_type;
    TextView textView_convert;
    TextView textView_result;

    double value;
    double result;
    String[] type = {"KILOGRAM", "POUND"};
    String[] convert = {"TO POUND", "TO KILOGRAM"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        editText_value = (TextView)findViewById(R.id.editText_value);
        textView_type = (TextView) findViewById(R.id.textView_type);
        textView_convert = (TextView)findViewById(R.id.textView_convert);
        textView_result = (TextView)findViewById(R.id.textView_result);

        textView_type.setText(type[0]);
        textView_convert.setText(convert[0]);
    }

    public void changeType(View view)
    {
        if(textView_type.getText() == type[0])
        {
            textView_type.setText(type[1]);
            textView_convert.setText(convert[1]);
        }
        else
        {
            textView_type.setText(type[0]);
            textView_convert.setText(convert[0]);
        }
    }

    public void onClickConvert(View view)
    {
        value = Double.parseDouble(editText_value.getText().toString());
        if (value == 0)
        {
            return;
        }
        if (textView_convert.getText() == convert[0])
        {
            result = value * 2.20462262;
            textView_result.setText(String.valueOf(result));
        }
        else
        {
            result = value / 2.20462262;
            textView_result.setText(String.valueOf(result));
        }
    }

}
