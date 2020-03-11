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

        Pet petReference = new Pet();

        petReference.name = "Lucky";
        petReference.age = 1;
        petReference.breed = "GermanShepherd";
        petReference.healthLevel = 10;
        petReference.moodLevel = 10;
        petReference.hungerLevel = 8;
        petReference.illness = true;
        petReference.favoritActivity = "run";
        petReference.priceTag = 199.99;


//        petReference.friends = new Friends();
//        petReference.friends.name = "Freya";
//        petReference.adoptor = "Baby";



        //concatenation

        System.out.println("Properties of:" + petReference.name);
        System.out.println("age:" + petReference.age);
        System.out.println("breed:" + petReference.breed);
        System.out.println("healthLevel:" + petReference.healthLevel);
        System.out.println("moodLevel:" + petReference.moodLevel);
        System.out.println("hungerLevel:" + petReference.hungerLevel);
        System.out.println("illness:" + petReference.illness);
        System.out.println("favoritActivity:" + petReference.favoritActivity);
        System.out.println("priceTag: " + petReference.priceTag);



        Adopter adopterReference = new Adopter();

        adopterReference.name = "Baby";
        adopterReference.money = 100;
        adopterReference.age = 50;
        adopterReference.job = true;
        adopterReference.gender = "male";

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
        foodReference.price = 100;


        // concatenation

        System.out.println("Properties of:" + foodReference.name);
        System.out.println("availability:" + foodReference.availability);
        System.out.println("color:" + foodReference.color);
        System.out.println("expirationDate:" + foodReference.expirationDate);
        System.out.println("quantity:" + foodReference.quantity);
        System.out.println("price:" + foodReference.price);



        Activity activityReference = new Activity();

        activityReference.name = "Fetch";
        activityReference.inOut = true;

        //concatenation

        System.out.println("Properties of:" + activityReference.name);
        System.out.println("inOut:" + activityReference.inOut);


        Vet vetReferences = new Vet();


        vetReferences.name = "bioVet";
        vetReferences.appointment = new Date (2020, 04, 24 );
        vetReferences.gender = "male";
        vetReferences.price = 150;
        vetReferences.specialization= "dogs";

        // concatenation

        System.out.println("Properties of:" + vetReferences.name);
        System.out.println("appointment:" + vetReferences.appointment);
        System.out.println("gender:" + vetReferences.gender);
        System.out.println("price:" + vetReferences.price);
        System.out.println("vetSpecialization:" + vetReferences.specialization);

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

        FriendsForAnimal FriendsForAnimalReferences = new FriendsForAnimal();

        FriendsForAnimalReferences.name = "Kyra";
        FriendsForAnimalReferences.gender= "female";
        FriendsForAnimalReferences.quantity= 1;

        //concatenation

        System.out.println("Properties of:" + FriendsForAnimalReferences.name);
        System.out.println("gender:" + FriendsForAnimalReferences.gender);
        System.out.println("quantity:" + FriendsForAnimalReferences.quantity);


















    }}
