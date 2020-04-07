package org.fasttrackit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    // instance variables
    //has-a relationship / Aggregation
    Vet vet;
    Adopter adopter;
    Animal animal;

    private Animal[] abandonedAnimals = new Animal[2];
    private List<Adopter> users = new ArrayList<>();
    private Food[] foods = new Food[3];
    private Activity[] activities = new Activity[4];
    private Animal selectedAnimal;
    private Activity selectedActivities;
    private Food selectedFood;
    private boolean winnerNotKnown = true;
    private int usersWithoutMoney = 0;


    public void start() {
        System.out.println("It`s play time!");


        initializePlayers();
        initAnimal();
        displayAnimal();
        selectedAnimal = getSelectedAnimalFromUser();
        System.out.println("You have selected a " + selectedAnimal.getName());
        nameForAnimal();

        initFood();
        displayFood();
        Food selectedFood = getSelectedFoodFromUser();
        System.out.println("Your pet is having for meal: " + selectedFood);
        requireFeeding();
        requireActivity();


        initActivity();
        displayActivities();
        Activity selectedActivities = getSelectedActivityFromUser();
        System.out.println("Now take your pet and exercise some " + selectedActivities);
        while (winnerNotKnown && usersWithoutMoney < users.size()) {
            playGame();
        }

    }

    private void playGame() {
        System.out.println("\n2New Round");
        int feeding = animal.getHungerLevel();
        for (int i = 0; i < feeding; i++) {
            System.out.println("It`s " + adopter.getName() + "turn");
            if (animal.getHungerLevel() > animal.getMoodLevel() && adopter.getMoney() < selectedFood.getPrice()) {
                System.out.println("The winner is: " + adopter.getName());
                winnerNotKnown = false;

                break;
            }
            if (animal.getHealthLevel() > 8) ;
            usersWithoutMoney++;
        }
    }


    private void initAnimal() {
        System.out.println("Please select an animal: ");
        Animal abandonedAnimal1 = new Cat("Cat", 5, 10, 2);
        abandonedAnimal1.setName("Cat");
        abandonedAnimal1.setHungerLevel(10);
        abandonedAnimal1.setHealthLevel(5);
        abandonedAnimal1.setMoodLevel(2);

        abandonedAnimals[0] = abandonedAnimal1;

        Animal abandonedAnimal2 = new Dog("Dog", 5, 10, 2, 1);
        abandonedAnimal2.setName("Dog");
        abandonedAnimal2.setHealthLevel(5);
        abandonedAnimal2.setHungerLevel(10);
        abandonedAnimal2.setMoodLevel(2);

        abandonedAnimals[1] = abandonedAnimal2;


    }

    private void displayAnimal() {
        System.out.println("Abandoned animals: ");
        for (int i = 0; i < abandonedAnimals.length; i++) {
            if (abandonedAnimals[i] != null) ;
            System.out.println((i + 1) + "." + abandonedAnimals[i].getName());
        }

    }

    private Animal getSelectedAnimalFromUser() {
        System.out.println("Please select an animal: ");

        try {
            Scanner scanner = new Scanner(System.in);
            int abandonedAnimalsNumber = scanner.nextInt();
            return abandonedAnimals[abandonedAnimalsNumber];
        } catch (InputMismatchException e) {
            throw new RuntimeException("You have entered an invalid value.Please try again.");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Wrong number entered.");
        } finally {
            System.out.println("Finally block always executed.");
        }
    }

    private String nameForAnimal() {
        System.out.println("Please give him a name: ");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        return animalName;
    }

    private void initFood() {

        Food food1 = new Food("TasteOfTheWild");
//        foodList.add(1,food1);
        food1.setQuantity(150);
        food1.setPrice(25.1);
//
        foods[0] = food1;
//       Index

        Food food2 = new Food("Beef");
//        foodList.add(2, food2);
        food2.setQuantity(200);
        food2.setPrice(5.3);


        foods[1] = food2;

        Food food3 = new Food("Chicken");
//        foodList.add(3, food3);
        food3.setQuantity(250);
        food3.setPrice(2.5);

        foods[2] = food3;
    }

    private void initActivity() {

        Activity activity1 = new Activity("Run");
        activity1.setDurationInHours(1);

        activities[0] = activity1;

        Activity activity2 = new Activity("Play");
        activity2.setDurationInHours(2);

        activities[1] = activity2;

        Activity activity3 = new Activity("Training");
        activity3.setDurationInHours(3);

        activities[2] = activity3;
    }

    public void displayFood() {
        System.out.println("Available Food: ");
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null) {
                System.out.println((i + 1) + "." + foods[i].getName() + "-" + foods[i].getQuantity() + " grams and you will pay: " + foods[i].getPrice() + " Ron");
            }
        }
    }


    public void displayActivities() {
        System.out.println("Available Activities: ");
        for (int i = 0; i < activities.length; i++) {
            if (activities[i] != null) {
                System.out.println((i + 1) + "." + activities[i].getName() + "-" + activities[i].getDurationInHours() + " hours together.");
            }
        }
    }

    private int getPlayerCountFromUser() {
        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private Food getSelectedFoodFromUser() {
        System.out.println("Please select a type of food: ");
        Scanner scanner = new Scanner(System.in);
        int foodNumber = scanner.nextInt();
        return foods[foodNumber - 1];
    }

    private Activity getSelectedActivityFromUser() {
        System.out.println("Pleas select your favorite activity: ");
        Scanner scanner = new Scanner(System.in);
        int activitiesNumber = scanner.nextInt();
        return activities[activitiesNumber - 1];
    }

    private void initializePlayers() {
        int playerCount = getPlayerCountFromUser();
        for (int i = 0; i < playerCount; i++) {
            System.out.println("That`s one adopter for an animal: " + (i + 1));
            String name = getUserName();
            Adopter adopter = new Adopter(name, 1655.5);
            adopter.setName(name);
            adopter.getGender();
            adopter.isJob();
            adopter.setAge(20);
            adopter.getMoney();
            users.add(adopter);
        }
    }

    private String getUserName() {
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String userName = scanner.nextLine();
            return userName;
        } catch (Exception e) {
            System.out.println("You have entered an invalid value.Please try again.");
            String userName = scanner.nextLine();
            return userName;
        }
    }

    private void requireFeeding() {
        System.out.println("Meal time!" +
                "Now feed your pet.");
        Scanner scanner = new Scanner(System.in);
//        displayFood();
        int feeding = scanner.nextInt();
        for (int i = feeding; i <= 10; i++) {
            System.out.println("Great job!");
//            if (animal.getMoodLevel() > 10)
//                System.out.println("Now your pet is happy!");
        }
    }

    private void requireActivity() {
        System.out.println("Have some fun! Pick again your favorite activity");
        displayActivities();
        Scanner scanner = new Scanner(System.in);
        int play = scanner.nextInt();
        for (int i = play; i < 8; i++) {
            System.out.println("i hope you had a good time together!");
        }
    }
}
//    private void requireDoctor(){
//        System.out.println("Let`s have a check of your pet`s health");
//        Scanner scanner = new Scanner(System.in);
//        int








