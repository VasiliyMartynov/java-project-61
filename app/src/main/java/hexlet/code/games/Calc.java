package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Settings;
import hexlet.code.Utils;
import java.util.Random;

public class Calc {
    public static void start() {
        Engine.startEngine(sendRules(), sendGameData());
    }

    public static String sendRules() {
        return "What is the result of the expression?";
    }

    public static String[][] sendGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Settings.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Utils.getRandomNumberFromRange();
            int randomNumber2 = Utils.getRandomNumberFromRange();
            var answer = "";
            Random r = new Random();
            String operations = "*+-";
            char randomOperation = operations.charAt(r.nextInt(operations.length()));
            switch (randomOperation) {
                case '*':
                    answer = Integer.toString(randomNumber1 * randomNumber2);
                    break;
                case '+':
                    answer = Integer.toString(randomNumber1 + randomNumber2);
                    break;
                case '-':
                    answer = Integer.toString(randomNumber1 - randomNumber2);
                    break;
                default:
                    break;
            }
            gameData[i][0] = randomNumber1 + " " + randomOperation + " " + randomNumber2;
            gameData[i][1] = answer;
        }
        return gameData;
    }
}
