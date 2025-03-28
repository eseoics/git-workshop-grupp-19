import java.util.Scanner;

public class Carl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Carls class!");
        System.out.println("Please enter your name: \n");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "!");
    }
}
