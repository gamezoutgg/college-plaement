package programs;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();

        if (numberOfTerms <= 0) {
            System.out.println("Please enter a positive number of terms.");
        } else {
            long firstNumber = 0;
            long secondNumber = 1;

            System.out.print("Fibonacci series: ");
            for (int i = 1; i <= numberOfTerms; i++) {
                System.out.print(firstNumber);

                if (i < numberOfTerms) {
                    System.out.print(" ");
                }

                long nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }
            System.out.println();
        }

        scanner.close();
    }
}
