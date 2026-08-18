package com.college.placement.javafundamentals;

/** Demonstrates accessing an instance variable inside an instance method. */
public class InstanceVariableDemo {
    int a = 20;

    void m1(int b) {
        System.out.println("Method parameter b: " + b);
        System.out.println("Instance variable a: " + a);
    }

    public static void main(String[] args) {
        InstanceVariableDemo test = new InstanceVariableDemo();
        test.m1(4);
    }
}
