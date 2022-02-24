import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculation = new Calculator();
        Scanner input = new Scanner(System.in);
        String answer = "";
        do {
            System.out.print("Enter value of the first operand: ");
            calculation.setFirstOperand(input.nextInt());
            System.out.print("Enter math operation: ");
            calculation.setOperator(input.next().charAt(0));
            System.out.print("Enter value of the second operand: ");
            calculation.setSecondOperand(input.nextInt());
            System.out.println("Result of the operation: " + calculation.calculate());
            input.nextLine();
            do {
                System.out.print("Do you want to try again? [yes/no]: ");
                answer = input.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}