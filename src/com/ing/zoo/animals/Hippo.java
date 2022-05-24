package com.ing.zoo.animals;

public class Hippo implements Animals {
    public String name;
    public String helloText;
    public String eatText;

    public Hippo()
    {
    }

    public void animalName(String input){
        name = "elsa";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello()
    {
        helloText = "splash";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
        System.out.println(eatText);
    }
}
