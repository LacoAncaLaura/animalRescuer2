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


        Animal animalReference = new Animal( "Lucky" , 10 , 8 , 10 );

        animalReference.setName("Lucky");
        animalReference.setAge(1);
        animalReference.setBreed("GermanShepherd");
        animalReference.setHealthLevel(10);
        animalReference.setMoodLevel(10);
        animalReference.setHungerLevel(8);
        animalReference.setIllness(false);
        animalReference.setFavoriteActivity("run");


//        animalReference.friends = new Friends();
//        animalReference.friends.name = "Freya";
//        animalReference.adopter = "Baby";



        //concatenation

        System.out.println("Properties of:" + animalReference.getName());
        System.out.println("age:" + animalReference.getName());
        System.out.println("breed:" + animalReference.getName());
        System.out.println("healthLevel:" + animalReference.getHealthLevel());
        System.out.println("moodLevel:" + animalReference.getMoodLevel());
        System.out.println("hungerLevel:" + animalReference.getHungerLevel());
        System.out.println("illness:" + animalReference.isIllness());
        System.out.println("favoriteActivity:" + animalReference.getFavoriteActivity());




        Adopter adopterReference = new Adopter("Cosmin" , 100.99);



        adopterReference.setName("Cosmin");
        adopterReference.setMoney(100.99);
        adopterReference.setAge(50);
        adopterReference.setJob(true);
        adopterReference.setGender("male");

        //concatenation

        System.out.println("Properties of:" + adopterReference.getName());
        System.out.println("money:" + adopterReference.getMoney());
        System.out.println("age:" + adopterReference.getAge());
        System.out.println("job:" + adopterReference.isJob());
        System.out.println("gender:" + adopterReference.getGender());

        Food foodReference = new Food("TasteOfTheWild");

        foodReference.setName("TasteOfTheWild");
        foodReference.setAvailability(true);
        foodReference.setColor("Brown");
        foodReference.setExpirationDate(new Date(2026, 12, 31));
        foodReference.setQuantity(10);
        foodReference.setPrice(100);


        // concatenation

        System.out.println("Properties of:" + foodReference.getName());
        System.out.println("availability:" + foodReference.isAvailability());
        System.out.println("color:" + foodReference.getColor());
        System.out.println("expirationDate:" + foodReference.getExpirationDate());
        System.out.println("quantity:" + foodReference.getQuantity());
        System.out.println("price:" + foodReference.getPrice());



        Activity activityReference = new Activity("Fetch");

        activityReference.setName("Fetch");
        activityReference.setInOut(true);

        //concatenation

        System.out.println("Properties of:" + activityReference.getName());
        System.out.println("inOut:" + activityReference.isInOut());


        Vet vetReferences = new Vet("bioVet" , "dogs");


        vetReferences.setName("bioVet");
        vetReferences.setAppointment(new Date(2020, 04, 24));
        vetReferences.setGender("male");
        vetReferences.setPrice(150);
        vetReferences.setSpecialization("dogs");

        // concatenation

        System.out.println("Properties of:" + vetReferences.getName());
        System.out.println("appointment:" + vetReferences.getAppointment());
        System.out.println("gender:" + vetReferences.getGender());
        System.out.println("price:" + vetReferences.getPrice());
        System.out.println("vetSpecialization:" + vetReferences.getSpecialization());

        Toys toysReferences = new Toys("Ball");

        toysReferences.setName("Ball");
        toysReferences.setColor("Green");
        toysReferences.setBroken(false);
        toysReferences.setQuantity(15);

        //concatenation


        System.out.println("Properties of:" + toysReferences.getName());
        System.out.println("color:" + toysReferences.getColor());
        System.out.println("broken:" + toysReferences.isBroken());
        System.out.println("quantity:" + toysReferences.getQuantity());

        FriendsForAnimal FriendsForAnimalReferences = new FriendsForAnimal("Kira");

        FriendsForAnimalReferences.setName("Kira");
        FriendsForAnimalReferences.setGender("female");
        FriendsForAnimalReferences.setQuantity(1);

        //concatenation

        System.out.println("Properties of:" + FriendsForAnimalReferences.getName());
        System.out.println("gender:" + FriendsForAnimalReferences.getGender());
        System.out.println("quantity:" + FriendsForAnimalReferences.getQuantity());


        adopterReference.feeding(animalReference,foodReference);
        adopterReference.playing(animalReference, activityReference);

        animalReference.feeling(animalReference);

        Cat cat = new Cat("Alice" , 12 , 6 , 8);
        cat.feeling(animalReference);

        Dog dog = new Dog("George" , 9 ,10,12,14);
        dog.feeling(animalReference);




        }}