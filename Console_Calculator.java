import java.util.Scanner;

public class Console_Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("=== Java Console Calculator ===");

        while (continueCalc) {
            // Get inputs
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Perform calculation
            double result;
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /.");
            }

            // Continue?
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                continueCalc = false;
                System.out.println("Exiting Calculator. Goodbye!");
            }
        }

        sc.close();
    }
}
