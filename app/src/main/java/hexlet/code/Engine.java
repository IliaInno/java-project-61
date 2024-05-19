package hexlet.code;

import java.util.Scanner;
public final class Engine {

    public static final int ROUNDS_COUNT = 3;

    public static void startGame(String question, String[][] data) {
        Scanner scanner = new Scanner(System.in);
        Cli.greetings();
        System.out.println(question);


        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println(data[i][0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equals(data[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + data[i][1] + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}