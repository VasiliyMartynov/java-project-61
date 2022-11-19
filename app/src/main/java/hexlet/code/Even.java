package hexlet.code;
//import java.lang.Math;
import java.util.Scanner;
public class Even {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        int countOfCorrectAnswers = 0;
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
        String[][] gameData = getGameData();
        for (int i = 0; i < gameData.length; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();
            if (userAnswer.equals(gameData[i][1])) {
                System.out.println("Correct!");
                countOfCorrectAnswers++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + gameData[i][1] + ".");
                System.out.println("Let's try again, " + userName);
                break;
            }

        }
        if (countOfCorrectAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
    private static String[][] getGameData() {
        var maxRandomNumber = 100;
        var minRandomNumber = 1;
        var numbersOfGames = 3;
        String[][] result = new String[numbersOfGames][2];
        for (int i = 0; i < result.length; i++) {
            int randomNumber = (int) ((Math.random() * (maxRandomNumber - minRandomNumber)) + minRandomNumber);
            result[i][0] = String.valueOf(randomNumber);
            if (Integer.parseInt(result[i][0]) % 2 == 0) {
                result[i][1] = "yes";
            } else {
                result[i][1] = "no";
            }
        }
        return result;
    }
}
