package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Calc {
    public static void rules() {
        System.out.println("What is the result of the expression?");
    }
    public static String[][] setGameData() { //[0] - question, [length-1] - answer
        String[][] gameData = new String[Engine.NUMBERS_OF_GAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber1 = Engine.getRandomNumberFromRange();
            int randomNumber2 = Engine.getRandomNumberFromRange();
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
            gameData[i][0] = randomNumber1 + " " + String.valueOf(randomOperation) + " " + randomNumber2;
            gameData[i][1] = answer;
        }
        return gameData;
    }
}
