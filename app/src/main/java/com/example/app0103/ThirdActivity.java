package com.example.app0103;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        findViewById(R.id.buttonGoToFirst).setOnClickListener(view -> {
            Intent intentFirstPage = new Intent(ThirdActivity.this, FirstActivity.class);
            intentFirstPage.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intentFirstPage);
            finish();
        });
    }
}