package com.example.app0103;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomCountryBaseAdapter extends RecyclerView.Adapter<CustomCountryBaseAdapter.MyViewHolder> {

    interface OnCountryClickListener {
        void onCountryClick(Country country, int position);
    }

    private OnCountryClickListener onClickListener;
    private final List<Country> countryList;
    LayoutInflater inflater;

    public CustomCountryBaseAdapter(Context context, List<Country> countryList, OnCountryClickListener onCountryClickListener) {
        this.onClickListener = onCountryClickListener;
        this.countryList = countryList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.activity_country_list_view, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Country country = countryList.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.onCountryClick(country, position);
            }
        });

        holder.flagImage.setImageResource(country.getFlagId());
        holder.countryName.setText(country.getName());
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

//    @Override
//    public int getCount() {
//        return countryList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return countryList.get(i);
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return i;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        if (view == null) {
//            view = LayoutInflater.from(context).inflate(R.layout.activity_country_list_view, viewGroup, false);
//        }
//
//        Country country = (Country) getItem(i);
//
//        TextView textView = view.findViewById(R.id.countryName);
//        ImageView imageView = view.findViewById(R.id.countryFlag);
//
//        textView.setText(country.getName());
//        imageView.setImageResource(country.getFlagId());
//
//        return view;
//    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView flagImage;
        TextView countryName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.countryName = itemView.findViewById(R.id.countryName);
            this.flagImage = itemView.findViewById(R.id.countryFlag);
        }
    }
}
