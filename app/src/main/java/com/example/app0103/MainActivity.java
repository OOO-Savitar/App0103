package com.example.app0103;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements CountriesFragment.OnFragmentSendDataListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSendData(Country country) {
        CountriesDetailsFragment countriesDetailsFragment = (CountriesDetailsFragment) getSupportFragmentManager().findFragmentById(R.id.countryDetailsFragmentView);

        if (countriesDetailsFragment != null) {
            countriesDetailsFragment.setSelectedItem(country);
        }
    }
}