package com.showansimkhada.quiz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.showansimkhada.quiz.Data.*;

// using the SQLiteQpenHelper as the super class to make the database to hold the score and the profiles
public class MyDB extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "data.db";

    // constructor for MyDB
    public MyDB(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        // creating the data table for the database
        final String SQL_CREATE_DATA_TABLE = "CREATE TABLE " + dataEntry.TABLE_NAME + "( " +
                dataEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                dataEntry.COLUMN_PROFILE + " TEXT NOT NULL, " +
                dataEntry.COLUMN_SCORE + " INTEGER NOT NULL" + ");";
        db.execSQL(SQL_CREATE_DATA_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        // for updating the database
        db.execSQL("DROP TABLE IF EXISTS " + dataEntry.TABLE_NAME);
        onCreate(db);
    }

}
