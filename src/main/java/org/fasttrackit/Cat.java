package org.fasttrackit;

//"is-a" relationship/inheritance

public class Cat extends Animal {

    int purrs;
    boolean noisy;

    public Cat (String name, int healthLevel, int hungerLevel, int moodLevel) {
        super(name , healthLevel , hungerLevel , moodLevel);

    }

    public int getPurrs() {
        return purrs;
    }

    public void setPurrs(int purrs) {
        this.purrs = purrs;
    }

    public boolean isNoisy() {
        return noisy;
    }

    public void setNoisy(boolean noisy) {
        this.noisy = noisy;
    }
}
