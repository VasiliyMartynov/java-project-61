package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import java.util.Scanner;
public class Engine {
    public static final int NUMBERSOFGAMES = 3;
    static String userName = "";
    static int countOfCorrectAnswers = 0;
    static String[][] gameData = {};
    ///////////
    public static void gretings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.next();
        System.out.println("Hello, " + userName + "!");
    }
    ///////////
    public static void startGame(int game) {
        Scanner scanner = new Scanner(System.in);
        String userAnswer;
        Engine.gretings();
        switch (game) {
            case 2:
                Even.rules();
                gameData = Even.setGameData(); //[0] - question, [length-1] - answer
                break;
            case 3:
                Calc.rules();
                gameData = Calc.setGameData(); //[0] - question, [length-1] - answer
                break;
            case 4:
                GCD.rules();
                gameData = GCD.setGameData(); //[0] - question, [length-1] - answer
                break;
            default:
                break;
        }
        countOfCorrectAnswers = 0;
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
                System.out.println("Let's try again, " + userName);
                break;
            }
        }
        if (countOfCorrectAnswers == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
    ///////////
    public static int getRandomNumberFromRange(int minRandomNumber, int maxRandomNumber) {
        return (int) ((Math.random() * (maxRandomNumber - minRandomNumber)) + minRandomNumber);
    }
}
