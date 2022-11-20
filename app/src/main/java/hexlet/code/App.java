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
                    Engine.startGame(userChoice); //Even
                    break;
                case 3:
                    Engine.startGame(userChoice); //Calc
                    break;
                case 4:
                    Engine.startGame(userChoice); //Calc
                    break;
                case 5:
                    Engine.startGame(userChoice); //Calc
                    break;
                case 0:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        String[] menuItems = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "0 - Exit"};
        for (int item = 0; item < menuItems.length; item++) {
            System.out.println(menuItems[item]);
        }
        System.out.print("Your choice: ");
    }
}
