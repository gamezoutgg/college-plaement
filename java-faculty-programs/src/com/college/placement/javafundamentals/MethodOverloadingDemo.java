package com.college.placement.javafundamentals;

/** Demonstrates compile-time polymorphism through method overloading. */
public class MethodOverloadingDemo {
    void m1() {
        System.out.println("Method m1 without arguments");
    }

    void m1(int value) {
        System.out.println("Method m1 with value: " + value);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo test = new MethodOverloadingDemo();
        test.m1();
        test.m1(3);
    }
}
