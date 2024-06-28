package com.showan.v7;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class top_frag extends Fragment {

    public static EditText editTextTop;
    public static EditText editTextButtom;

    TopFragment activityCommander;

    public interface TopFragment{
        public void changeText(String top, String bottom);
    }

    // Attaching the fragments in the main screen
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopFragment) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        editTextTop = (EditText) view.findViewById(R.id.editTextTop);
        editTextButtom = (EditText) view.findViewById(R.id.editTextBottom);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonClicked(view);
                    }
                }
        );

        return view;
    }

    public void buttonClicked(View view){
        activityCommander.changeText(editTextTop.getText().toString(), editTextButtom.getText().toString());
    }
}
