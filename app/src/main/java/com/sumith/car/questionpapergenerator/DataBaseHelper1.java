package com.sumith.car.questionpapergenerator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sunith on 10-04-2018.
 */

public class DataBaseHelper1 extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Paper.db";
    public static final String TABLE_NAME = "Paper";
    public static final String COL_1 = "ID";
    public static final String COL_2="QUESTION";
    public DataBaseHelper1(Context context){
        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db1) {
        db1.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT ,QUESTION TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db1, int oldVersion, int newVersion) {
        db1.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
    }
    public boolean insertData(String question) {
        SQLiteDatabase db1 = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,question);
        long result = db1.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }
    public Cursor getAllData() {
        SQLiteDatabase db1 = this.getWritableDatabase();
        Cursor res = db1.rawQuery("SELECT * FROM " +TABLE_NAME, null);
        return res;

    }
    public Integer deleteData(String id)
    {
        SQLiteDatabase db1 = this.getWritableDatabase();
        int i= db1.delete(TABLE_NAME,"ID =?",new String[]{id});
        return i;
    }

}
