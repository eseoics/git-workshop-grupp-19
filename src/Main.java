import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Skola. \n" +
                        "Please enter something: ");
        String input = sc.nextLine();

        run(input);
    }

    public static void run(String input) {
        if(input.equals("Carl")) {
            Carl carl = new Carl();
        } else if(input.equals("Lexe")) {
            Lexe lexe = new Lexe();
            lexe.hello();
        } else if(input.equals("Cem")) {
            Cem cem = new Cem();
            cem.hello();
        } else{
            System.out.println("Something went wrong");
        }
    }
}