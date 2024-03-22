package com.example.app0103;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Country.class}, version = 1)
public abstract class CountryDatabase extends RoomDatabase {
    public abstract CountryDao countryDao();
}