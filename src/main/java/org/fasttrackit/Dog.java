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

    public boolean isBite() {
        return bite;
    }

    public void setBite(boolean bite) {
        this.bite = bite;
    }

    public int getTrainingLessons() {
        return trainingLessons;
    }

    public void setTrainingLessons(int trainingLessons) {
        this.trainingLessons = trainingLessons;
    }

    public int getToys() {
        return toys;
    }

    public void setToys(int toys) {
        this.toys = toys;
    }
}
