package org.fasttrackit;

public class Adopter {

 // instance variables
    private String name;
    private double money;
    private int age;
    private boolean job;
    private String gender;

    public Adopter(String name,Double money){
    this.name = name;
    this.money = money;
}

    public void feeding(Animal animal,Food food){
        if (food.getName().equals(animal.getFavoriteFood())){
            animal.setMoodLevel(animal.getMoodLevel() + 5);
        animal.setFavoriteFood(animal.getFavoriteActivity() + 1);}
        else{
            animal.setMoodLevel(animal.getMoodLevel() - 3);
        }
        System.out.println(" Hunger level before feeding: " + animal.getHungerLevel());

        animal.setFavoriteFood(animal.getFavoriteActivity() + 1);
        animal.setHungerLevel(animal.getHungerLevel() - 6);

        System.out.println(name + " just gave some " + food.getName() + " food to " + animal.getName());

        System.out.println(" Hunger level after feeding: " + animal.getHungerLevel());
    }
    public void playing(Animal animal , Activity activity) {
        if (activity.getName().equals(animal.getFavoriteActivity())){
            animal.setMoodLevel(animal.getMoodLevel() + 3);
        }
        else{
            animal.setMoodLevel(animal.getMoodLevel() - 5);
        }

        System.out.println(" Mood level before playing: " + animal.getMoodLevel());

        animal.setMoodLevel(animal.getMoodLevel()+ 5);

        System.out.println(name + " just played " + activity.getClass() + " with " + animal.getName());

        System.out.println(" Mood level after playing: " + animal.getMoodLevel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isJob() {
        return job;
    }

    public void setJob(boolean job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}



