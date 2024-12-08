package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String userName = "";

    public static void greetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }

    /**
     * @param gameRules just simple string with game rules
     * @param gameData 2D array count of rows is number of games
     *                 1st column question data, 2nd column answer
     *
     * @return zero
     *
     * engine are comparing  user input with gameData answer column
     */
    public static int startEngine(String gameRules, String[][] gameData) {
        greetings();
        System.out.println(gameRules);

        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        for (int i = 0; i < gameData.length; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();
            if (userAnswer.equals(gameData[i][gameData[i].length - 1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + gameData[i][gameData[i].length - 1] + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                return 0;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        return 0;
    }


}
