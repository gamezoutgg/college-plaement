package programs;

/**
 * Demonstrates the super keyword in Java:
 * 1. super()  - calls parent class constructor
 * 2. super.method() - calls parent class method
 * 3. super.field - accesses parent class field
 */
class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called with name: " + name);
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); // calls Animal()
        System.out.println("Dog constructor called");
    }

    Dog(String name) {
        super(name); // calls Animal(String)
        System.out.println("Dog constructor called with name: " + name);
    }

    @Override
    void eat() {
        System.out.println(name + " is eating dog food.");
    }

    void showDetails() {
        System.out.println("Child name  : " + name);
        System.out.println("Parent name : " + super.name); // super.field
    }

    void callParentEat() {
        super.eat(); // super.method()
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        System.out.println("=== super keyword demo ===");
        System.out.println();

        System.out.println("--- Default constructors ---");
        Dog dog1 = new Dog();
        System.out.println();

        System.out.println("--- Parameterized constructors ---");
        Dog dog2 = new Dog("Bruno");
        System.out.println();

        System.out.println("--- Method overriding vs super.method() ---");
        dog2.eat();
        dog2.callParentEat();
        System.out.println();

        System.out.println("--- super.field vs child field ---");
        dog2.showDetails();
        System.out.println();

        System.out.println("--- Inherited method (no override) ---");
        dog2.sleep();
    }
}
