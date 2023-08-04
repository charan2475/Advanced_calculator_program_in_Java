import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Advanced Calculator!");
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /, ^, %, sqrt, abs, sin, cos, tan, log, ln, !, //, 10^, 2^): ");
        String operator = scanner.next();

        double result = 0.0;

        switch (operator) {
            case "+":
                System.out.println("Enter the second number: ");
                double num2 = scanner.nextDouble();
                result = num1 + num2;
                break;
            case "-":
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                break;
            case "*":
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                break;
            case "/":
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            case "^":
                System.out.println("Enter the exponent: ");
                double exponent = scanner.nextDouble();
                result = Math.pow(num1, exponent);
                break;
            case "%":
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    return;
                }
                result = num1 % num2;
                break;
            case "sqrt":
                if (num1 < 0) {
                    System.out.println("Error: Square root of a negative number is not allowed.");
                    return;
                }
                result = Math.sqrt(num1);
                break;
            case "abs":
                result = Math.abs(num1);
                break;
            case "sin":
                result = Math.sin(Math.toRadians(num1));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(num1));
                break;
            case "tan":
                if (Math.abs(num1 % 180) == 90) {
                    System.out.println("Error: Tangent is undefined for this angle.");
                    return;
                }
                result = Math.tan(Math.toRadians(num1));
                break;
            case "log":
                if (num1 <= 0) {
                    System.out.println("Error: Logarithm is undefined for non-positive numbers.");
                    return;
                }
                result = Math.log10(num1);
                break;
            case "ln":
                if (num1 <= 0) {
                    System.out.println("Error: Natural logarithm is undefined for non-positive numbers.");
                    return;
                }
                result = Math.log(num1);
                break;
            case "!":
                if (num1 < 0) {
                    System.out.println("Error: Factorial is undefined for negative numbers.");
                    return;
                }
                result = factorial((int) num1);
                break;
            case "//":
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 == 0) {
                    System.out.println("Error: Floor division by zero is not allowed.");
                    return;
                }
                result = Math.floor(num1 / num2);
                break;
            case "10^":
                result = Math.pow(10, num1);
                break;
            case "2^":
                result = Math.pow(2, num1);
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Result: " + result);
    }

    private static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
