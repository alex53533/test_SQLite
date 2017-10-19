package com.example.alex.testsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoresView;
    private  DatabaseManager databaseManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoresView = (TextView) findViewById( R.id.scoresView);
        databaseManager = new DatabaseManager(this);

//        databaseManager.insertScore( "Titine", 450);
//        databaseManager.insertScore( "Dodo", 750);
//        databaseManager.insertScore( "Lolo", 360);
          databaseManager.insertScore( "Ju", 550);

        databaseManager.close();
    }
}
