package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    // instance variables
    //has-a relationship / Aggregation
    Vet vet;
    Adopter adopter;
    Animal animal;


    private Food[]foods = new Food[2];

    public void start() {
        System.out.println("It`s play time!");

        displayFood();
        int getPlayerCountFromUser = 1;
        int playerCount = getPlayerCountFromUser;
    }




//  private List foodList =new ArrayList<Food>();
//        {foodList.add("food1");
//        foodList.add("food2");
//        foodList.add("food3");}



    private void initFood(){

        Food food1 = new Food("food1");
        food1.setName("TasteOfTheWild");
        food1.setQuantity(150);

       foods[0]= food1;

        Food food2 = new Food("food2");
        food2.setName("Beef");
        food2.setQuantity(200);

        foods[1]= food2;

        Food food3 = new Food("food3");
        food3.setName("Chicken");
        food3.setQuantity(250);

        foods[2]= food3;
    }
    private Activity[]activities = new Activity[3];

    private void initActivity(){

        Activity activity1 = new Activity("run");
        activity1.setName("run");
        activity1.setDurationInHours(1);

        activities[0]= activity1;

        Activity activity2 = new Activity("Play");
        activity2.setName("play");
        activity2.setDurationInHours(2);

        activities[1]= activity2;

        Activity activity3 = new Activity("training");
        activity3.setName("training");
        activity3.setDurationInHours(3);

        activities[2]= activity3;
    }
    public void displayFood(){
        System.out.println("Available Food: ");
        for (int i = 0; i < foods.length; i++){
            if (foods[i] != null){
                System.out.println((i + 1) + foods[i].getName() + foods[i].getQuantity());
            }}
    }
    private int getPlayerCountFromUser(){
        System.out.println("Please enter number of players");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
  }