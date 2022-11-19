package hexlet.code;

import java.util.Scanner;

final class Cli {
    public static void gretings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");

    }

}
