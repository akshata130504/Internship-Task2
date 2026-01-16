import java.util.Scanner;

/*
 * Task 2: Variables, Data Types & Console Input
 */

public class CalculatorDemo {

    // Static variable (shared across all objects)
    static String appName = "Console Calculator";

    // Instance variable (belongs to object)
    int instanceCounter = 0;

    public static void main(String[] args) {

        // Local variables (inside method)
        byte b = 10;            // 1 byte
        short s = 100;          // 2 bytes
        int i = 1000;           // 4 bytes
        long l = 100000L;       // 8 bytes
        float f = 10.5f;        // 4 bytes
        double d = 99.99;       // 8 bytes
        char c = 'A';           // 2 bytes
        boolean flag = true;    // 1 bit (logical)

        System.out.println("=== " + appName + " ===");

        // Scanner for console input
        Scanner sc = new Scanner(System.in);

        // Accepting user input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose operation (+ - * /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean valid = true;

        // Arithmetic operations with validation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                    valid = false;
                }
                break;

            default:
                System.out.println("Invalid operator selected.");
                valid = false;
        }

        // Formatted output
        if (valid) {
            System.out.printf("Result: %.2f %c %.2f = %.2f%n",
                    num1, operator, num2, result);
        }

        // Type casting examples
        int castedInt = (int) d;   // Explicit casting
        double autoCast = i;       // Implicit casting

        System.out.println("\nType Casting Examples:");
        System.out.println("Double to int: " + castedInt);
        System.out.println("Int to double: " + autoCast);

        sc.close();
    }
}
