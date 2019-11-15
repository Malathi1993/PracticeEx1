package com.example.practiceex;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
        @SuppressLint("NewApi")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            Intent intent = getIntent();
            String msg = intent.getStringExtra(MainActivity.MESSAGE);
            int Int1 = intent.getIntExtra("int_id_1", 0);
            Bundle b = getIntent().getExtras();
            String str2 = b.getString("string2", "");
            int int2 = b.getInt("int_id_1");
            String toast = "Received Data : String – " + msg + "Integer – " + String.valueOf(Int1) + " \n " + "Received Data through Bundle : String – " + str2 + "Integer – " + String.valueOf(int2);
            Toast.makeText(this, toast, Toast.LENGTH_LONG).show();
        }
    }