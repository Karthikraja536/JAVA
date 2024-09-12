import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "karthik!666";

        while (true) {

            System.out.print("Enter Password:");
            String pass = scanner.next();

            if (pass.equals(password))
            {
                System.out.println("Password accepted");
                break;
            }
            else
            {
                    System.out.println("Incorrect Password. Try again.");
            }
        }
    }
}