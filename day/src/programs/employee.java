package programs;

import java.util.Scanner;

class EmployeeData {
    String name;
    int age;
    String designation;
    double salary = 30000;
}

public class employee {

    static Scanner sc = new Scanner(System.in);
    static EmployeeData e = new EmployeeData();

    static void create() {

        while (true) {

            System.out.print("Enter your name: ");
            e.name = sc.nextLine();

            while (e.name.isEmpty()) {
                System.out.println("Name cannot be empty!");
                System.out.print("Enter your name: ");
                e.name = sc.nextLine();
            }

            while (true) {
                System.out.print("Enter your age: ");
                e.age = sc.nextInt();
                sc.nextLine();

                if (e.age >= 18 && e.age <= 65) {
                    break;
                }

                System.out.println("Age must be between 18 and 65!");
            }

            while (true) {
                System.out.println("\n1. Hotel Manager");
                System.out.println("2. Receptionist");
                System.out.println("3. Chef");
                System.out.print("Select designation: ");

                int d = sc.nextInt();
                sc.nextLine();

                if (d == 1) {
                    e.designation = "Hotel Manager";
                    break;
                } else if (d == 2) {
                    e.designation = "Receptionist";
                    break;
                } else if (d == 3) {
                    e.designation = "Chef";
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }
            }

            System.out.println("\n--- Employee Details ---");
            System.out.println("Name: " + e.name);
            System.out.println("Age: " + e.age);
            System.out.println("Designation: " + e.designation);
            System.out.println("Salary: ₹" + e.salary);

            System.out.print("Do you want to edit? (yes/no): ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Employee saved!");
                break;
            }
        }
    }

    static void display() {

        if (e.name == null) {
            System.out.println("No employee records available.");
            return;
        }

        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Designation: " + e.designation);
        System.out.println("Salary: ₹" + e.salary);
    }

    static void raiseSalary() {

        if (e.name == null) {
            System.out.println("No employee records available.");
            return;
        }

        System.out.println("Current Salary: ₹" + e.salary);
        System.out.print("Enter salary raise: ₹");

        double raise = sc.nextDouble();
        sc.nextLine();

        if (raise > 0) {
            e.salary += raise;

            System.out.println("Salary updated!");
            System.out.println("New Salary: ₹" + e.salary);
        } else {
            System.out.println("Salary raise must be greater than 0!");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Hotel Employee Management =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                create();
            } else if (choice == 2) {
                display();
            } else if (choice == 3) {
                raiseSalary();
            } else if (choice == 4) {
                System.out.println("Thank you for using Hotel Employee Management!");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}