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
        Bundle bundle = new Bundle();
        bundle.putSerializable("country", country);

        getSupportFragmentManager().beginTransaction().replace(R.id.countryFragmentView, CountriesDetailsFragment.class, bundle).addToBackStack(null).commit();
    }
}