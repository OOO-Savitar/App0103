package com.example.app0103;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomCountryBaseAdapter extends BaseAdapter {

    private Context context;

    private List<Country> countryList;

    public CustomCountryBaseAdapter(Context context, List<Country> countryList) {
        this.context = context;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int i) {
        return countryList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_country_list_view, viewGroup, false);
        }

        Country country = (Country) getItem(i);

        TextView textView = view.findViewById(R.id.countryName);
        ImageView imageView = view.findViewById(R.id.countryFlag);

        textView.setText(country.getName());
        imageView.setImageResource(country.getFlagId());

        return view;
    }
}
