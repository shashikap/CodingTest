package com.singtel.codingtest.object;

public class Shark extends Fish {

    private String color;
    private String size;

    public Shark() {
        this.color = "Grey";
        this.size = "Large";
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

    public String eats(Fish fish) {
        return "I am eating another fish:" + fish.toString();
    }

}