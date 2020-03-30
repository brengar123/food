package com.example.food;

import java.util.ArrayList;

public class restaurants {

    public static ArrayList<restaurantList> getRestaurantList() {
        ArrayList<restaurantList> restaurantLists = new ArrayList();
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

    public static restaurantList getClassicBurgers() {
        String name = "Classic Burgers";
        double rating = 4.8;
        String location = "564 Hume Hwy YAGOONA 2199";
        String cuisine = "Burgers";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getMcdonalds() {
        String name = "Mcdonald's";
        double rating = 4.5;
        String location = "872 Hume Hwy BASS HILL 2197";
        String cuisine = "Fast Food";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getKFC() {
        String name = "KFC";
        double rating = 4.3;
        String location = "538 Hume Hwy YAGOONA 2199";
        String cuisine = "Fast Food";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getHJ() {
        String name = "Hungry Jack's";
        double rating = 4.5;
        String location = "739 Hume Hwy BASS HILL 2197";
        String cuisine = "Burgers";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getGiaHoi() {
        String name = "Gia Hoi Restaurant";
        double rating = 4.0;
        String location = "299 Chapel Rd BANKSTOWN 2200";
        String cuisine = "Vietnamese";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getSakura() {
        String name = "Sakura Fresh Sushi";
        double rating = 4.6;
        String location = "2/23 Selems Parade, REVESBY 2212";
        String cuisine = "Sushi";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getSubway() {
        String name = "Subway";
        double rating = 3.5;
        String location = "564 Hume Hwy YAGOONA 2199";
        String cuisine = "Sandwich";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getRedPepper() {
        String name = "Red Pepper Bistro";
        double rating = 4.0;
        String location = "19 Morwick St STRATHFIELD 2135";
        String cuisine = "Korean";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getDominos() {
        String name = "Domino's Pizza";
        double rating = 3.7;
        String location = "2/872 Hume Hwy BASS HILL 2197";
        String cuisine = "Pizza";
        return new restaurantList(name, rating, location, cuisine);
    }

    public static restaurantList getAn() {
        String name = "An Restaurant";
        double rating = 4.0;
        String location = "27 Greenfield Parade BANKSTOWN 2200";
        String cuisine = "Vietnamese";
        return new restaurantList(name, rating, location, cuisine);
    }
}
