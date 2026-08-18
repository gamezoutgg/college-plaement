package com.college.placement.javafundamentals;

/** Demonstrates adding instance variables and method parameters. */
public class AdditionDemo {
    int a = 20;
    int b = 10;

    void m1(int c, int d) {
        System.out.println("Sum of instance variables: " + (a + b));
        System.out.println("Sum of method parameters: " + (c + d));
    }

    public static void main(String[] args) {
        AdditionDemo test = new AdditionDemo();
        test.m1(4, 3);
    }
}
