import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Current balance:");
                int current = scanner.nextInt();

                System.out.print("Withdrawal amount:");
                int debit = scanner.nextInt();


                float newbalance = current - debit;

                if(debit < current)
                    System.out.print("Withdrawal successful. New balance:"+ " " + newbalance);
                else
                    System.out.println("Error: Insufficient balance");
            }
        }
    



