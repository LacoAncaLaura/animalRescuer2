package org.fasttrackit;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Object Animal;

    public static void main(String[] args ) {
        System.out.println("Welcome to the Animal World!");

        Animal animalReference = new Animal();

        animalReference.name = "Lucky";
        animalReference.age = 1;
        animalReference.breed = "GermanShepherd";
        animalReference.healthLevel = 10;
        animalReference.moodLevel = 10;
        animalReference.hungerLevel = 8;
        animalReference.illness = false;
        animalReference.favoritActivity = "run";



//        animalReference.friends = new Friends();
//        animalReference.friends.name = "Freya";
//        animalReference.adopter = "Baby";



        //concatenation

        System.out.println("Properties of:" + animalReference.name);
        System.out.println("age:" + animalReference.age);
        System.out.println("breed:" + animalReference.breed);
        System.out.println("healthLevel:" + animalReference.healthLevel);
        System.out.println("moodLevel:" + animalReference.moodLevel);
        System.out.println("hungerLevel:" + animalReference.hungerLevel);
        System.out.println("illness:" + animalReference.illness);
        System.out.println("favoriteActivity:" + animalReference.favoritActivity);




        Adopter adopterReference = new Adopter();



        adopterReference.name = "Cosmin";
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

        foodReference.name = "TasteOfTheWild";
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


        adopterReference.feeding(animalReference,foodReference);
        adopterReference.playing(animalReference, activityReference);




















    }}
