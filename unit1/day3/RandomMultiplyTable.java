import java.util.Random;
import java.util.Scanner;

public class RandomMultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new  Random();

        System.out.println("Welcome to the Multiplication Practice Program!");

        while(true){

            int num1 = rand.nextInt(10) + 1;
            int num2 = rand.nextInt(10) + 1;
            System.out.println("What is:" + num1 + "*" + num2 + "?");

            System.out.print("Enter your answer:");
            int input = scanner.nextInt();


            int ans = num1 * num2;

            if(input == ans)
                System.out.println("Correct!");
            else if(input == 0)
                break;
            else
                System.out.println("Incorrect.The correct answer is " + " " + ans);
        }
        System.out.println("Thank you for practicing multiplication!");




    }
}
