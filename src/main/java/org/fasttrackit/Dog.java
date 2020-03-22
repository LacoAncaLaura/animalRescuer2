package org.fasttrackit;

//"is-a" relationship/inheritance

public class Dog extends Animal {

    boolean bite;
    int trainingLessons;
    int toys;

    public Dog(String name, int healthLevel, int hungerLevel, int moodLevel , int trainingLessons) {
        super(name , healthLevel , hungerLevel , moodLevel);
        this.trainingLessons = trainingLessons;
    }
}
