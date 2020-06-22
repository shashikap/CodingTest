package com.singtel.codingtest.object;


import com.singtel.codingtest.model.Animal;
import com.singtel.codingtest.model.SoundOfAnimal;
import com.singtel.codingtest.model.WalkingAnimal;

public class Bird implements WalkingAnimal, SoundOfAnimal {

    public String fly() {
        return "I am flying";
    }

    public String walk() {
        return "I am walking";
    }

    public String sound() {
        return "I am singing";
    }
}
