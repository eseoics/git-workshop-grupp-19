import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Skola. \n" +
                        "Please enter something: ");
        String input = sc.nextLine();
        System.out.println(input);

        run();
    }

    public static void run(){
        Cem cem = new Cem();
        Lexe lexe = new Lexe();
        Carl carl = new Carl();
        cem.hello();
        lexe.hello();
        carl.hello();
    }
}