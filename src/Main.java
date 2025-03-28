import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Skola. \n" +
                        "Please enter name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Please enter name, food or drink: ");
        String input = sc.nextLine();


        run(name, input);
    }

    public static void run(String name, String input) {
        switch (name.toLowerCase()) {
            case "carl" -> {
                Carl carl = new Carl();
                switch (input.toLowerCase()) {
                    case "name" -> carl.hello();
                    case "food" -> carl.favoriteFood();
                    case "drink" -> carl.favoriteDrink();
                    default -> System.out.println("Something went wrong");
                }
            }
            case "lexe" -> {
                Lexe lexe = new Lexe();
                switch (input.toLowerCase()) {
                    case "name" -> lexe.hello();
                    case "food" -> lexe.food();
                    case "drink" -> lexe.drink();
                    default -> System.out.println("Something went wrong");
                }
            }
            case "cem" -> {
                Cem cem = new Cem();
                switch (input.toLowerCase()) {
                    case "name" -> cem.hello();
                    case "food" -> cem.food();
                    case "drink" -> cem.drink();
                    default -> System.out.println("Something went wrong");
                }
            }
            case "linnea" -> {
                Linnea linnea = new Linnea();
                switch (input.toLowerCase()) {
                    case "name" -> linnea.hello();
                    case "food" -> linnea.food();
                    case "drink" -> linnea.drink();
                    default -> System.out.println("Something went wrong");
                }
            }
            default -> System.out.println("Something went wrong");
        }
    }
}