package com.example.app0103;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Country implements Serializable {
    private final String name;

    private final int flagId;

    private final String capital;

    private final double area;

    public Country(String name, int flagId, String capital, double area) {
        this.name = name;
        this.flagId = flagId;
        this.capital = capital;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getFlagId() {
        return flagId;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

}
