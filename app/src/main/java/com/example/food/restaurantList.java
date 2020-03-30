package com.example.food;

public class restaurantList {

    private String name;
    private double rating;
    private String location;
    private String cuisine;

    public restaurantList(String name, double rating, String location, String cuisine) {
        this.name = name;
        this.rating = rating;
        this.location = location;
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
