package com.singtel.codingtest.object;

import com.singtel.codingtest.model.Animal;
import com.singtel.codingtest.model.SoundOfAnimal;
import com.singtel.codingtest.model.WalkingAnimal;

public class Cat implements WalkingAnimal, SoundOfAnimal {

    public String walk() {
        return "I am walking";
    }

    public String fly() {
        return "I can't fly";
    }


    public String sound() {
        return "Meow";
    }
}