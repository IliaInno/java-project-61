package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
             Please enter the game number and press Enter.
             1 - Greet
             2 - Even
             3 - Calc
             4 - GCD
             5 - Progression
             6 - Prime
             0 - Exit
             """);
        System.out.print("Your choice: ");
        String usersChoice = sc.next();

        switch (usersChoice) {
            case "1" -> Cli.greetings();
            case "2" -> Even.startGame();
            case "3" -> Calc.startGame();
            case "4" -> Gcd.startGame();
            case "5" -> Progression.startGame();
            case "6" -> Prime.startGame();
            case "0" -> System.out.println("Exit!");
            default -> System.out.println("Not a valid game number, try again.");
        }
    }
}
