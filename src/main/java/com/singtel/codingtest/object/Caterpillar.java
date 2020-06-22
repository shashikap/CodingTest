package com.singtel.codingtest.object;

import com.singtel.codingtest.model.WalkingAnimal;

public class Caterpillar implements WalkingAnimal {
    @Override
    public String walk() {
        return "I am crawling";
    }

    public Butterfly metamorphosis() {
        return new Butterfly();
    }

}