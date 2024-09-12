import java.util.Scanner;

public class PassORFail {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Marks:");
        int marks = scanner.nextInt();

        String result = ( marks >=50) ? "Pass":"Fail";
        System.out.println(result);
    }
}
