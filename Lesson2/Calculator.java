public class Calculator {

    private int firstOperand;
    private int secondOperand;
    private char operator;

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void setOperator(char operator) {
        if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^' || operator == '%') {
            this.operator = operator;
        } else {
            System.out.println("Math operation is incorrect");
        }
    }

    public int calculate() {
        switch(operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if(secondOperand == 0) {
                    System.out.println("Dividing to zero is prohibited");
                    break;
                }
                return firstOperand / secondOperand;
            case '^':
                int result = 1;
                for(int i = 0; i < secondOperand; i++) {
                    result *= firstOperand;
                }
                return result;
            case '%':
                return firstOperand % secondOperand;
        }
        return 0;
    }
}