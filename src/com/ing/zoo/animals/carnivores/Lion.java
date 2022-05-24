package com.ing.zoo.animals.carnivores;


public class Lion implements Carnivores {
    public String name;
    public String helloText;
    public String eatText;

    public Lion() { }

    public void animalName(String input) {
        name = "henk";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello() {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat() {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
