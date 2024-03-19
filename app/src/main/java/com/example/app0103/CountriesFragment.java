package com.example.app0103;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CountriesFragment extends Fragment {
    List<Country> countryList = new ArrayList<>();

    String[] countryNames = {
            "Indiana", "China", "Australia", "Portugal", "USA", "New Zealand",
            "Canada", "Brazil", "Japan", "Germany", "United Kingdom", "France",
            "Italy", "Russia", "South Korea", "Spain", "Mexico", "Indonesia",
            "Netherlands", "Switzerland", "Saudi Arabia", "Sweden", "Turkey"
    };

    String[] countryCapitals = {
            "Indianapolis", "Beijing", "Canberra", "Lisbon", "Washington, D.C.", "Wellington",
            "Ottawa", "Brasilia", "Tokyo", "Berlin", "London", "Paris",
            "Rome", "Moscow", "Seoul", "Madrid", "Mexico City", "Jakarta",
            "Amsterdam", "Bern", "Riyadh", "Stockholm", "Ankara"
    };

    double[] countryAreas = {
            94430, 9596960, 7692024, 92090, 9833517, 270467,
            9984670, 8515767, 377975, 357022, 242495, 551695,
            301340, 17098242, 100363, 505990, 1964375, 1904569,
            41543, 41284, 2149690, 2149690, 783356
    };


    int[] countryImages = {
            R.drawable.india, R.drawable.china, R.drawable.australia,
            R.drawable.portugal, R.drawable.united_states, R.drawable.new_zealand,
            R.drawable.canada, R.drawable.brazil, R.drawable.japan, R.drawable.germany,
            R.drawable.united_kingdom, R.drawable.france, R.drawable.italy, R.drawable.russia,
            R.drawable.south_korea, R.drawable.spain, R.drawable.mexico, R.drawable.indonesia,
            R.drawable.netherlands, R.drawable.switzerland, R.drawable.saudi_arabia,
            R.drawable.sweden, R.drawable.turkey
    };

    //
    public static CountriesFragment newInstance(String param1, String param2) {
        CountriesFragment fragment = new CountriesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for (int i = 0; i < countryNames.length; i++) {
            countryList.add(new Country(countryNames[i], countryImages[i], countryCapitals[i], countryAreas[i]));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view1 = inflater.inflate(R.layout.fragment_countries, container, false);
        RecyclerView listView = (RecyclerView) view1.findViewById(R.id.countriesListView);

        CustomCountryBaseAdapter.OnCountryClickListener countryClickListener = (country, position) -> {
            Intent intent = new Intent(getActivity(), CountryActivityView.class);
            intent.putExtra(Country.class.getSimpleName(), countryList.get(position));
            startActivity(intent);
        };

        CustomCountryBaseAdapter customCountryBaseAdapter = new CustomCountryBaseAdapter(getActivity(), countryList, countryClickListener);

        listView.setAdapter(customCountryBaseAdapter);
        return view1;
    }
}