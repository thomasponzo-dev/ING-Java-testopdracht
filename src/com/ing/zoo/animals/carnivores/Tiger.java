package com.ing.zoo.animals.carnivores;


import com.ing.zoo.animals.Tricks;

import java.util.Random;

public class Tiger implements Carnivores, Tricks {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger() { }

    public void animalName(String input) {
        name = "wally";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello() {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            trick = "jumps in tree";
        } else {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
