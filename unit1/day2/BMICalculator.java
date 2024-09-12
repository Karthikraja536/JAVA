import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight:");
        int weight = scanner.nextInt();

        System.out.print("Height:");
        double height = scanner.nextDouble();

        double bmi = weight/(height*height);
        System.out.printf("BMICalculator: %.2f" ,bmi);

        if(bmi < 18.5)
            System.out.println(", " + "Category: Underweight");
        else if(bmi >=18.5 && bmi <25)
            System.out.println(", " + "Category: Normalweight");
        else if(bmi >= 25 && bmi <30)
            System.out.println(", " + "Category: Overweight");
        else
            System.out.println(", " + "Category: Obesity");


    }
}
