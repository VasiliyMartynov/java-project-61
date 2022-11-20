package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;
public class Engine {
    public static final int NUMBERS_OF_GAMES = 3;
    public static final int MAX_RANDOM_NUMBER = 100;
    public static final int MIN_RANDOM_NUMBER = 1;
    private static String userName = "";
    private static String[][] gameData = {};
    public static void greetings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
    public static void startGame(String game) {
        Engine.prepareGame(game);
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        int countOfCorrectAnswers = 0;
        for (int i = 0; i < gameData.length; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            userAnswer = scanner.next();
            if (userAnswer.equals(gameData[i][gameData[i].length - 1])) {
                System.out.println("Correct!");
                countOfCorrectAnswers++;
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + gameData[i][gameData[i].length - 1] + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
        if (countOfCorrectAnswers == NUMBERS_OF_GAMES) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    public static void prepareGame(String game) {
        switch (game) {
            case "1 - Greet":
                Engine.greetings();
                System.exit(0);
                break;
            case "2 - Even":
                Engine.greetings();
                Even.rules();
                gameData = Even.setGameData();
                break;
            case "3 - Calc":
                Engine.greetings();
                Calc.rules();
                gameData = Calc.setGameData();
                break;
            case "4 - GCD":
                Engine.greetings();
                GCD.rules();
                gameData = GCD.setGameData();
                break;
            case "5 - Progression":
                Engine.greetings();
                Progression.rules();
                gameData = Progression.setGameData();
                break;
            case "6 - Prime":
                Engine.greetings();
                Prime.rules();
                gameData = Prime.setGameData();
                break;
            case "0 - Exit":
                System.exit(0);
                break;
            default:
                break;
        }
    }
    public static int getRandomNumberFromRange(int minRandomNumber, int maxRandomNumber) {
        return (int) ((Math.random() * (maxRandomNumber - minRandomNumber)) + minRandomNumber);
    }
    public static int getRandomNumberFromRange() {
        return (int) ((Math.random() * (MAX_RANDOM_NUMBER - MIN_RANDOM_NUMBER)) + MIN_RANDOM_NUMBER);
    }
}
