package com.example.app0103;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Main", "onCreate()");

        Button buttonOpenAbout = findViewById(R.id.buttonOpenAboutPage);
        buttonOpenAbout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Main", "onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main", "onDestroy()");
    }
}