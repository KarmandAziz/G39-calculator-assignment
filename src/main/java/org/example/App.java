package org.example;


import java.util.Scanner;


public class App {

    public static final String Intro = " CALCULATOR";

    public static double calculate(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    result = 0;
                }
                break;
            default:
                System.out.println("operator " + operator + " is either not supported");
        }
        return result;
    }


    public static void main(String[] args) {

        /* I'm sorry if it's not KISS.
           I'm not done yet, will experiment further
           and try to include the optional parts
           of the assignment going forward.
         */


        System.out.println(Intro);

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner inputOperator = new Scanner(System.in);
        Scanner opQuit = new Scanner (System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter a number");
            double num1 = Double.parseDouble(input1.nextLine());
            System.out.println("Enter a number");
            double num2 = Double.parseDouble(input2.nextLine());
            System.out.println("Enter a operator");
            String operator = inputOperator.nextLine();
            double result = calculate(num1, num2, operator);
            System.out.println(result);
            System.out.println("Do you wish to continue? Input: Yes / No");
            String stopReset = opQuit.next();
            if (stopReset.equals("No"))
                System.out.println("Goodbye!");
            running = stopReset.equals("Yes");
        }


        }




}








