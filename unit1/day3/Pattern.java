import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of levels for the pyramid: ");
        int num = scanner.nextInt();


        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
