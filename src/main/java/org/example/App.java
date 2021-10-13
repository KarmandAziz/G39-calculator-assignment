package org.example;


import java.util.Scanner;

import static org.example.Calcswitch.calculate;


public class App {

    public static final String INTRO = " CALCULATOR";




    public static void main(String[] args) {

        /* I'm sorry if it's not KISS.
           I'm not done yet, will experiment further
           and try to include the optional parts
           of the assignment going forward.
         */

        calculatorAssignment();





        }
public static void calculatorAssignment(){
    System.out.println(INTRO);

    Scanner scanner = new Scanner(System.in);
    Scanner resetProgram = new Scanner (System.in);
    boolean running = true;

    while (running) {
        System.out.println("Enter a number");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter a operator");
        String operator = scanner.nextLine();
        System.out.println("Enter a number");
        double num2 = Double.parseDouble(scanner.nextLine());
        double result = calculate(num1, num2, operator);
        System.out.println(result);
        System.out.println("Do you wish to continue? Yes / No");
        String reset = resetProgram.next();
        if (reset.equals("No"))
            System.out.println("Goodbye!");
        running = reset.equals("Yes");
    }
}



}








