package org.fasttrackit;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Welcome to the Animal World!");

        Animal animalReference = new Animal();

        animalReference.name = "Lucky";
        animalReference.age = 1;
        animalReference.bread = "GermanShepherd";
        animalReference.health = 10;
        animalReference.mood = 10;
        animalReference.hunger = 8;
        animalReference.ill = true;

//        animalReference.friends = new Friends();
//        animalReference.friends.name = "Freya";
//        animalReference.adoptor = "Baby";



        //concatenation

        System.out.println("Properties of" + animalReference.name);
        System.out.println("age:" + animalReference.age);
        System.out.println("bread:" + animalReference.bread);
        System.out.println("health:" + animalReference.health);
        System.out.println("mood:" + animalReference.mood);
        System.out.println("hunger:" + animalReference.hunger);
        System.out.println("ill:" + animalReference.ill);


        Adopter adopterReference = new Adopter();

        adopterReference.name = "Baby";
        adopterReference.money = 100;
        adopterReference.age = 50;
        adopterReference.job = true;
        adopterReference.gender = "man";

        //concatenation

        System.out.println("Properties of:" + adopterReference.name);
        System.out.println("money:" + adopterReference.money);
        System.out.println("age:" + adopterReference.age);
        System.out.println("job:" + adopterReference.job);
        System.out.println("gender:" + adopterReference.gender);

        Food foodReference = new Food();

        foodReference.name = "Carne";
        foodReference.availability = true;
        foodReference.color = "Brown";
        foodReference.expirationDate = new Date(2026 , 12 , 31);
        foodReference.quantity = 10;


        // concatenation

        System.out.println("Properties of:" + foodReference.name);
        System.out.println("availability:" + foodReference.availability);
        System.out.println("color:" + foodReference.color);
        System.out.println("expirationDate:" + foodReference.expirationDate);
        System.out.println("quantity:" + foodReference.quantity);



        Activity activityReference = new Activity();

        activityReference.name = "Fetch";
        activityReference.inOut = true;

        //concatenation

        System.out.println("Properties of:" + activityReference.name);
        System.out.println("inOut:" + activityReference.inOut);


        Game gameReferences = new Game();

        gameReferences.adoptor = "Baby";
        gameReferences.animal = "Lucky";
        gameReferences.vet = "bioVet";

        //concatenation

        System.out.println("Properties of:" + gameReferences.adoptor);
        System.out.println("animal:" + gameReferences.animal);
        System.out.println("vet:" + gameReferences.vet);


        Vet vetReferences = new Vet();


        vetReferences.name = "bioVet";
        vetReferences.appointment = new Date (2020, 04, 24 );
        vetReferences.gender = true;
        vetReferences.price = 150;
        vetReferences.vetSpecialization= "dogs";

        // concatenation

        System.out.println("Properties of:" + vetReferences.name);
        System.out.println("appointment:" + vetReferences.appointment);
        System.out.println("gender:" + vetReferences.gender);
        System.out.println("price:" + vetReferences.price);
        System.out.println("vetSpecialization:" + vetReferences.vetSpecialization);

        Toys toysReferences = new Toys();

        toysReferences.name = "Ball";
        toysReferences.color = "Green";
        toysReferences.broken = false;
        toysReferences.quantity = 15;

        //concatenation


        System.out.println("Properties of:" + toysReferences.name);
        System.out.println("color:" + toysReferences.color);
        System.out.println("broken:" + toysReferences.broken);
        System.out.println("quantity:" + toysReferences.quantity);

        Friends friendsReferences = new Friends();

        friendsReferences.name = "Kyra";
        friendsReferences.gender= false;
        friendsReferences.quantity= 1;

        //concatenation

        System.out.println("Properties of:" + friendsReferences.name);
        System.out.println("gender:" + friendsReferences.gender);
        System.out.println("quantity:" + friendsReferences.quantity);


















    }}
