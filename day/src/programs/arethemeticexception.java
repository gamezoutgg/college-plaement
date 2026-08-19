package programs;

import java.util.Scanner;

public class arethemeticexception {

    static void validate(int age) {

        if (age < 18) {
            throw new ArithmeticException("Not eligible for voting");
        } else {
            System.out.println("Welcome to voting");
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your age");
        int n = s.nextInt();

        validate(n);

        System.out.println("Rest of the code");

        s.close();
    }
}