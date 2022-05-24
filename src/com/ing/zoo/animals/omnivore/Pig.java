package com.ing.zoo.animals.omnivore;

import com.ing.zoo.animals.Animals;
import com.ing.zoo.animals.Tricks;

import java.util.Random;

public class Pig implements Animals, Tricks {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Pig() { }

    public void animalName(String input) {
        name = "dora";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello() {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom oink thx";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "rolls in the mud";
        } else {
            trick = "runs in circles";
        }
        System.out.println(trick);
    }
}
