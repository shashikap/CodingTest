package com.singtel.codingtest.object;

public class ClownFish extends Fish {

    private String color;
    private String size;

    public ClownFish() {
        this.color = "Orange";
        this.size = "Small";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String makeJokes() {
        return "Joke";
    }

    public String toString() {
        return "ClownFish";
    }

}
