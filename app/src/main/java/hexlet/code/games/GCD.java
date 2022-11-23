package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Settings;
import hexlet.code.Utils;

public class GCD {
    public static void start() {
        Engine.startEngine(sendRules(), sendGameData());
    }

    public static String sendRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] sendGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Settings.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Utils.getRandomNumberFromRange();
            int randomNumber2 = Utils.getRandomNumberFromRange();
            gameData[i][0] = randomNumber1 + " " + randomNumber2;
            gameData[i][1] = Integer.toString(gcd(randomNumber1, randomNumber2));
        }
        return gameData;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
