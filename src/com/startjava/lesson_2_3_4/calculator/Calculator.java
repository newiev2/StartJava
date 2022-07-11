package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int firstOperand;
    private static int secondOperand;
    private static char operator;

    public static void parseExpressionToParams(String mathExpression) {
        String[] expressionParams = mathExpression.split(" ");
        firstOperand = Integer.parseInt(expressionParams[0]);
        operator = expressionParams[1].charAt(0);
        secondOperand = Integer.parseInt(expressionParams[2]);
    }

    public static int calculate() {
        return switch(operator) {
            case '+' -> Math.addExact(firstOperand, secondOperand);
            case '-' -> Math.subtractExact(firstOperand, secondOperand);
            case '*' -> Math.multiplyExact(firstOperand, secondOperand);
            case '/' -> Math.floorDiv(firstOperand, secondOperand);
            case '^' -> (int) Math.pow(firstOperand, secondOperand);
            case '%' -> Math.floorMod(firstOperand, secondOperand);
            default -> {
                System.out.println("Incorrect math operation");
                yield 0;
            }
        };
    }
}