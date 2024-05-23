package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_NUMBER = 999;

    public static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            data[i] = getRound();
        }

        Engine.startGame(QUESTION, data);
    }

    private static String[] getRound() {
        int number = Utils.getRandom(1, MAX_NUMBER);

        String[] questionAnswerPair = new String[2];
        questionAnswerPair[0] = "Question: " + number;
        questionAnswerPair[1] = isEven(number) ? "yes" : "no";

        return questionAnswerPair;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
