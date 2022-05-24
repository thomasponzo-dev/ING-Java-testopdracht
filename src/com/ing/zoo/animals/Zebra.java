package com.ing.zoo.animals;

import java.util.Random;

public class Zebra implements Animals{
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    public void animalName(String input){
        name = "marty";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
