package com.startjava.lesson_1.finale;

public class Calculator {
    public static void main(String[] args) {
        //Программа-калькулятор. Выполняет операцию, хранящуюся в operator, над целочисленными положительными операндами operand1 и operand2
        System.out.println("Программа-калькулятор. Выполняет операцию, хранящуюся в operator, над целочисленными положительными операндами operand1 и operand2");
        int operand1 = 5;
        int operand2 = 1;
        char operator = '^';
        double result = 0;
        if(operator == '+') {
            result = operand1 + operand2;
        } else if(operator == '-') {
            result = operand1 - operand2;
        } else if(operator == '*') {
            result = operand1 * operand2;
        } else if(operator == '/') {
            if(operand2 == 0) {
                System.out.println("Деление на 0 запрещено");
            } else {
                result = operand1 / operand2;
            }
        } else if(operator == '^') {
            result = 1;
            for(int i = 0; i < operand2; i++) {
                result *= operand1;
            }
        } else if(operator == '%') {
            result = operand1 % operand2;
        } else {
            System.out.println("Вы ввели недопустимый знак " + operator);
            return;
        }
        System.out.println("Результат операции " + operand1 + "" + operator + "" + operand2 + " равен " + result);
    }
}