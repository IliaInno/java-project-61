package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static String question = "What is the result of the expression?";
    public static String[] operator = {"+", "-", "*"};

    public static void calcGame() {
        String[][] data = new String[Engine.roundsCount][2];

        for (int i = 0; i < Engine.roundsCount; i++) {
            data[i] = getRound();
        }

        Engine.startGame(question, data);
    }

    public static String[] getRound() {
        int number1 = Utils.getRandom(1, 100);
        int number2 = Utils.getRandom(1, 100);
        String operator = Calc.operator[Utils.getRandom(0, Calc.operator.length)];

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



