package org.fasttrackit;


public class Animal  {

    // instance variables
    String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int moodLevel;
    String breed;
    String favoriteActivity;
    boolean illness;
    //Aggregation
    FriendsForAnimal friends;
    String favoriteFood;
    int feetLegs;
    boolean fur;

    public Animal(String name, int healthLevel, int hungerLevel, int moodLevel) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
    }
}
