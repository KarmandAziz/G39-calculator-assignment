package org.example;

import java.util.Scanner;

public class InputUtil {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String AGAIN_WITH_NUMBERS = "Input format wrong. Try again with numbers!";

    public static String stringFromUser(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextLine();
    }

    public static int intFromUser(String prompt) {
        int number = 0;
        boolean wrongNumber = true;
        while(wrongNumber) {
            System.out.println(prompt);
            try{
                number = Integer.parseInt(SCANNER.nextLine());
                wrongNumber = false;
            }catch (NumberFormatException ex) {
                System.out.println(AGAIN_WITH_NUMBERS);
            }
        }
        return number;
    }
}
