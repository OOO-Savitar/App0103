package com.example.app0103;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findViewById(R.id.buttonGoToSecond).setOnClickListener(view -> {
            Intent intentSecondPage = new Intent(FirstActivity.this, SecondActivity.class);
            startActivity(intentSecondPage);
        });
    }
}