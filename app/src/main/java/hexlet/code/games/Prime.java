package hexlet.code.games;
import hexlet.code.Engine;
public class Prime {
    public static int[] primeNumbers = {
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    public static void rules() {
        System.out.println("What number is missing in the progression?");
    }
    public static String[][] setGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Engine.NUMBERSOFGAMES][2];
        var maxRandomNumber = 100;
        var minRandomNumber = 1;
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Engine.getRandomNumberFromRange(minRandomNumber, maxRandomNumber);
            gameData[i][0] = Integer.toString(randomNumber1);
            gameData[i][1] = isPrime(randomNumber1);
        }
        return gameData;
    }
    public static String isPrime(int number) {
        if (contains(primeNumbers, number)) {
            return "yes";
        }
        return "no";
    }
    public static Boolean contains(int[] numbers, int num) {
        for (int number: numbers) {
            if (number == num) {
                return true;
            }
        }
        return false;
    }
}
