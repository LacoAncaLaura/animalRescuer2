package org.fasttrackit;

import javax.swing.*;

public class Adopter {

 // instance variables
    String name;
    double money;
    int age;
    boolean job;
    String gender;


    public void feeding(Animal animal,Food food){
        if (food.name.equals(animal.favoriteFood)){
            animal.moodLevel +=5;
        animal.favoriteFood +=1;}
        else{
            animal.moodLevel-=3;
        }
        System.out.println(" Hunger level before feeding: " + animal.hungerLevel);

        animal.hungerLevel -= 6;

        System.out.println(name + " just gave some " + food.name + " food to " + animal.name);

        System.out.println(" Hunger level after feeding: " + animal.hungerLevel);
    }
   // public void playing(Animal animal , Activity activity) {

//        System.out.println(" Mood level before playing: " + animal.moodLevel);
//
//        animal.moodLevel += 5;
//
//        System.out.println(name + " just played " + activity.name + " with " + animal.name);
//
//        System.out.println(" Mood level after playing: " + animal.moodLevel);
    }



