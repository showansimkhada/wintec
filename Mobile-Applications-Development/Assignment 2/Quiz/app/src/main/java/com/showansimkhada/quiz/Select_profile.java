package com.showansimkhada.quiz;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Select_profile extends AppCompatActivity{

    // creating the variables
    public static SQLiteDatabase editor;
    private RecyclerViewAdapter recyclerViewAdapter;
    private TextView editText_enter_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_profile);

        // creating the database
        MyDB myDB = new MyDB(this);
        editor = myDB.getWritableDatabase();

        editText_enter_profile = (EditText) findViewById(R.id.editText_enter_profile);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter = new RecyclerViewAdapter(this, getAllProfile());

        recyclerView.setAdapter(recyclerViewAdapter);

        // creating swipe in the recycler view
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder1) {
                return false;
            }

            // removing the profile by swiping right
            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
                removeProfile((long) viewHolder.itemView.getTag());
            }

            @Override
            public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
                super.onSelectedChanged(viewHolder, actionState);
            }

        }).attachToRecyclerView(recyclerView);

    }


    public void onCreateProfile(View view)
    {
        addData();
    }

    // adding data to the sql database
    private void addData()
    {
        if(editText_enter_profile.getText().toString().trim().length() == 0)
        {
            return;
        }

        int score = 0;
        ContentValues profile = new ContentValues();
        profile.put(Data.dataEntry.COLUMN_PROFILE, editText_enter_profile.getText().toString());
        profile.put(Data.dataEntry.COLUMN_SCORE, score);
        editor.insert(Data.dataEntry.TABLE_NAME, null, profile);
        recyclerViewAdapter.chageCursor(getAllProfile());
        editText_enter_profile.setText("");

    }

    private void removeProfile(long id)
    {
        editor.delete(Data.dataEntry.TABLE_NAME, Data.dataEntry._ID + "=" + id, null);

    }

    private Cursor getAllProfile()
    {
        // ordering in decreasing order
        return editor.query(Data.dataEntry.TABLE_NAME, null,
                null, null, null, null, Data.dataEntry.COLUMN_SCORE+ " DESC");
    }

    @Override
    public void onBackPressed()
    {
        Intent menu = new Intent(this, Menu.class);
        startActivity(menu);
    }
}
