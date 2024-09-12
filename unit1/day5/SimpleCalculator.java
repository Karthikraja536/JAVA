import java.util.Scanner;

class Calculator {

    float add(float num1, float num2) {
        return num1 + num2;
    }

    float subtract(float num1, float num2) {
        return num1 - num2;
    }

    float multiply(float num1, float num2) {
        return num1 * num2;
    }

    float divide(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String continueCalculation;

        do {
            System.out.print("Enter the first number: ");
            float num1 = scanner.nextFloat();

            System.out.print("Enter the second number: ");
            float num2 = scanner.nextFloat();

            System.out.println("Select an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int choice = scanner.nextInt();

            float result = 0;

            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }

            if (choice >= 1 && choice <= 4) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            continueCalculation = scanner.next();

        } while (continueCalculation.equalsIgnoreCase("yes"));

        System.out.println("Calculator program terminated.");

    }
}
