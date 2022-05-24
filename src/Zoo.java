import com.ing.zoo.animals.*;
import com.ing.zoo.animals.carnivores.Carnivores;
import com.ing.zoo.animals.herbivores.Herbivores;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zoo {
    public static void main(String[] args) {

        Data data = new Data();
        Animals[] animals = data.getAnimals();
        Carnivores[] carnivores = data.getCarnivores();
        Herbivores[] herbivores = data.getHerbivores();
        Tricks[] tricks = data.getTricks();

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
