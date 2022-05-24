package com.ing.zoo.animals.omnivore;

import com.ing.zoo.animals.Animals;

public class Bears implements Animals {
    public String name;
    public String helloText;
    public String eatText;

    public Bears() { }

    public void animalName(String input) {
        name = "dario";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello() {
        helloText = "wrrrrwwarrw";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch";
        System.out.println(eatText);
    }

    public void eatMeat() {
        eatText = "nomnomnom  thx";
        System.out.println(eatText);
    }

}
