package com.ing.zoo.animals;

import com.ing.zoo.animals.carnivores.Carnivores;
import com.ing.zoo.animals.carnivores.Lion;
import com.ing.zoo.animals.carnivores.Tiger;
import com.ing.zoo.animals.herbivores.Herbivores;
import com.ing.zoo.animals.herbivores.Hippo;
import com.ing.zoo.animals.herbivores.Zebra;
import com.ing.zoo.animals.omnivore.Bears;
import com.ing.zoo.animals.omnivore.Dogs;
import com.ing.zoo.animals.omnivore.Pig;

public class Data {
    private Animals[] animals = {
            new Hippo(),
            new Lion(),
            new Pig(),
            new Tiger(),
            new Zebra(),
            new Dogs(),
            new Bears()
    };

    private Carnivores[] carnivores = {
            new Lion(),
            new Tiger(),
    };

    private Herbivores[] herbivores = {
            new Hippo(),
            new Zebra(),
    };

    private Tricks[] tricks = {
            new Tiger(),
            new Pig(),
    };

    public Animals[] getAnimals() {
        return animals;
    }

    public Carnivores[] getCarnivores() {
        return carnivores;
    }

    public Herbivores[] getHerbivores() {
        return herbivores;
    }

    public Tricks[] getTricks() {
        return tricks;
    }
}
