package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void rules() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }
    public static String[][] setGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Engine.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Engine.getRandomNumberFromRange(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            int randomNumber2 = Engine.getRandomNumberFromRange(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
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
