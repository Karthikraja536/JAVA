import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the size of the multiplication Table:");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++) {
                System.out.print((i * j) + " ");
            }
                System.out.println();

        }
    }
}
