package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int firstOperand;
    private static int secondOperand;
    private static char operator;

    public static void parseExpressionToParams (String mathExpression) throws IllegalArgumentException {
        String[] expressionParams = mathExpression.split(" ");
            if(Integer.parseInt(expressionParams[0]) >= 0 && Integer.parseInt(expressionParams[2]) >= 0) {
                firstOperand = Integer.parseInt(expressionParams[0]);
                secondOperand = Integer.parseInt(expressionParams[2]);
                operator = expressionParams[1].charAt(0);
            } else {
                throw new IllegalArgumentException("Operand should be a positive number");
            }
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