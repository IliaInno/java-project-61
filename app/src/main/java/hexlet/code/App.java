package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n"
                        + "3 - Calc\n"
                        + "4 - GCD\n"
                        + "5 - Progression\n"
                        + "6 - Prime\n"
                        + "0 - Exit\n"
                        + "Your choice: ");
        int usersChoice = sc.nextInt();

        switch (usersChoice) {
            case 1 -> Cli.greetings();
            case 2 -> Even.evenGame();
            case 3 -> Calc.calcGame();
            case 4 -> Gcd.gcdGame();
            case 5 -> Progression.progressionGame();
            case 6 -> Prime.primeGame();
            case 0 -> System.out.println("Exit!");
        }
    }
}