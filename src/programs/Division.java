package programs;

import java.util.Scanner;


public class Division {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();

        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            double result = dividend / divisor;
            System.out.println("Division = " + result);
        }

        scanner.close();
    }
}
