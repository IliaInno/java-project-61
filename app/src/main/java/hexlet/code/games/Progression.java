package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MAX_START_NUMBER = 50;
    private static final int MIN_PROGR_LENGTH = 5;
    private static final int MAX_PROGR_LENGTH = 12;
    private static final int MAX_PROGR_STEP = 99;
    public static final String QUESTION = "What number is missing in the progression?";

    public static void progressionGame() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            data[i] = getRound();
        }

        Engine.startGame(QUESTION, data);
    }

    public static String[] getRound() {
        var startNumber = Utils.getRandom(1, MAX_START_NUMBER);
        var progressionLength = Utils.getRandom(MIN_PROGR_LENGTH, MAX_PROGR_LENGTH);
        var step = Utils.getRandom(1, MAX_PROGR_STEP);
        int indexToHide = Utils.getRandom(2, progressionLength - 1);

        int[] progression = getProgression(startNumber, progressionLength, step);

        StringBuilder sb = new StringBuilder("Question: ");
        for (int i = 0; i < progressionLength; i++) {
            if (i == indexToHide) {
                sb.append(".. ");
            } else {
                sb.append(progression[i]).append(" ");
            }
        }

        String[] questionAnswerPair = new String[2];
        questionAnswerPair[0] = sb.toString();
        questionAnswerPair[1] = String.valueOf(progression[indexToHide]);

        return questionAnswerPair;
    }

    public static int[] getProgression(int startNumber, int progressionLength, int step) {
        int[] progression = new int[progressionLength];
        for (int i = 0; i < progressionLength; i++) {
            progression[i] = startNumber + (i * step);
        }

        return progression;
    }
}




