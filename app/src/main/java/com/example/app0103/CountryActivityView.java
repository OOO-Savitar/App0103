package com.example.app0103;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryActivityView extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_view);

        Bundle arguments = getIntent().getExtras();

        Country country;
        if (arguments != null) {
            country = (Country) arguments.getSerializable(Country.class.getSimpleName());

            ImageView imageViewFlag = findViewById(R.id.countryViewFlag);
            TextView countryName = findViewById(R.id.countryViewName);
            TextView countryCapital = findViewById(R.id.countryViewCapital);
            TextView countryArea = findViewById(R.id.countryViewArea);

            imageViewFlag.setImageResource(country.getFlagId());
            countryName.setText(getResources().getString(R.string.country) + country.getName());
            countryCapital.setText(getResources().getString(R.string.capital) + country.getCapital());
            countryArea.setText(getResources().getString(R.string.area) + country.getArea() + " км²");
        }
    }
}