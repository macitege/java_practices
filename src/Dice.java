import java.util.Scanner;
import java.util.Random;
import java.lang.String;

public class Dice {

    int diceOne;
    int diceTwo;

    public void init () {
        System.out.println("Welcome to nicer dicer!");
        System.out.println("To roll the dice, type roll and hit enter.");
        this.getCommandFromUser();
    }

    public void roll () {
        Random rand = new Random();
        diceOne = rand.nextInt(6) + 1;
        diceTwo = rand.nextInt(6) + 1;
        System.out.println("You rolled " + diceOne + " and " + diceTwo);
        System.out.println("Type roll to play again, exit to end the game.");
        this.getCommandFromUser();

    }

    public void getCommandFromUser () {
        Scanner sc = new Scanner(System.in);
        String command = sc.next();

        if (command.equals("roll")) {
            this.roll();
        } else if (command.equals("exit")) {
            System.out.println("Thanks for playing! Bye!");
        } else {
            System.out.println("Invalid command, try again.");
            this.getCommandFromUser();
        }
    }
}
