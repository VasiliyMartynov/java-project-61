package hexlet.code.games;
import hexlet.code.Engine;
public class Even {

    public static void rules() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String[][] setGameData() { //[0] - question, [length-1] - answer
        var maxRandomNumber = 100;
        var minRandomNumber = 1;

        String[][] gameData = new String[Engine.NUMBERSOFGAMES][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = Engine.getRandomNumberFromRange(minRandomNumber, maxRandomNumber);
            gameData[i][0] = String.valueOf(randomNumber);
            if (Integer.parseInt(gameData[i][0]) % 2 == 0) {
                gameData[i][1] = "yes";
            } else {
                gameData[i][1] = "no";
            }
        }
        return gameData;
    }


}
