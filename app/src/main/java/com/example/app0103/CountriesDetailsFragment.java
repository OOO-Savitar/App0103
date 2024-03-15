package com.example.app0103;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CountriesDetailsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries_details, container, false);

        view.findViewById(R.id.imageButtomBack).setOnClickListener(view1 -> {
            CountriesFragment countriesFragment = new CountriesFragment();
            getParentFragmentManager().beginTransaction().replace(R.id.countryFragmentView, countriesFragment).commit();
        });

        assert getArguments() != null;
        Country country = (Country) getArguments().getSerializable("country");

        assert country != null;
        setSelectedItem(view, country);
        return view;
    }

    public void setSelectedItem(View view, Country country) {
        ImageView imageViewFlag = view.findViewById(R.id.countryViewFlag);
        TextView countryName = view.findViewById(R.id.countryViewName);
        TextView countryCapital = view.findViewById(R.id.countryViewCapital);
        TextView countryArea = view.findViewById(R.id.countryViewArea);

        assert country != null;
        imageViewFlag.setImageResource(country.getFlagId());
        countryName.setText(getResources().getString(R.string.country) + country.getName());
        countryCapital.setText(getResources().getString(R.string.capital) + country.getCapital());
        countryArea.setText(getResources().getString(R.string.area) + country.getArea() + " км²");
    }
}