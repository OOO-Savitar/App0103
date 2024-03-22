package com.example.app0103;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

@Entity
public class Country implements Serializable {
    @NotNull
    @PrimaryKey
    private final String name;

    private final String flagImageCode;

    private final String capital;

    private final double area;

    public Country(@NotNull String name, String flagImageCode, String capital, double area) {
        this.name = name;
        this.flagImageCode = flagImageCode;
        this.capital = capital;
        this.area = area;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public String getFlagImageCode() {
        return flagImageCode;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

}
