package com.singtel.codingtest;

import com.singtel.codingtest.model.*;
import com.singtel.codingtest.object.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

@SpringBootApplication(scanBasePackages = {"com.singtel.codingtest"})
public class AnimalApplication {

    static Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot(),
            new Fish(),
            new Shark(),
            new ClownFish(),
            new Dolphin(),
            new Frog(),
            new Dog(),
            new Butterfly(),
            new Cat()
    };

    public static void main(String[] args) {

        SpringApplication.run(AnimalApplication.class, args);


        usingForEach();
        usingPredicate();

    }

    private static void usingForEach() {
        AtomicInteger walkingAnimal = new AtomicInteger();
        AtomicInteger flyingAnimal = new AtomicInteger();
        AtomicInteger swimingAnimal = new AtomicInteger();
        AtomicInteger soundMakingAnimal = new AtomicInteger();

        Arrays.asList(animals)
                .forEach(animal -> {
                    //Checking for the walking animal
                    if (animal instanceof WalkingAnimal) {
                        walkingAnimal.set(walkingAnimal.get() + 1);
                    }
                    //Checking for the flying animal
                    if (animal instanceof FlyingAnimal) {
                        flyingAnimal.set(flyingAnimal.get() + 1);
                    }
                    //Checking for the swiming animal
                    if (animal instanceof SwimingAnimal) {
                        swimingAnimal.set(swimingAnimal.get() + 1);
                    }
                    //Checking for the sound making animal
                    if (animal instanceof SoundOfAnimal) {
                        soundMakingAnimal.set(soundMakingAnimal.get() + 1);
                    }
                });

        System.out.println("Above list contains...");
        System.out.println(walkingAnimal + " Walking Animals, ");
        System.out.println(flyingAnimal + " Flying Animals, ");
        System.out.println(swimingAnimal + " Swimming Animals,");
        System.out.println(soundMakingAnimal + "  Animals are Sings or Sound making Animlas");
    }

    private static void usingPredicate() {

        Predicate<Animal> walkingAnimalPredicate = x -> x instanceof WalkingAnimal;
        Predicate<Animal> flyAnimalPredicate = x -> x instanceof FlyingAnimal;
        Predicate<Animal> swAnimalPredicate = x -> x instanceof SwimingAnimal;
        Predicate<Animal> soAnimalPredicate = x -> x instanceof SoundOfAnimal;

        System.out.println("Using predicates to get the animal types ");
        System.out.println("Above list contains...");
        System.out.println((Long) Arrays.stream(animals).filter(walkingAnimalPredicate).count()
                + " Walking Animals, ");
        System.out.println((Long) Arrays.stream(animals).filter(flyAnimalPredicate).count() + " Flying Animals, ");
        System.out.println((Long) Arrays.stream(animals).filter(swAnimalPredicate).count() + " Swimming Animals, ");
        System.out.println((Long) Arrays.stream(animals).filter(soAnimalPredicate).count()
                + "  Animals are Sings or Sound making Animals");
    }


}
