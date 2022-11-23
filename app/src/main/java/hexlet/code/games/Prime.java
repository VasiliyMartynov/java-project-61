package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Settings;
import hexlet.code.Utils;

public class Prime {
    public static void start() {
        Engine.startEngine(sendRules(), sendGameData());
    }

    public static String sendRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] sendGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Settings.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Utils.getRandomNumberFromRange();
            gameData[i][0] = Integer.toString(randomNumber1);
            gameData[i][1] = isPrime(randomNumber1);
        }
        return gameData;
    }

    public static String isPrime(int number) {
        int num;
        for (int i = 2; i <= number / 2; i++) {
            num = number % i;
            if (num == 0) {
                return "no";
            }
        }
        return "yes";

    }
}
