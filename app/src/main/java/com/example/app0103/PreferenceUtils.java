package com.example.app0103;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceUtils {
    private static final String PREF_NAME = "MyPrefs";
    private static final String DATABASE_INITIALIZED = "database_initialized";

    public static boolean isDatabaseInitialized(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return prefs.getBoolean(DATABASE_INITIALIZED, false);
    }

    public static void setDatabaseInitialized(Context context, boolean initialized) {
        SharedPreferences.Editor editor = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putBoolean(DATABASE_INITIALIZED, initialized);
        editor.apply();
    }
}
