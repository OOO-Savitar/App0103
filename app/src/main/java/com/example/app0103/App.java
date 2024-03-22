package com.example.app0103;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {
    public static App instance;
    private CountryDatabase countryDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        countryDatabase = Room.databaseBuilder(this, CountryDatabase.class, "CountryDatabase").allowMainThreadQueries().build();
    }

    public static App getInstance() {
        return instance;
    }

    public CountryDatabase getCountryDatabase() {
        return countryDatabase;
    }
}
