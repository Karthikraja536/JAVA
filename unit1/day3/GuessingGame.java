import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Can you guess what it is?");
        int Random = rand.nextInt(100) + 1;
        do {

            System.out.print("Enter your guess:");
            int Guess = scanner.nextInt();

            if(Random == Guess) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            }
            else if(Guess > Random) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }
        } while (true);



    }
}
