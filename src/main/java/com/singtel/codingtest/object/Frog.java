package com.singtel.codingtest.object;

import com.singtel.codingtest.model.SoundOfAnimal;
import com.singtel.codingtest.model.SwimingAnimal;
import com.singtel.codingtest.model.WalkingAnimal;

public class Frog implements WalkingAnimal, SwimingAnimal, SoundOfAnimal {
    @Override
    public String sound() {
        return "ribbit, ribbit";
    }

    @Override
    public String swim() {
        return "I am swimming";
    }

    @Override
    public String walk() {
        return "I am walking";
    }
}
