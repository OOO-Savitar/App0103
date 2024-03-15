package com.example.app0103;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DetailsViewModel extends ViewModel {
    private final MutableLiveData<Country> country = new MutableLiveData<>();

    public MutableLiveData<Country> getCountry() {
        return country;
    }

    public void setCountry(Country newCountry) {
        country.setValue(newCountry);
    }
}
