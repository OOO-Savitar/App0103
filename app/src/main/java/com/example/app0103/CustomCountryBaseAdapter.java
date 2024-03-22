package com.example.app0103;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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

        Glide.with(inflater.getContext()).load(inflater.getContext().getResources().getString(R.string.img_url)
                + country.getFlagImageCode() + ".png").into(holder.flagImage);
        Log.d("123", inflater.getContext().getResources().getString(R.string.img_url));
        holder.countryName.setText(country.getName());
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }


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
