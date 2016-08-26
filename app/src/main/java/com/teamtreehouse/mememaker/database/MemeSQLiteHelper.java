package com.teamtreehouse.mememaker.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Evan Anger on 8/17/14.
 */
public class MemeSQLiteHelper extends SQLiteOpenHelper  {

    public static final String DB_NAME = "memes.db";
    public static final int DB_VERSION = 1;

    public MemeSQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
}
