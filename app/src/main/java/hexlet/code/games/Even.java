package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Settings;
import hexlet.code.Utils;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        Engine.startEngine(RULES, sendGameData());
    }

    public static String[][] sendGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Settings.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = Utils.getRandomNumberFromRange();
            gameData[i][0] = String.valueOf(randomNumber);
            int number = Integer.parseInt(gameData[i][0]);
            if (isNumbersEven(number)) {
                gameData[i][1] = "yes";
            } else {
                gameData[i][1] = "no";
            }
        }
        return gameData;
    }
    public static Boolean isNumbersEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }


}
