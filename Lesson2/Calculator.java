public class Calculator {

    private int firstOperand;
    private int secondOperand;
    private char operator;
    private int result;

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setOperator(char operator) {
        if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^' || operator == '%') {
            this.operator = operator;
        } else {
            System.out.println("Math operation is incorrect");
        }
    }

    public char getOperator() {
        return operator;
    }

    public int calculate() {
        switch(operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if(secondOperand == 0) {
                    System.out.println("Dividing to zero is prohibited");
                } else {
                    result = firstOperand / secondOperand;
                }
                break;
            case '^':
                result = 1;
                for(int i = 0; i < secondOperand; i++) {
                    result *= firstOperand;
                }
                break;
            case '%':
                result = firstOperand % secondOperand;
                break;
        }
        return result;
    }
}