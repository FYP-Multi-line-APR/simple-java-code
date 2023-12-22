package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Advanced Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Percentage");
            System.out.println("7. Modulus");
            System.out.println("8. Power");
            System.out.println("9. Sin");
            System.out.println("10. Cos");
            System.out.println("11. Tan");
            System.out.println("12. Logarithm");
            System.out.println("13. Exponential");
            System.out.println("14. Quit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            try {
                System.out.print("Enter first operand: ");
                double operand1 = scanner.nextDouble();

                System.out.print("Enter second operand: ");
                double operand2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(operand1, operand2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(operand1, operand2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(operand1, operand2));
                        break;
                    case 4:
                        System.out.println("Result: " + divide(operand1, operand2));
                        break;
                    case 5:
                        System.out.println("Result: " + squareRoot(operand1));
                        break;
                    case 6:
                        System.out.println("Result: " + percentage(operand1));
                        break;
                    case 7:
                        System.out.println("Result: " + modulus(operand1, operand2));
                        break;
                    case 8:
                        System.out.println("Result: " + power(operand1, operand2));
                        break;
                    case 9:
                        System.out.println("Result: " + sin(operand1));
                        break;
                    case 10:
                        System.out.println("Result: " + cos(operand1));
                        break;
                    case 11:
                        System.out.println("Result: " + tan(operand1));
                        break;
                    case 12:
                        System.out.println("Result: " + log(operand1));
                        break;
                    case 13:
                        System.out.println("Result: " + exp(operand1));
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 14.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // Clear the input buffer
            }
        }

        scanner.close();
    }

    /**
     * Adds two numbers.
     *
     * @param a First operand
     * @param b Second operand
     * @return The sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param a First operand
     * @param b Second operand
     * @return The result of subtracting b from a
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a First operand
     * @param b Second operand
     * @return The product of a and b
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second number.
     *
     * @param a Numerator
     * @param b Denominator
     * @return The result of dividing a by b
     * @throws ArithmeticException If the denominator is zero
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    /**
     * Calculates the square root of a given number.
     *
     * @param a The number for which the square root is calculated.
     * @return The square root of the input number.
     * @throws ArithmeticException If the input number is negative, as the square root of
     *                             a negative number is not defined in the real number system.
     */
    public static double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }

    /**
     * Calculates the percentage value of a given number.
     *
     * @param a The number for which the percentage is calculated.
     * @return The percentage value of the input number.
     */
    public static double percentage(double a) {
        return a / 100;
    }

    /**
     * Calculates the modulus (remainder) of dividing one number by another.
     *
     * @param a The dividend (the number to be divided).
     * @param b The divisor (the number by which the dividend is divided).
     * @return The remainder when dividing the dividend by the divisor.
     * @throws ArithmeticException If the divisor is zero, as division by zero is undefined.
     */
    public static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot calculate modulus with zero divisor.");
        }
        return a % b;
    }

    /**
     * Calculates the result of raising a base to a specified exponent.
     *
     * @param base     The base number.
     * @param exponent The exponent to which the base is raised.
     * @return The result of raising the base to the exponent.
     */
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Calculates the sine of an angle specified in degrees.
     *
     * @param angleInDegrees The angle in degrees.
     * @return The sine of the given angle.
     */
    public static double sin(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    /**
     * Calculates the cosine of an angle specified in degrees.
     *
     * @param angleInDegrees The angle in degrees.
     * @return The cosine of the given angle.
     */
    public static double cos(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }

    /**
     * Calculates the tangent of an angle specified in degrees.
     *
     * @param angleInDegrees The angle in degrees.
     * @return The tangent of the given angle.
     */
    public static double tan(double angleInDegrees) {
        return Math.tan(Math.toRadians(angleInDegrees));
    }

    /**
     * Calculates the logarithm (base 10) of a positive number.
     *
     * @param a The positive number for which the logarithm is calculated.
     * @return The logarithm (base 10) of the input number.
     * @throws ArithmeticException If the input number is non-positive, as logarithms of non-positive numbers are undefined.
     */
    public static double log(double a) {
        if (a <= 0) {
            throw new ArithmeticException("Cannot calculate logarithm for non-positive number.");
        }
        return Math.log10(a);
    }

    /**
     * Calculates the exponential function (e^x) for a given number.
     *
     * @param a The exponent for the exponential function.
     * @return The result of raising the mathematical constant 'e' to the power of the input exponent.
     */
    public static double exp(double a) {
        return Math.exp(a);
    }
}