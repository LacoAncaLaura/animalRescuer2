package org.fasttrackit;

//"is-a" relationship/inheritance

public class Cat extends Animal {

    int purrs;
    boolean noisy;

    public Cat (String name, int healthLevel, int hungerLevel, int moodLevel) {
        super(name , healthLevel , hungerLevel , moodLevel);

    }

    public int getPurrs() {
        return purrs;
    }

    public void setPurrs(int purrs) {
        this.purrs = purrs;
    }

    public boolean isNoisy() {
        return noisy;
    }

    public void setNoisy(boolean noisy) {
        this.noisy = noisy;
    }

    @Override
    public void feeling(Animal animal) {
        System.out.println("If the Cat fed properly and her moodLevel,which is: " + getMoodLevel() + " ,is higher then her hungerLevel,which is: " + getHungerLevel());
        if (getHungerLevel() < getMoodLevel()){
            System.out.println("Alice`s mood before feeding: " + getMoodLevel() + " and her hunger: " + getHungerLevel());
            setHungerLevel(getHungerLevel() -5);
            setMoodLevel(getMoodLevel() +3);
            System.out.println("Alice`s mood after feeding: " + getMoodLevel() + " and her hunger: " + getHungerLevel());
            System.out.println("Then she purrs :) ");}
        else{
            System.out.println("Now she`ll be depressed and die shortly of sadness :( ");
    }
}}
