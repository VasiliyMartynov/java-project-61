package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Settings;
import hexlet.code.Utils;

/**
 * Игра "Простое ли число?".
 * В данной игре необходимо определить является ли число простым или нет
 * Простое число - натуральное (целое положительное) число,
 * имеющее ровно два различных натуральных делителя — единицу и самого себя
 */
public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        Engine.startEngine(RULES, sendGameData());
    }

    public static String[][] sendGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Settings.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Utils.getRandomNumberFromRange();
            gameData[i][0] = Integer.toString(randomNumber1);
            if (isPrime(randomNumber1)) {
                gameData[i][1] = "yes";
            } else {
                gameData[i][1] = "no";
            }
        }
        return gameData;
    }

    public static Boolean isPrime(int number) {
        var i = 0;
        var m = 0;
        int flag = 0;
        Boolean result = false;
        m = number / 2;
        if (number == 0 || number == 1) {
            result = false;
        } else {
            for (i = 2; i <= m; i++) {
                if (number % i == 0) {
                    result = false;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                result = true;
            }
        }
        return  result;
    }
}

