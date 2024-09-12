import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer:");
        int num = scanner.nextInt();
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact *= i;
        }

        if(fact < 0)
            System.out.println("Enter a non-negative integer!");
        else
            System.out.println("Factorial of " + num + " " + "is" + " " + fact);
    }
}
