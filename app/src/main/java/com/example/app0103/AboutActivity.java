package com.example.app0103;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Log.d("About", "onCreate()");

        Button buttonCloseAbout = findViewById(R.id.buttonCloseAbout);

        buttonCloseAbout.setOnClickListener(view -> {
            Intent intent = new Intent(AboutActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("About", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("About", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("About", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("About", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("About", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("About", "onDestroy()");
    }
}