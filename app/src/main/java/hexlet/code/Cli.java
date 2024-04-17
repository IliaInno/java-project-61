package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;
    public static void greetings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        System.out.printf("Hello, %s!", sc.next());
    }

}
