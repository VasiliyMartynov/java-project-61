package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice = 99;
        while (userChoice != 0) {
            showMenu();
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    Engine.gretings();
                    break;
                case 2:
                    Engine.startGame(2); //Even
                    break;
                case 3:
                    Engine.startGame(3); //Calc
                    break;
                case 0:
                    System.exit(0);
                default:
                    showMenu();
            }
        }
    }
    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        String[] menuItems = {"1 - Greet", "2 - Even", "3 - Calc", "0 - Exit"};
        for (int item = 0; item < menuItems.length; item++) {
            System.out.println(menuItems[item]);
        }
        System.out.print("Your choice: ");
    }
}
