import com.ing.zoo.animals.*;
import com.ing.zoo.animals.carnivores.Carnivores;
import com.ing.zoo.animals.carnivores.Lion;
import com.ing.zoo.animals.carnivores.Tiger;
import com.ing.zoo.animals.herbivores.Herbivores;
import com.ing.zoo.animals.herbivores.Hippo;
import com.ing.zoo.animals.herbivores.Zebra;
import com.ing.zoo.animals.omnivore.Bears;
import com.ing.zoo.animals.omnivore.Dogs;
import com.ing.zoo.animals.omnivore.Pig;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zoo {
    public static void main(String[] args) {

        Animals[] animals = {
                new Hippo(),
                new Lion(),
                new Pig(),
                new Tiger(),
                new Zebra(),
                new Dogs(),
                new Bears()
        };

        Carnivores[] carnivores = {
                new Lion(),
                new Tiger(),
        };

        Herbivores[] herbivores = {
                new Hippo(),
                new Zebra(),
        };

        Tricks[] tricks = {
                new Tiger(),
                new Pig(),
        };

        String helloRegex = "hello.*";
        Pattern patternHello = Pattern.compile(helloRegex);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        Matcher matcherHello = patternHello.matcher(input);
        boolean resultHello = matcherHello.matches();

        switch (input) {
            case "give leaves":
                for (Herbivores herbivore : herbivores) {
                    herbivore.eatLeaves();
                }
                break;
            case "give meat":
                for (Carnivores carnivore : carnivores) {
                    carnivore.eatMeat();
                }
                break;
            case "perform trick":
                for (Tricks trick : tricks) {
                    trick.performTrick();
                }
                break;
            default:
                if (resultHello) {
                    if (input.equals("hello")) {
                        for (Animals animal : animals) {
                            animal.sayHello();
                        }
                    } else {
                        String formatedName = input.replace("hello ", "");
                        for (Animals animal : animals) {
                            animal.animalName(formatedName);
                        }
                    }
                } else {
                    System.out.println("Unknown command: " + input);
                }
        }
    }
}
