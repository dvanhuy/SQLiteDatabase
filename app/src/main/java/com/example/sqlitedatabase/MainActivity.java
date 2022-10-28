package com.example.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doCreateDB(){
        SQLiteDatabase database;
        database = openOrCreateDatabase("qlsinhvien.db",MODE_PRIVATE,null);
    }
}