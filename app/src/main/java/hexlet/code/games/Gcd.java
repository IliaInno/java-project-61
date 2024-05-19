package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int MAX_NUMBER = 999;
    public static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static void gcdGame() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            data[i] = getRound();
        }

        Engine.startGame(QUESTION, data);
    }

    public static String[] getRound() {
        int firstNumber = Utils.getRandom(1, MAX_NUMBER);
        int secondNumber = Utils.getRandom(1, MAX_NUMBER);

        while (firstNumber == secondNumber) {
            secondNumber = Utils.getRandom(1, MAX_NUMBER);
        }

        String[] questionAnswerPair = new String[2];
        questionAnswerPair[0] = "Question: " + firstNumber + " " + secondNumber;
        int result = findGCD(firstNumber, secondNumber);
        questionAnswerPair[1] = String.valueOf(result);

        return questionAnswerPair;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
