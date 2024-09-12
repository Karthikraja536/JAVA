import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value for n
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Initialize the sum
        int sum = 0;

        // Calculate the sum of the first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}