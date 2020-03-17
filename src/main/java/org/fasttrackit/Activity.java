package org.fasttrackit;

public class Activity {

    // instance variables
    String name;
    boolean inOut;
    public void playing(Animal animal , Adopter adopter) {
        System.out.println(" Mood level before playing: " + animal.moodLevel);

        animal.moodLevel += 5;

        System.out.println(adopter.name + " just played " + name + " with " + animal.name);

        System.out.println(" Mood level after playing: " + animal.moodLevel);
    }}
