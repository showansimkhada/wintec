package com.showan.v7;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class bottom_frag extends Fragment{

    public static TextView topTextInput;
    public static TextView bottomTextInput;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // creating the view in the screen
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);

        topTextInput = (TextView) view.findViewById(R.id.topTextInput);
        bottomTextInput = (TextView) view.findViewById(R.id.bottomTextInput);

        return view;
    }

    public void setText(String top, String bottom){
        // Setting the text in the picture used in the bottom fragment
        topTextInput.setText(top);
        bottomTextInput.setText(bottom);
    }
}
