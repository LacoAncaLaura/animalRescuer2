package org.fasttrackit;

//"is-a" relationship/inheritance

public class Cat extends Animal {

    int purrs;
    boolean noisy;

    public Cat (String name, int healthLevel, int hungerLevel, int moodLevel) {
        super(name , healthLevel , hungerLevel , moodLevel);

    }
}
