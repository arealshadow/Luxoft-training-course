package com.luxoft.jva007.Calculator;
import java.util.Scanner;

public class CalculatorMaths {
    public static void myCalc() {
        String operand1 = "1";
        String operand2 = "2";
        double num1 = Double.parseDouble(operand1);
        double num2 = Double.parseDouble(operand2);
        double result = num1 + num2;
        System.out.println("Initializing simple operation:");
        System.out.println("1 + 2 = "+result);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        int operand3 = input.nextInt();
        System.out.println("You've entered "+ operand3 + ", another number please");
        int operand4 = input.nextInt();
        System.out.println("You've entered "+ operand4);

        System.out.println("Enter operation");
        String operation = input.next();

        switch (operation){
            case "+":
                System.out.println(operand3 + operand4);
                break;
            case "-":
                System.out.println(operand3 - operand4);
                break;
            case "*":
                System.out.println(operand3 * operand4);
                break;
            case "/":
                System.out.println(operand3 / operand4);
                break;
                default:
                    System.out.println("Error, that is not a valid input.");
                    break;
        }

    }
}
