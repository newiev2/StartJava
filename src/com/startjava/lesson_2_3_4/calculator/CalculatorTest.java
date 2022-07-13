package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            //Entering math expression
            System.out.print("Enter math expression: ");
            String mathExpression = input.nextLine();
            try {
                //Printing calculation result
                System.out.println("Expression result = " + Calculator.calculate(mathExpression));
            } catch(NumberFormatException e) {
                System.out.println("Operand should be an integer number. Enter correct value");
            } catch(ArithmeticException e) {
                System.out.println("Dividing to zero is prohibited");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            do {
                System.out.print("Do you want to try again? [yes/no]: ");
                answer = input.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}