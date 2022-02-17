public class Calculator {
    public static void main(String[] args) {
        //Программа-калькулятор. Выполняет операцию, хранящуюся в operator, над целочисленными положительными операндами operand1 и operand2
        System.out.println("Программа-калькулятор. Выполняет операцию, хранящуюся в operator, над целочисленными положительными операндами operand1 и operand2");

        int operand1 = 4;
        int operand2 = 4;
        char operator = '^';
        double result = 0;
        boolean isExists = true;

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
            if(operand2 == 0) {
                result = 1;
            } else if(operand2 == 1) {
                result = operand1;
            } else {
                result = operand1;
                for(int i = 2; i <= operand2; i++) {
                    result *= operand1;
                }
            }
        } else if(operator == '%') {
            result = operand1 % operand2;
        } else {
            isExists = false;
        }

        if(isExists) {
            System.out.println("Результат операции " + operand1 + "" + operator + "" + operand2 + " равен " + result);
        } else {
            System.out.println("Вы ввели недопустимую операцию " + operator);
        }
    }
}