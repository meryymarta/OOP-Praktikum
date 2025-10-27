
import java.util.Scanner;

public class KalkulatorStruktural {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        
        System.out.print("Enter the first number : ");
        double number1 = input12.nextDouble();

        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input12.next().charAt(0);

        
        System.out.print("Enter the second number : ");
        double number2 = input12.nextDouble();

        double result = 0;
        boolean valid = true;

        
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("invalid operator!");
                valid = false;
        }

        
        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}

