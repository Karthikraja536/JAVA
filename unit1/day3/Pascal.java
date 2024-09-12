import java.util.Scanner;
public class Pascal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of rows for Pascal's Triangle: ");
            int num = scanner.nextInt();

            for (int i = 0; i < num; i++) {
                int val = 1;

                for (int k= 0; k < num - i - 1; k++) {
                    System.out.print(" ");
                }

                for (int j = 0; j <= i; j++) {
                    System.out.print(val + " ");
                    val = val * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }

