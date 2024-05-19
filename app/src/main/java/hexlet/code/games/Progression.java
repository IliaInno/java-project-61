package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static String question = "What number is missing in the progression?";

    public static void progressionGame() {
        String[][] data = new String[Engine.roundsCount][2];

        for (int i = 0; i < Engine.roundsCount; i++) {
            data[i] = getRound();
        }

        Engine.startGame(question, data);
    }

    public static String[] getRound() {
        var startNumber = Utils.getRandom(1, 25);
        var progressionLength = Utils.getRandom(5, 12);
        var step = Utils.getRandom(2, 18);
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




