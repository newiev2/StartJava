import java.util.*;

public class GuessNumberTest {

    public static void main(String[] args) {
        String answer = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("First player, enter your name:");
        Player firstPlayer = new Player(scan.nextLine());
        System.out.println("Second player, enter your name:");
        Player secondPlayer = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

        do {
            game.startGame();
            do {
                System.out.print("Do you want to try again? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}