package org.fasttrackit;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    // instance variables
    //has-a relationship / Aggregation
    Vet vet;
    Adopter adopter;
    Animal animal;


    private Food[]foods = new Food[3];




    public void start() {
        System.out.println("It`s play time!");

       int countPlayers = getPlayerCountFromUser();

        initFood();
        displayFood();
        Food selectedFood = getSelectedFoodFromUser();

        initActivity();
        displayActivities();
        Activity selectedActivities= getSelectedActivityFromUser();

    }


  private List<Food>  foodList =new ArrayList<>();
//        {foodList.add("TasteOfTheWild");
//        foodList.add("Beef");
//        foodList.add("Chicken");
//        }



    private void initFood(){

        Food food1 = new Food("TasteOfTheWild");
        food1.setQuantity(150);

       foods[0]= food1;

        Food food2 = new Food("Beef");
        food2.setQuantity(200);

        foods[1]= food2;

        Food food3 = new Food("Chicken");
        food3.setQuantity(250);

        foods[2]= food3;
    }
    private Activity[]activities = new Activity[4];

    private void initActivity(){

        Activity activity1 = new Activity("Run");
        activity1.setDurationInHours(1);

        activities[0]= activity1;

        Activity activity2 = new Activity("Play");
        activity2.setDurationInHours(2);

        activities[1]= activity2;

        Activity activity3 = new Activity("Training");
        activity3.setDurationInHours(3);

        activities[2]= activity3;
    }
    public void displayFood(){
        System.out.println("Available Food: ");
        for (int i = 0; i < foods.length; i++){
            if (foods[i] != null){
                System.out.println((i + 1) +"." +  foods[i].getName() +"-" +  foods[i].getQuantity());
            }}
    }
    public void displayActivities(){
        System.out.println("Available Activities: ");
        for (int i= 0; i< activities.length; i++){
            if(activities[i] != null){
                System.out.println((i + 1) +"." +  activities[i].getName() +"-" + activities[i].getDurationInHours());
            }
          }
        }
    private int getPlayerCountFromUser(){
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private Food getSelectedFoodFromUser(){
        System.out.println("Please select a type of food: ");
        Scanner scanner = new Scanner(System.in);
        int foodNumber = scanner.nextInt();
        return foods[foodNumber - 1];
    }
    private Activity getSelectedActivityFromUser(){
        System.out.println("Pleas select your favorite activity: ");
        Scanner scanner = new Scanner(System.in);
        int activitiesNumber = scanner.nextInt();
        return activities[activitiesNumber - 1];
    }
    }
