import java.util.Scanner;

public class SkipEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer:");
        int num = scanner.nextInt();

        System.out.println("Odd numbers from 1 to" + " " + num + " " + ":");

        for(int i=1; i<=num; i++){

            if(i % 2 == 0)
                continue;

            System.out.print(i + " ");

        }


    }
}
