package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {
    public static void rules() {
        System.out.println("What is the result of the expression?");
    }
    public static String[][] setGameData() { //[0] - question, [length-1] - answer
        var maxRandomNumber = 100;
        var minRandomNumber = 1;
        var maxOperations = 3;

        String[][] gameData = new String[Engine.NUMBERSOFGAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Engine.getRandomNumberFromRange(minRandomNumber, maxRandomNumber);
            int randomNumber2 = Engine.getRandomNumberFromRange(minRandomNumber, maxRandomNumber);
            int randomOperation = Engine.getRandomNumberFromRange(minRandomNumber, maxOperations);
            var question = "";
            var answer = "";
            switch (randomOperation) {
                case 1: // *
                    question = randomNumber1 + " * " + randomNumber2;
                    answer = Integer.toString(randomNumber1 * randomNumber2);
                    break;
                case 2: // +
                    question = randomNumber1 + " + " + randomNumber2;
                    answer = Integer.toString(randomNumber1 + randomNumber2);
                    break;
                case 3: // -
                    question = randomNumber1 + " - " + randomNumber2;
                    answer = Integer.toString(randomNumber1 - randomNumber2);
                    break;
                default:
                    break;
            }
            gameData[i][0] = question;
            gameData[i][1] = answer;
        }
        return gameData;
    }
}
