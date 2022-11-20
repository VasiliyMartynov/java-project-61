package hexlet.code;
import java.util.Scanner;
public class App {
    public static String[] menuItems = {
        "1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        int userChoice = scanner.nextInt();
        if (userChoice == 0) {
            Engine.startGame(menuItems[6]);
        } else {
            Engine.startGame(menuItems[userChoice - 1]);
        }
    }
    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        for (String item: menuItems) {
            System.out.println(item);
        }
        System.out.print("Your choice: ");
    }
}
