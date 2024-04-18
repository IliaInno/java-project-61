package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice: ");
        int usersChoice = sc.nextInt();

        switch (usersChoice) {
            case 1 -> Cli.greetings();
            case 2 -> Even.evenGame();
            case 0 -> System.out.println("Exit!");
        }
    }
}