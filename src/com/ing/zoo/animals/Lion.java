package com.ing.zoo.animals;

public class Lion implements Animals{
    public String name;
    public String helloText;
    public String eatText;

    public Lion()
    {
    }

    public void animalName(String input){
        name = "henk";
        if (input.equals(name)) {
            sayHello();
        }
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
