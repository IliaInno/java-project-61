package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeGame() {
        String[][] data = new String[Engine.roundsCount][2];

        for (int i = 0; i < Engine.roundsCount; i++) {
            data[i] = getRound();
        }

        Engine.startGame(question, data);
    }

    public static String[] getRound() {
        int number = Utils.getRandom(1, 100);

        String[] questionAnswerPair = new String[2];
        questionAnswerPair[0] = "Question: " + number;
        questionAnswerPair[1] = isPrime(number) ? "yes" : "no";

        return questionAnswerPair;
    }

    public static boolean isPrime(int n) {
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
