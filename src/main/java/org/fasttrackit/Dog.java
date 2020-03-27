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
    public void feeling(Animal animal)
    {System.out.println("And if the dog is fed properly and his mood,which is: " + getMoodLevel() + ",is higher then his hunger,which is: " + getHungerLevel());

        if (getHungerLevel() < getMoodLevel()){
            System.out.println("George`s mood before feeding: " + getMoodLevel() + " and his hunger: " + getHungerLevel());
            setHungerLevel(getHungerLevel() -9);
            setMoodLevel(getMoodLevel() +18);
            System.out.println("George`s mood after feeding: " + getMoodLevel() + " and his hunger: " + getHungerLevel());
            System.out.println("Then he fawns :) ");}
        else{  System.out.println("Now he`ll be depressed and follow me everywhere and in the end,eat me :( ");}
    }}
