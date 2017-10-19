package com.example.alex.testsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.Date;  //get Date

/**
 * Created by alex on 19/10/17.
 */

public class DatabaseManager extends SQLiteOpenHelper{

    private static final  String  DATABASE_NAME = "Game.db";
    private static final int DATABASE_VERSION = 2;

    public DatabaseManager(Context context){
        super( context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
          String strSql = "create table T_Scores ("  //nom de la table
                        + "    idScore integer primary key autoincrement,"
                        + "    name text not null,"
                        + "    score interger not null,"
                        + "    when_ integer not null"
                        + ")";

        db.execSQL( strSql);
        Log.i("DATABASE ", "onCreate invoked");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
           String strSql = "alter table T_Scores";
        db.execSQL(strSql);
        this.onCreate( db );
        Log.i(" DATABASE", "onUpgrade invoked");
    }

    public void insertScore ( String name, int score){
        name = name.replace("'", "''");
        String strSql ="insert into T_Scores (name, score, when_ ) values ('"
                      + name + "', " + score + ", " + new Date().getTime() + ")";
        this.getWritableDatabase().execSQL(strSql);
        Log.i(" DATABASE", "insertScore invoked");

    }
}
