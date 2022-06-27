import java.util.*;

public class GuessNumber {

    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void startGame () {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int computedNumber = random.nextInt(100) + 1;

        while(true) {
            System.out.println(firstPlayer.getName() + ", your turn to guess number. Enter it here:");
            firstPlayer.setNumber(input.nextInt());
            if(firstPlayer.getNumber() > 0 & firstPlayer.getNumber() <= 100) {
                if(firstPlayer.getNumber() == computedNumber) {
                    System.out.println("Congratulations! " + firstPlayer.getName() + " have won!");
                    break;
                } else if(firstPlayer.getNumber() < computedNumber) {
                    System.out.println("Your number is less than computer's number");
                } else if(firstPlayer.getNumber() > computedNumber) {
                    System.out.println("Your number is greater than computer's number");
                }
            } else {
                System.out.println("You have entered incorrect number. It should be greater than 0 and less than 101.");
            }
            System.out.println(secondPlayer.getName() + ", your turn to guess number. Enter it here:");
            secondPlayer.setNumber(input.nextInt());
            if(secondPlayer.getNumber() > 0 & secondPlayer.getNumber() <= 100) {
                if(secondPlayer.getNumber() == computedNumber) {
                    System.out.println("Congratulations! " + secondPlayer.getName() + " have won!");
                    break;
                } else if(secondPlayer.getNumber() < computedNumber) {
                    System.out.println("Your number is less than computer's number");
                } else if(secondPlayer.getNumber() > computedNumber) {
                    System.out.println("Your number is greater than computer's number");
                }
            } else {
                System.out.println("You have entered incorrect number. It should be greater than 0 and less than 101.");
            }
        }
    }
}