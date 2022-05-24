package com.ing.zoo.animals.herbivores;


public class Zebra implements Herbivores {
    public String name;
    public String helloText;
    public String eatText;

    public Zebra() { }

    public void animalName(String input) {
        name = "marty";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves() {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
