package com.showansimkhada.quiz;

import android.provider.BaseColumns;

// data class to store the information of the data
public class Data {

    // constructor for the sql database
    public static final class dataEntry implements BaseColumns
    {
        public static final String TABLE_NAME = "data";
        public static final String COLUMN_PROFILE = "profile";
        public static final String COLUMN_SCORE = "score";
    }
}
