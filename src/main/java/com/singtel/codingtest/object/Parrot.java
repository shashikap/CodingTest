package com.singtel.codingtest.object;

import com.singtel.codingtest.model.FlyingAnimal;
import com.singtel.codingtest.model.SoundOfAnimal;

public class Parrot extends Bird implements FlyingAnimal {

    private String sound;

    public Parrot() {
        this.sound = super.sound();
    }

    private Parrot(String song) {
        this.sound = song;
    }

    public static Parrot getSundOfParrotLivingWith(SoundOfAnimal sound) {
        if (sound == null) {
            return new Parrot();
        } else {
            return new Parrot(sound.sound());
        }

    }

    public String sound() {
        return sound;
    }

}