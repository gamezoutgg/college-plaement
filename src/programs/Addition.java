package programs;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double result = firstNumber + secondNumber;
        System.out.println("Addition = " + result);

        scanner.close();
    }
}
