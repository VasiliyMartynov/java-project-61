package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int userChoice = scanner.nextInt();
        if (userChoice == 0) {
            Engine.gretings();
        } else {
            Engine.startGame(userChoice);
        }
    }
    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        String[] menuItems = {
            "1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};
        for (int item = 0; item < menuItems.length; item++) {
            System.out.println(menuItems[item]);
        }
        System.out.print("Your choice: ");
    }
}
