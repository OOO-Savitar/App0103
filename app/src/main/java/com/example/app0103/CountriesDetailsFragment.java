package com.example.app0103;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
        View view1 = inflater.inflate(R.layout.fragment_countries_details, container, false);
        view1.findViewById(R.id.imageButton).setOnClickListener(view -> getActivity().findViewById(R.id.countryDetailsFragmentView).setVisibility(View.GONE));
        return view1;
    }

    public void setSelectedItem(Country country) {
        ImageView imageViewFlag = getView().findViewById(R.id.countryViewFlag);
        TextView countryName = getView().findViewById(R.id.countryViewName);
        TextView countryCapital = getView().findViewById(R.id.countryViewCapital);
        TextView countryArea = getView().findViewById(R.id.countryViewArea);

        assert country != null;
        imageViewFlag.setImageResource(country.getFlagId());
        countryName.setText(getResources().getString(R.string.country) + country.getName());
        countryCapital.setText(getResources().getString(R.string.capital) + country.getCapital());
        countryArea.setText(getResources().getString(R.string.area) + country.getArea() + " км²");
    }
}