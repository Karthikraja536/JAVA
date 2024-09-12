import java.util.Scanner;
public class FirstDivisible {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the upper limit: ");
            int up = scanner.nextInt();
            System.out.print("Enter the divisor: ");
            int div = scanner.nextInt();

            for (int i = 1; i <= up; i++) {
                if (i % div == 0) {
                    System.out.println("The first number divisible by " + div + " is " + i + ".");
                    break;
                }
            }
        }
    }

