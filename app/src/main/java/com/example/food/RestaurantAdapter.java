package com.example.food;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private ArrayList<Restaurant> mRestaurants;
    private RecyclerViewClickListener mListener;

    //RestaurantAdapter Constructor
    public RestaurantAdapter(ArrayList<Restaurant> restaurants, RecyclerViewClickListener listener) {
        mRestaurants = restaurants;
        mListener = listener;
    }

    //RecyclerViewClick Listener interface
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }

    //Static RestViewHolder class
    public static class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mName, mRating, mLocation, mCuisine;
        private RecyclerViewClickListener mListener;

        public RestaurantViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            mListener = listener;
            v.setOnClickListener(this);
            mName = v.findViewById(R.id.mName);
            mRating = v.findViewById(R.id.mRating);
            mLocation = v.findViewById(R.id.mLocation);
            mCuisine = v.findViewById(R.id.mCuisine);
        }

        //onClick method from RecyclerViewClickListener interface
        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
        }
    }

    //Creates RestViewHolder (layout object) and sets it
    @Override
    public RestaurantAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_adapter, parent, false);
        return new RestaurantViewHolder(v, mListener);
    }

    //Sets values for XML elements
    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        Restaurant restaurant = mRestaurants.get(position);


        //Changes the elements of the holder view
        holder.mName.setText(restaurant.getName());
        holder.mRating.setText(String.format("%,.1f", restaurant.getRating()));
        holder.mLocation.setText(restaurant.getLocation());
        holder.mCuisine.setText(restaurant.getCuisine());

    }

    //Needed for RecyclerView
    @Override
    public int getItemCount() {
        return mRestaurants.size();
    }

}