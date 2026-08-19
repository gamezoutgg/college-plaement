package programs;

public class trydemo {

    public static void main(String[] args) {

        try {
            System.out.println("anand");
            System.out.println(10 / 0);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception handled");
        }

        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code");
    }
}