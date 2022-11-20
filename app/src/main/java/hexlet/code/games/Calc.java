package hexlet.code.games;
import hexlet.code.Engine;
public class Calc {
    private static final int MAX_OPERATIONS = 3;
    public static void rules() {
        System.out.println("What is the result of the expression?");
    }
    public static String[][] setGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Engine.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Engine.getRandomNumberFromRange(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            int randomNumber2 = Engine.getRandomNumberFromRange(Engine.MIN_RANDOM_NUMBER, Engine.MAX_RANDOM_NUMBER);
            int randomOperation = Engine.getRandomNumberFromRange(Engine.MIN_RANDOM_NUMBER, MAX_OPERATIONS);
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
