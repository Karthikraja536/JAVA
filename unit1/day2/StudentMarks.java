import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Marks:");
        int marks = scanner.nextInt();

        if(marks >= 90)
            System.out.println("Grade:A");
        else if(marks >=80 && marks < 90)
            System.out.println("Grade:B");
        else if(marks >= 70 && marks <80)
            System.out.println("Grade:C");
        else if(marks >= 60 && marks <70)
            System.out.println("Grade:D");
        else
            System.out.println("Fail");

    }
}
