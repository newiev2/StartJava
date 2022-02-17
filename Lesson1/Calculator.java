public class Calculator {
    public static void main(String[] args) {
        //Программа-калькулятор. Выполняет операцию, хранящуюся в operator, над целочисленными положительными операндами operand1 и operand2
        System.out.println("Программа-калькулятор. Выполняет операцию, хранящуюся в operator, над целочисленными положительными операндами operand1 и operand2");

        int operand1 = 50;
        int operand2 = 1;
        char operator = '(';
        double operationResult = 0;
        boolean isExists = true;

        System.out.println("Operand1 = " + operand1 + "\n \r" + "Operand2 = " + operand2 + "\n \r" + "Operator = " + operator);

        if(operator == '+') {
            operationResult = operand1 + operand2;
        } else if(operator == '-') {
            operationResult = operand1 - operand2;
        } else if(operator == '*') {
            operationResult = operand1 * operand2;
        } else if(operator == '/') {
            if(operand2 == 0) {
                isExists = false;
            } else {
                operationResult = operand1 / operand2;
            }
        } else if(operator == '^') {
            if(operand2 == 0) {
                operationResult = 1;
            } else if(operand2 == 1) {
                operationResult = operand1;
            } else {
                operationResult = operand1;
                for(int i = 2; i <= operand2; i++) {
                    operationResult = operationResult * operand1;
                }
            }
        } else if(operator == '%') {
            operationResult = operand1 % operand2;
        } else {
            isExists = false;
        }

        if(isExists) {
            System.out.println("Результат операции " + operand1 + "" + operator + "" + operand2 + " равен " + operationResult);
        } else {
            System.out.println("Операция " + operand1 + "" + operator + "" + operand2 + " не существует либо вы пытаетесь делить на ноль");
        }
    }
}