package com.example.practiceex;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

import static android.app.Service.START_STICKY;

public class ServicesActivity extends AppCompatActivity {
        @Nullable
        public IBinder onBind(Intent intent) {
            return null;
        }
        public int onStartCommand(Intent intent, int flags, int startId) {
            // Let it continue running until it is stopped.
            Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
            return START_STICKY;
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
        }
    }