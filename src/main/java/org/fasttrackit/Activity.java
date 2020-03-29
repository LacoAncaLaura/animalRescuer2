package org.fasttrackit;

public class Activity {

    // instance variables
    private String name;
    private boolean inOut;
    private int play;
    private int durationInHours;

    public Activity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInOut() {
        return inOut;
    }

    public void setInOut(boolean inOut) {
        this.inOut = inOut;
    }
    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

}

