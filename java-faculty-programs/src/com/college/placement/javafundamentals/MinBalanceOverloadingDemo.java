package com.college.placement.javafundamentals;

/** Demonstrates overloading with the minbal method name from the original code. */
public class MinBalanceOverloadingDemo {
    void minbal() {
        System.out.println("Minimum balance method without arguments");
    }

    void minbal(int amount) {
        System.out.println("Minimum balance: " + amount);
    }

    public static void main(String[] args) {
        MinBalanceOverloadingDemo test = new MinBalanceOverloadingDemo();
        test.minbal();
        test.minbal(3);
    }
}
