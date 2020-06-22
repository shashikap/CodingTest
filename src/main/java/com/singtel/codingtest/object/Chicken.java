package com.singtel.codingtest.object;

import com.singtel.codingtest.model.WalkingAnimal;

public class Chicken extends Bird {

    public String sound() {
        return "Cluck, cluck";
    }

    public String fly() {
        return "I can't fly";
    }

    @Override
    public String walk() {
        return null;
    }
}
