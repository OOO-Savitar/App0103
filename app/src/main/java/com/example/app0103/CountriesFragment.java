package com.example.app0103;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CountriesFragment extends Fragment {
    private CountriesViewModel countriesViewModel;
    private DetailsViewModel detailsViewModel;

    List<Country> countryList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        countriesViewModel = new ViewModelProvider(getActivity()).get(CountriesViewModel.class);
        detailsViewModel = new ViewModelProvider(getActivity()).get(DetailsViewModel.class);
        countryList = countriesViewModel.getCountryList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View country_view = inflater.inflate(R.layout.fragment_countries, container, false);

        ListView countriesListView = country_view.findViewById(R.id.countries_list_view);

        CustomCountryBaseAdapter customCountryBaseAdapter = new CustomCountryBaseAdapter(getContext(), countryList);
        countriesListView.setAdapter(customCountryBaseAdapter);

        return country_view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView countriesListView = view.findViewById(R.id.countries_list_view);

        countriesListView.setOnItemClickListener((adapterView, view1, i, l) -> {
            Country country = countryList.get(i);
            detailsViewModel.setCountry(country);
            getParentFragmentManager().beginTransaction().replace(R.id.countryFragmentView, CountriesDetailsFragment.class, null).addToBackStack(null).commit();
        });
    }
}