package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Settings;
import hexlet.code.Utils;

public class Calc {
    private static final String RULES = "What is the result of the expression?";

    public static void start() {
        Engine.startEngine(RULES, sendGameData());
    }

    public static String[][] sendGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Settings.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Utils.getRandomNumberFromRange();
            int randomNumber2 = Utils.getRandomNumberFromRange();
            char[] operations = {'*', '+', '-'};
            char randomOperation = operations[Utils.getRandomNumberFromRange(0, operations.length)];
            var answer = showCalculatedString(randomOperation, randomNumber1, randomNumber2);
            gameData[i][0] = randomNumber1 + " " + randomOperation + " " + randomNumber2;
            gameData[i][1] = answer;
        }
        return gameData;
    }

    private static String showCalculatedString(char operation, int number1, int number2) {
        String result = "";
        switch (operation) {
            case '*':
                result = Integer.toString(number1 * number2);
                break;
            case '+':
                result = Integer.toString(number1 + number2);
                break;
            case '-':
                result = Integer.toString(number1 - number2);
                break;
            default:
                break;
        }
        return result;
    }
}
