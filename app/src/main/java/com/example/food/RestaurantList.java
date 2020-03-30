package com.example.food;

import java.util.ArrayList;

public class RestaurantList {

    public static ArrayList<Restaurant> getRestaurantList() {
        ArrayList<Restaurant> restaurantLists = new ArrayList();
        restaurantLists.add(getClassicBurgers());
        restaurantLists.add(getMcdonalds());
        restaurantLists.add(getKFC());
        restaurantLists.add(getHJ());
        restaurantLists.add(getGiaHoi());
        restaurantLists.add(getSakura());
        restaurantLists.add(getSubway());
        restaurantLists.add(getRedPepper());
        restaurantLists.add(getDominos());
        restaurantLists.add(getAn());
        return restaurantLists;
    }

    public static Restaurant getClassicBurgers() {
        String name = "Classic Burgers";
        double rating = 4.8;
        String location = "564 Hume Hwy YAGOONA 2199";
        String cuisine = "Burgers, American";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getMcdonalds() {
        String name = "Mcdonald's";
        double rating = 4.5;
        String location = "872 Hume Hwy BASS HILL 2197";
        String cuisine = "Fast Food, Burgers";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getKFC() {
        String name = "KFC";
        double rating = 4.3;
        String location = "538 Hume Hwy YAGOONA 2199";
        String cuisine = "Fast Food, Fried Chicken";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getHJ() {
        String name = "Hungry Jack's";
        double rating = 4.5;
        String location = "739 Hume Hwy BASS HILL 2197";
        String cuisine = "Fast Food, Burgers";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getGiaHoi() {
        String name = "Gia Hoi Restaurant";
        double rating = 4.0;
        String location = "299 Chapel Rd BANKSTOWN 2200";
        String cuisine = "Vietnamese";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getSakura() {
        String name = "Sakura Fresh Sushi";
        double rating = 4.6;
        String location = "2/23 Selems Parade, REVESBY 2212";
        String cuisine = "Japanese, Sushi";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getSubway() {
        String name = "Subway";
        double rating = 3.5;
        String location = "564 Hume Hwy YAGOONA 2199";
        String cuisine = "Healthy, Sandwich";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getRedPepper() {
        String name = "Red Pepper Bistro";
        double rating = 4.0;
        String location = "19 Morwick St STRATHFIELD 2135";
        String cuisine = "Korean, Fried Chicken";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getDominos() {
        String name = "Domino's Pizza";
        double rating = 3.7;
        String location = "2/872 Hume Hwy BASS HILL 2197";
        String cuisine = "Fast Food, Pizza";
        return new Restaurant(name, rating, location, cuisine);
    }

    public static Restaurant getAn() {
        String name = "An Restaurant";
        double rating = 4.0;
        String location = "27 Greenfield Parade BANKSTOWN 2200";
        String cuisine = "Vietnamese";
        return new Restaurant(name, rating, location, cuisine);
    }
}
