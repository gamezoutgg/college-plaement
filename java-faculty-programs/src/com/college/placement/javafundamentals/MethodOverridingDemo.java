package com.college.placement.javafundamentals;

/** Demonstrates runtime polymorphism through method overriding. */
public class MethodOverridingDemo extends Parent {
    @Override
    void marry() {
        System.out.println("Campus-selected girl/boy");
    }

    public static void main(String[] args) {
        MethodOverridingDemo test = new MethodOverridingDemo();
        test.marry();
        test.property();
    }
}
