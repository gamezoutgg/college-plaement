package programs;

import java.util.Scanner;

class BankAccount {

    private int balance = 5000;

    void withdraw(int amount) {

        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
    }

    int getBalance() {
        return balance;
    }
}

public class codea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 18) {
                throw new IllegalArgumentException(
                        "You must be 18 or above");
            }

            System.out.print("Enter withdrawal amount: ");
            int amount = Integer.parseInt(sc.nextLine());

            BankAccount account = new BankAccount();

            account.withdraw(amount);

            System.out.println("Final Balance: ₹"
                    + account.getBalance());
        }

        catch (NumberFormatException e) {
            System.out.println("Please enter numbers only.");
        }

        catch (IllegalArgumentException e) {
            System.out.println(
                    "Invalid input: " + e.getMessage());
        }

        catch (ArithmeticException e) {
            System.out.println(
                    "Transaction failed: " + e.getMessage());
        }

        finally {
            sc.close();
        }
    }
}