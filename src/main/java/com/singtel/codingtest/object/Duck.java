package com.singtel.codingtest.object;

import com.singtel.codingtest.model.FlyingAnimal;
import com.singtel.codingtest.model.SwimingAnimal;

public class Duck extends Bird implements SwimingAnimal {

    public String sound() {
        return "Quack, quack";
    }

    public String swim() {
        return "I can swim";
    }
}
