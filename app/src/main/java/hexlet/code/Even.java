package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {


    public static void evenGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String usersAnswer;
        String correctAnswer;
        int countScore = 0;

        Cli.greetings();

        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");

        while (countScore < 3) {
            int number = rand.nextInt(999);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            usersAnswer = sc.next();
            boolean isEven = number % 2 == 0;

            if (isEven & usersAnswer.toLowerCase().equals("yes")) {
                System.out.println("Correct!");
                countScore++;
            } else if (!isEven & usersAnswer.toLowerCase().equals("no")) {
                System.out.println("Correct!");
                countScore++;
            } else {
                if (isEven) {
                    correctAnswer = "yes";
                    System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n" +
                            "Let's try again, %s!\n", usersAnswer, correctAnswer, Cli.getName());
                    countScore = 0;
                } else {
                    correctAnswer = "no";
                    System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n" +
                            "Let's try again, %s!\n", usersAnswer, correctAnswer, Cli.getName());
                    countScore = 0;
                }
            }
        }
        System.out.printf("Congratulations, %s", Cli.getName());
    }
}
