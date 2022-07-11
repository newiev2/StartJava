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
                //Parsing string expression to parameters
                Calculator.parseExpressionToParams(mathExpression);

                //Printing calculation result
                System.out.println("Expression result = " + Calculator.calculate());
            } catch(NumberFormatException e) {
                System.out.println("Operand should be integer number. Enter correct value");
            } catch(ArithmeticException e1) {
                System.out.println("Dividing to zero is prohibited");
            }

            do {
                System.out.print("Do you want to try again? [yes/no]: ");
                answer = input.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}