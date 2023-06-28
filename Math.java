public class MathOperation {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // Addition
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        int quotient = num1 / num2;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);

        // Increment
        int incrementedNum = num1++;
        System.out.println("Incremented Number: " + incrementedNum);

        // Decrement
        int decrementedNum = num2--;
        System.out.println("Decremented Number: " + decrementedNum);

        // Maximum
        int max = Math.max(num1, num2);
        System.out.println("Maximum: " + max);

        // Minimum
        int min = Math.min(num1, num2);
        System.out.println("Minimum: " + min);

        // Absolute value
        int absoluteValue = Math.abs(-10);
        System.out.println("Absolute Value: " + absoluteValue);

        // Square root
        double squareRoot = Math.sqrt(16);
        System.out.println("Square Root: " + squareRoot);

        // Random number
        double randomNumber = Math.random();
        System.out.println("Random Number: " + randomNumber);
    }
}
