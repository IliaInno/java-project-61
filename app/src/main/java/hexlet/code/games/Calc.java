package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String QUESTION = "What is the result of the expression?";
    public static final String[] OPERATOR = {"+", "-", "*"};
    private static final int MAX_NUMBER = 99;

    public static void calcGame() {
        String[][] data = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            data[i] = getRound();
        }

        Engine.startGame(QUESTION, data);
    }

    public static String[] getRound() {
        int number1 = Utils.getRandom(1, MAX_NUMBER);
        int number2 = Utils.getRandom(1, MAX_NUMBER);
        String operator = Calc.OPERATOR[Utils.getRandom(0, Calc.OPERATOR.length)];

        String[] questionAnswerPair = new String[2];
        questionAnswerPair[0] = "Question: " + number1 + " " + operator + " " + number2;
        int result = calculate(operator, number1, number2);
        questionAnswerPair[1] = String.valueOf(result);

        return questionAnswerPair;
    }

    public static int calculate(String operator, int number1, int number2) {
        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> 0;
        };
    }

}



