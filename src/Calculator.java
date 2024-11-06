import java.util.Scanner;

// Calculator that allows addition, subtraction, multiplication, division and exponential.

public class Calculator {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to my Calculator");

        System.out.println("Enter first value: ");
        double value1 = scanner.nextDouble();

        System.out.println("Enter second value: ");
        double value2 = scanner.nextDouble();

        System.out.println("Enter operation (a for addition, s for subtraction, m for multiplication, d for division, e for exponential): ");
        char opCode = scanner.next().toLowerCase().charAt(0);

        double result;


        switch (opCode){
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                if (value2 != 0) {
                    result = value1 / value2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            case 'e':
                result = Math.pow(value1, value2);
                break;
            default:
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
            break;
        }
        System.out.println("Result: " + result);
    }
}
