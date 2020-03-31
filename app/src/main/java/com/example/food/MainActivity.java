package com.example.food;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    RestaurantAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Changes the title of the action bar to "Send Foodz"
        getSupportActionBar().setTitle("Send Foodz");
        ArrayList<Restaurant> list = RestaurantList.getRestaurantList();

// Manages the RecyclerView layout
        mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
//Sets a ClickListener for RecyclerView
        listener = new RestaurantAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
            }
        };
//Displays the restaurant list through the RecyclerViewClickListener
        mAdapter = new RestaurantAdapter(list, listener);
        mRecyclerView.setAdapter(mAdapter);



    }
}
