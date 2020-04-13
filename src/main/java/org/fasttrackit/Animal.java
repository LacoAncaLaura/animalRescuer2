package org.fasttrackit;


public class Animal  {
    // static variables/class variables
    static int totalAnimalCount;

    // instance variables
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String breed;
    private String favoriteActivity;
    private boolean illness;
    //Aggregation
    private FriendsForAnimal friends;
    private String favoriteFood;
    private int feetLegs;
    private boolean fur;

    public Animal(){
        totalAnimalCount++;
    }
    public Animal(String nameAnimal, int healthLevel, int hungerLevel, int moodLevel) {
        this.name = nameAnimal;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public boolean isIllness() {
        return illness;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }

    public FriendsForAnimal getFriends() {
        return friends;
    }

    public void setFriends(FriendsForAnimal friends) {
        this.friends = friends;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public int getFeetLegs() {
        return feetLegs;
    }

    public void setFeetLegs(int feetLegs) {
        this.feetLegs = feetLegs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

    public void feeling(Animal animal){
        System.out.println(getName() + "`s mood before feeding: "  + moodLevel);
       if (hungerLevel < moodLevel){
           hungerLevel -=5;
           moodLevel += 3;
           System.out.println(getName() + "`s mood after feeding:" + moodLevel);
           System.out.println(getName() + " is happy"); }
       else{
           System.out.println(getName() + " is not in a very good mood");
       } }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", moodLevel=" + moodLevel +
                ", breed='" + breed + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", illness=" + illness +
                ", friends=" + friends +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", feetLegs=" + feetLegs +
                ", fur=" + fur +
                '}';
    }
}

