import com.ing.zoo.animals.*;


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
                new Zebra()
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
                System.out.println("Today is Sunday");
                break;
            case "give meat":
                System.out.println("Today is Sunday");
                break;
            case "perform trick":
                System.out.println("Today is Sunday");
                break;
            default:
                if (resultHello) {
                    if (input.equals("hello")) {
                        for (int i = 0; i < animals.length; i++) {
                            animals[i].sayHello();
                        }
                    } else {
                        String formatedName = input.replace("hello ", "");
                        for (int i = 0; i < animals.length; i++) {
                            animals[i].animalName(formatedName);
                        }
                    }
                } else {
                    System.out.println("Unknown command: " + input);
                }

        }


    }
}
