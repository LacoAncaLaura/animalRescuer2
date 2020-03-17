package org.fasttrackit;

public class Adopter {

 // instance variables
    String name;
    double money;
    int age;
    boolean job;
    String gender;


    public void feeding(Animal animal,Food food){

        System.out.println(" Hunger level before feeding: " + animal.hungerLevel);

        animal.hungerLevel -=6;

        System.out.println(name + " just gave some " + food.name + " food to " + animal.name);

        System.out.println(" Hunger level after feeding: " + animal.hungerLevel);
    }

}
