package com.showansimkhada.quiz;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Settings extends AppCompatActivity {

    TextView textView_Music;
    TextView textView_Sound;
    String[] state = {"ON", "OFF"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        textView_Music = (TextView) findViewById(R.id.textView_Music);
        textView_Sound = (TextView) findViewById(R.id.textView_Sound);
    }

    public void onMusicClick(View view)
    {
        // if true set the text to on
        if(textView_Music.getText() == state[0])
        {
            textView_Music.setText(state[1]);
        }
        // if false set the text to off
        else
        {
            textView_Music.setText(state[0]);
        }
    }

    public void onSoundClick(View view)
    {
        // if true set the text to on
        if(textView_Sound.getText() == state[0])
        {
            textView_Sound.setText(state[1]);
        }
        // if false set the text to off
        else
        {
            textView_Sound.setText(state[0]);
        }
    }

    public void onManageProfileClick(View view)
    {
        // make toast appear that the option is not available
        Toast.makeText(this, "NOT AVIALABLE STILL ON WORK", Toast.LENGTH_LONG).show();
    }

}
