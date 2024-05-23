package hexlet.code;

import java.util.Scanner;
public final class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static String name;

    public static void startGame(String question, String[][] data) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        name = sc.next();
        System.out.printf("Hello, %s!\n", name);
        System.out.println(question);


        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println(data[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.next();

            if (answer.equals(data[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, data[i][1]);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
