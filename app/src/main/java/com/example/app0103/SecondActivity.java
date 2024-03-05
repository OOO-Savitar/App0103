package com.example.app0103;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.buttonGoToThird).setOnClickListener(view -> {
            Intent intentThirdPage = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intentThirdPage);
        });
    }
}