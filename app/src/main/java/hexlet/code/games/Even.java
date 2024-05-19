package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenGame() {
        String[][] data = new String[Engine.roundsCount][2];

        for (int i = 0; i < Engine.roundsCount; i++) {
            data[i] = getRound();
        }

        Engine.startGame(question, data);
    }

    public static String[] getRound() {
        int number = Utils.getRandom(1, 99);

        String[] questionAnswerPair = new String[2];
        questionAnswerPair[0] = "Question: " + number;
        questionAnswerPair[1] = isEven(number) ? "yes" : "no";

        return questionAnswerPair;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
