package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int a;
    private static int b;
    private static char operator;

    public static int calculate(String mathExpression) {
        parseExpression(mathExpression);
        try {
            if(a >= 0 && b >= 0) {
                return switch(operator) {
                    case '+' -> Math.addExact(a, b);
                    case '-' -> Math.subtractExact(a, b);
                    case '*' -> Math.multiplyExact(a, b);
                    case '/' -> Math.floorDiv(a, b);
                    case '^' -> (int) Math.pow(a, b);
                    case '%' -> Math.floorMod(a, b);
                    default -> {
                        yield  0;
                    }
                };
            } else {
                throw new IllegalArgumentException("Operand should be a positive number");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    private static void parseExpression(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");
            a = Integer.parseInt(partsExpression[0]);
            b = Integer.parseInt(partsExpression[2]);
            operator = partsExpression[1].charAt(0);
    }
}