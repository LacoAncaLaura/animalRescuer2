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

    @Override
    public void feeling(Animal animal) {
        System.out.println("And if the dog fed properly and his moodLevel which is: " + getMoodLevel());
        System.out.println("Is higher then his hungerLevel which is:" + getHungerLevel());
        if (getHungerLevel() > getMoodLevel()){
            setHungerLevel(getHungerLevel() -4);
            setMoodLevel(getMoodLevel() +10);
            System.out.println("Now he`ll be depressed and follow me everywhere and in the end,eat me :( ");
            }
        else{System.out.println("Then he fawns :) "); }
    }}
