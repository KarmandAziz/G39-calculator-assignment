package org.example;

public class Calcswitch {

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
                System.out.println("operator " + operator + " is not supported");
        }
        return result;
    }
}
