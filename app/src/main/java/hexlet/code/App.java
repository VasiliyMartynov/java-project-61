package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    private static final int EXIT_CODE = 6;
    private static final String[] MENU_ITEMS = {
        "1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int userChoice = scanner.nextInt();
        if (userChoice == 0) {
            startGame(MENU_ITEMS[EXIT_CODE]);
        } else {
            startGame(MENU_ITEMS[userChoice - 1]);
        }
    }

    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (String item : MENU_ITEMS) {
            System.out.println(item);
        }
        System.out.print("Your choice: ");

    }
    public static void startGame(String game) {
        switch (game) {
            case "1 - Greet":
                Engine.greetings();
                System.exit(0);
                break;
            case "2 - Even":
                Even.start();
                break;
            case "3 - Calc":
                Calc.start();
                break;
            case "4 - GCD":
                GCD.start();
                break;
            case "5 - Progression":
                Progression.start();
                break;
            case "6 - Prime":
                Prime.start();
                break;
            case "0 - Exit":
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
