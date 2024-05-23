package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_NUMBER = 999;

    public static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            data[i] = getRound();
        }

        Engine.startGame(QUESTION, data);
    }

    public static String[] getRound() {
        int number = Utils.getRandom(1, MAX_NUMBER);

        String[] questionAnswerPair = new String[2];
        questionAnswerPair[0] = "Question: " + number;
        questionAnswerPair[1] = isPrime(number) ? "yes" : "no";

        return questionAnswerPair;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
