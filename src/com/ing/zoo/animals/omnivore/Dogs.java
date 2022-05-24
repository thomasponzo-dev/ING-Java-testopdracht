package com.ing.zoo.animals.omnivore;

import com.ing.zoo.animals.Animals;
import com.ing.zoo.animals.Tricks;

import java.util.Random;

public class Dogs implements Animals {
    public String name;
    public String helloText;
    public String eatText;

    public Dogs() { }

    public void animalName(String input) {
        name = "sjakie";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello() {
        helloText = "woef";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch oink";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom  thx";
        System.out.println(eatText);
    }

}
