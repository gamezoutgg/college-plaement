package programs;

public class deadlock {

    public static void main(String[] args) {

        final Object lock1 = new Object();
        final Object lock2 = new Object();

        Thread t1 = new Thread(() -> {

            synchronized (lock1) {
                System.out.println("Thread 1: Lock 1");

                synchronized (lock2) {
                    System.out.println("Thread 1: Lock 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (lock2) {
                System.out.println("Thread 2: Lock 2");

                synchronized (lock1) {
                    System.out.println("Thread 2: Lock 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}